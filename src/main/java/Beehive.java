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
 * @version 11/23/18
 *
 */
public class Beehive {

    String beeType;
    ArrayList<Bee> bees = new ArrayList<Bee>();
    private int ticks = 100;
    private int food;
    private int room;

    
    /**
     * constructor of the Beehive.
     * @param beeType - String for the type of bees
     * @param food - food for the initial quantity of food
     */
    public Beehive(String beeType, int food) {
        this.beeType = (beeType);
        this.food = food;
        this.room = 1; //set the initial number of rooms to 1
        spawnBee();
        
    }

    public Beehive() {
        
    }

    /**
     * spawnBee - spawns a new bee of the specified type of the hive.
     * if no bees are currently in the hive spawn a queen bee.
     */
    public void spawnBee() {
        if (bees.size() == 0) {
            bees.add(new QueenBee());
        } else {
            if (beeType.equals("warrior")) {
                bees.add(new WarriorBee());
            } else if (beeType.equals("worker")) {
                bees.add(new WorkerBee());
            } else if (beeType.equals("harvester")) {
                bees.add(new HarvesterBee());
            }
        }
        
    }

    /**
     * addRoom - method to build new rooms for the hive. 
     * @param bee - Arraylist of the bees to build the room
     */
    public void addRoom(ArrayList<Bee> bee) {
        while (ticks != 0) {
            for (int i = 0; i < bee.size(); i++) {
                //decrement ticks by the value of build attribute of bee
                ticks = ticks - bee.get(i).build;
                //building room takes away from bees hunger
                bee.get(i).hunger--;

            }
        }
        //call monitor hunger to check if any bees need rest
        monitorHunger(bee); 
        room++;
        ticks = 100;
    }

    /**
     * harvestFood takes the bees that are sent into it to add to the 
     * food supply based on the value of their harvest ability.
     * @param bee - Bee arraylist
     */
    public void harvestFood(ArrayList<Bee> bee) {
        for (int i = 0; i < bee.size(); i++) {
            food = food + bee.get(i).harvest;
        }
        
    }
    
    /**
     * getFood - returns the amount of food for the hive.
     * @return food - int food for the hive
     */
    public int getFood() {
        return food;
    }

    /**
     * monitorHunger watches the hunger levels of the bees.
     * calls restBee for bees that need to rest.
     * @param bee -ArrayList of bees
     */
    public void monitorHunger(ArrayList<Bee> bee) {

        for (int i = 0; i < bee.size(); i++) {
            if (bee.get(i).hunger <= 5) {
                restBee(bee.get(i));
            }
        }

    }
    
    /**
     * restBee calls the eat function in the bee resting.
     * also decrements the food quantity of hive.
     * @param bee - Bee
     */
    public void restBee(Bee bee) {
        bee.eat();
        this.food--;
    }
    
    /**
     * getNumBees - gets the number of bees in the hive.
     * @return bees.size() - returns the number of bees in the hive
     */
    public int getNumBees() {
        return bees.size();
    }
    
    /**
     * getBees - returns the array list of bees in the hive.
     * @return this.bees - returns the array list of bees 
     */
    public ArrayList<Bee> getBees() {
        return this.bees;
    }
    
    /**
     * getRooms - returns the number of rooms in the hive.
     * @return room - int value of the number of rooms
     */
    public int getRooms() {
        return room;
    }
    
    /**
     * toString returns a summary of the hive.
     */
    public String toString() { 
        return "Beehive type of bee: " + beeType + "\n" + " number of bees in hive: "
                + bees.size() + "\n" + " amount of food in hive: " + this.food + "\n"
                + " number of rooms: "
                + this.room + "\n";
    }



}
