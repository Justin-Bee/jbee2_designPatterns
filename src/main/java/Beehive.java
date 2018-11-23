package main.java;

import java.util.ArrayList;

/**
 * Beehive class - builder pattern.
 * comprised of a network of rooms
 * beehive can't contain another beehive
 * rooms are for spawning more bees
 * has only one species of bee
 * 
 * @author jbee2 - Justin Bee
 * @version 11/22/18
 *
 */
public class Beehive {
    
    ArrayList<String> beeType = new ArrayList<String>();
    ArrayList<Bee> bees = new ArrayList<Bee>();
    int ticks;
    int food;
    int room;
    
    
    public Beehive(String bType, int ticks, int food) {
       beeType.add(bType);
       this.ticks = ticks;
       this.food = food;
       this.room = 1;
       
    }
    
    public void spawnBee() {
        if(bees.size()==0) {
            bees.add(new queenBee());
        }
       
    }

  

    public String print() { //TODO remove
        return "beehive";
    }


    
}
