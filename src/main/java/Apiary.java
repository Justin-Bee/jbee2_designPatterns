package main.java;

import java.util.ArrayList;

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
    ////create an array list of beehives
    private ArrayList<Beehive> beehive = new ArrayList<Beehive>(); 
    private int hiveCounter = 0; //count number of hives in list

   
    private static Apiary apiary;  //for the apiary instance

    /**
     * Apiary - constructor.
     */
    private Apiary() {
        System.out.println("apiary singleton"); //TODO remove

    }

    /**
     * getInstance - returns the only instance of the apiary.
     * if another is attempted to be created prints message
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
        this.beehive.add(beehive);
        this.hiveCounter++;
    }

    
    protected void returnBeehive() {  //TODO remove
        System.out.println(this.beehive.get(0).print());
    }

}