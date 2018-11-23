package main.java;

/**
 * Builder class for the Beehive class.
 * 
 * @author jbee2 - Justin Bee
 * @version 11/22/2018
 */
public class HiveBuilder {
    
    /**
     * BeeHive builder.
     * takes the parameters input and builds a new hive. 
     * @param bType - for the type of bees for the hive created
     * @param ticks - for the ticks in the hive
     * @param food - for the initial quantity of food for the hive
     * @return Beehive - a new beehive built with the parameters
     */
    public Beehive builder(String bType, int food) {
        return new Beehive(bType, food);
    }

}
