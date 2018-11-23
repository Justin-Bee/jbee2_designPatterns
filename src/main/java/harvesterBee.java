package main.java;

/**
 * harvesterBee class is a decorator class of the bee
 * super class.
 * @author jbee2 - Justin Bee
 * @version 1122/2018
 *
 */
public class harvesterBee extends Bee {
    
    /**
     * default constructor for the harvester bee.
     */
    public harvesterBee() {
        this.life = 100;
        this.strength = 1;
        this.hunger = 150;
        this.harvest = 5;
        this.build = 1;
        this.type = "harvester";
    }

}
