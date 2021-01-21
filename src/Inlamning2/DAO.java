package Inlamning2;

import java.util.ArrayList;
import java.util.List;

public class DAO {

    public Worker tomten = new Worker("Tomten");
    public Worker bladlusen = new Worker("Bladlusen");
    public Worker myran = new Worker("Myran");
    public Worker grasuggan = new Worker("Gråsuggan");
    public Worker dammrattan = new Worker("dammråttan");
    public Worker skumtomten = new Worker("Skumtomten");
    public Worker trotter = new Worker("Trötter");
    public Worker troger = new Worker("Tröger");
    public Worker blyger = new Worker("Blyger");
    public Worker glader = new Worker("Glader");
    public Worker raven = new Worker("Räven");
    public Worker haren = new Worker("Haren");
    public Worker nyckelpigan = new Worker("Nyckelpigan");
    public Worker radjuret = new Worker("Rådjuret");
    public Worker butter = new Worker("Butter");

    public DAO(){

        dammrattan.setBoss(skumtomten);
        skumtomten.setBoss(trotter);
        trotter.setBoss(glader);
        troger.setBoss(glader);
        blyger.setBoss(glader);
        glader.setBoss(tomten);
        bladlusen.setBoss(myran);
        myran.setBoss(raven);
        grasuggan.setBoss(raven);
        raven.setBoss(butter);
        radjuret.setBoss(butter);
        haren.setBoss(butter);
        nyckelpigan.setBoss(butter);
        butter.setBoss(tomten);


    }

    public List<Worker> getAllWorkers(){
        List<Worker> allWorkers = new ArrayList<>();
        allWorkers.add(dammrattan);
        allWorkers.add(skumtomten);
        allWorkers.add(trotter);
        allWorkers.add(troger);
        allWorkers.add(blyger);
        allWorkers.add(glader);
        allWorkers.add(bladlusen);
        allWorkers.add(myran);
        allWorkers.add(grasuggan);
        allWorkers.add(tomten);
        allWorkers.add(raven);
        allWorkers.add(radjuret);
        allWorkers.add(haren);
        allWorkers.add(nyckelpigan);
        allWorkers.add(butter);

        return allWorkers;
    }
}
