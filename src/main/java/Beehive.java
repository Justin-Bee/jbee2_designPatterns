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
    private int ticks;
    private int food;
    private int room;

    /**
     * default constructor of the Beehive.
     * @param bType - String for the type of bees
     * @param ticks - int for the ticks
     * @param food - food for the initial quantity of food
     */
    public Beehive(String bType, int ticks, int food) {
        beeType.add(bType);
        this.ticks = ticks;
        this.food = food;
        this.room = 1; //set the initial number of rooms to 1

    }

    /**
     * spawnBee - spawns a new bee of the specified type of the hive.
     * if no bees are currently in the hive spawn a queen bee.
     */
    public void spawnBee() {
        if (bees.size()==0) {
            bees.add(new queenBee());
        } else {
            if (beeType.get(0).equals("warrior")) {
                bees.add(new warriorBee());
            } else if (beeType.get(0).equals("worker")) {
                bees.add(new workerBee());
            } else if (beeType.get(0).equals("harvester")) {
                bees.add(new harvesterBee());
            }
        }

    }



    public String print() { //TODO remove
        return "beehive";
    }



}
