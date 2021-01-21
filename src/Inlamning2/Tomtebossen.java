package Inlamning2;
import java.util.ArrayList;
import java.util.List;

public class Tomtebossen {

    public Tomtebossen(){
        DAO database = new DAO();
        List<Worker> allWorkers = database.getAllWorkers();

        String targetWorker = "Dammråttan";

        List<Worker> bosslistan = getAllBosses(targetWorker,allWorkers);
        System.out.println(bosslistan);
    }

    private List<Worker> getAllBosses(String targetWorker, List<Worker> allWorkers) {
        return getBossOfMe(findWorker(targetWorker,allWorkers), new ArrayList<>());
    }

    private List<Worker> getBossOfMe(Worker worker, List<Worker> workerList) {
        if(worker.getBoss() == null) return workerList;
        workerList.add(worker.getBoss());
        worker = worker.getBoss();
        return getBossOfMe(worker,workerList);
    }

    private Worker findWorker(String targetWorker, List<Worker> allWorkers){
        for (var worker:allWorkers) {
            if(worker.getName().equalsIgnoreCase(targetWorker))
                return worker;
        }
        return null;
    }

    public static void main(String[] args) {
        new Tomtebossen();
    }
}
