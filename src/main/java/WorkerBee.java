package main.java;

/**
 * workerBee class is a decorator class of the bee
 * super class.
 * @author jbee2 - Justin Bee
 * @version 1122/2018
 *
 */
public class WorkerBee extends Bee {
    
    /**
     * default constructor for the worker bee.
     */
    public WorkerBee() {
        this.life = 50;
        this.strength = 1;
        this.hunger = 50;
        this.harvest = 1;
        this.build = 5;
        this.type = "worker";
    }

}
