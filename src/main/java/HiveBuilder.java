package main.java;

/**
 * Builder class for the Beehive class.
 * 
 * @author jbee2 - Justin Bee
 * @version 11/22/2018
 */
public class HiveBuilder {
    
    public Beehive builder(String bType, int ticks, int food) {
        return new Beehive(bType, ticks, food);
    }

}
