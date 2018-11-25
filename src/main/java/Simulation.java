package main.java;

/**
 * Simulation.java designed as a mediator pattern.
 * handles the simple simulation of the apiary, beehives and bee.
 * @author jbee2 - Justin Bee
 * @version 11/25/18
 */
public class Simulation {
    
    public Simulation() {
       
    }
    
    /**
     * runSim - runs the simple simulation.
     */
    public void runSim() {
        Apiary ap = Apiary.getInstance(); //for the singleton apiary instance
        //add a beehive to the apiary with params for builder class
        ap.addBeehive("warrior", 300);  
        //spawns the appropriate bee based on the type of hive
        ap.returnBeehive(0).spawnBee();
        //have the list of bees harvest food
        ap.returnBeehive(0).harvestFood(ap.returnBeehive(0).getBees());  
        //returns info about the selected beehive
        System.out.println(ap.returnBeehive(0).toString());
        ap.returnBeehive(0).spawnBee();
        ap.returnBeehive(0).spawnBee();
        ap.returnBeehive(0).harvestFood(ap.returnBeehive(0).getBees());
        System.out.println(ap.returnBeehive(0).toString());
        //adds a room to the hive
        ap.returnBeehive(0).addRoom(ap.returnBeehive(0).getBees());
        System.out.println(ap.returnBeehive(0).toString());
        
        
    }

}
