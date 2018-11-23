package main.java;

/**
 * queenBee class is a decorator class of the bee
 * super class.
 * @author jbee2 - Justin Bee
 * @version 1122/2018
 *
 */
public class queenBee extends Bee{

    /**
     * default constructor for the queen bee.
     */
    public queenBee() {
        this.life = 200;
        this.strength = 5;
        this.hunger = 200;
        this.harvest = 1;
        this.build = 1;
        this.type = "queen";
    }

}
