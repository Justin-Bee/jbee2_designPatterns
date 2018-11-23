package main.java;

/**
 * warriorBee class is a decorator class of the bee
 * super class.
 * @author jbee2 - Justin Bee
 * @version 1122/2018
 *
 */
public class warriorBee extends Bee {
    
    /**
     * default constructor for the warrior bee.
     */
    public warriorBee() {
        this.life = 100;
        this.strength = 5;
        this.hunger = 50;
        this.harvest = 1;
        this.build = 1;
        this.type = "warrior";
    }

}
