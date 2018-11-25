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

   
    /**
     * addBeehive - adds a beehive to the array of beehives.
     * @param type - String
     * @param food - int
     */
    public void addBeehive(String type, int food) {
        HiveBuilder hb = new HiveBuilder();
        hb.setBeeType(type);
        hb.setFood(food);
        this.beehive.add(hb.builder());
        this.hiveCounter++;
    }

    /**
     * getNumHives returns number of hives in apiary.
     * @return beehive.size() - returns size of list
     */
    public int getNumHives() {
        return beehive.size();
    }

    /**
     * Returns the beehive at given index.
     * @param x - int 
     * @return beehive - returs the beehive
     */
    public Beehive returnBeehive(int x) {  
        return beehive.get(x);
    }
    
 
}
