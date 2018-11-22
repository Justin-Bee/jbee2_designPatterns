package main.java;

/**
 * Apiary class - only one instance of apiary is allowed to exist.
 * Singleton class
 * capable of spawning an unlimited number of beehives
 * 
 * @author jbee2 - Justin Bee
 * @version 11/22/18
 *
 */
public class Apiary {

    private static Apiary apiary = new Apiary();

    private Apiary() {
        System.out.println("apiary singleton");
    }

    public static Apiary getInstance() {
        return apiary;
    }

    //methods should be protected


}
