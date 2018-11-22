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

    private Beehive[] beehive = new Beehive [1000];
    private int hiveCounter = 0;


    private static Apiary apiary;

    /**
     * Apiary - constructor.
     */
    private Apiary() {
        System.out.println("apiary singleton"); //TODO remove

    }

    /**
     * getInstance - returns the only instance of the apiary.
     * @return apiary - the apiary instance
     */
    public static Apiary getInstance() {
        if (apiary == null) {
            apiary = new Apiary();
        } else {
            System.out.println("Instance already created");
        }
        return apiary;
    }

    //methods should be protected
    /**
     * addBeehive - adds a beehive to the array of beehives.
     * @param beehive - Beehive
     */
    protected void addBeehive(Beehive beehive) {
        this.beehive[hiveCounter] = beehive;
        this.hiveCounter++;
    }

    
    protected void returnBeehive() {
        System.out.println(beehive[0].print());
    }

}
