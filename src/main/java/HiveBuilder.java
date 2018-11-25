package main.java;

/**
 * Builder class for the Beehive class.
 * 
 * @author jbee2 - Justin Bee
 * @version 11/24/2018
 */
public class HiveBuilder {
    
    private String beeType;
    private int food;
    
    /**
     * default constructor for HiveBuilder class.
     * sets the default beetype to worker
     * and the default food to 100
     */
    public HiveBuilder() {
        this.beeType = "worker";
        this.food = 100;
    }
    
    /**
     * setBeeType sets the type of bee.
     * @param bType - String for the beetype
     */
    public void setBeeType(String beeType) {
        this.beeType = beeType;
    }
    
    /**
     * getBeeType gets the type of bee.
     * @return this.beeType - returns the type of bee
     */
    public String getBeeType() {
        return this.beeType;
    }
    
    /**
     * setFood sets the amount of food for the hive.
     * @param food - int sets the amount of food for the hive
     */
    public void setFood(int food) {
        this.food = food;
    }
    
    /**
     * getFood returns the amount of food for the hive.
     * @return this.food - amount of food for the hive
     */
    public int getFood() {
        return this.food;
    }
    
    /**
     * BeeHive builder.
     * takes the parameters input and builds a new hive. 
     * @return Beehive - a new beehive built with the parameters
     */
    public Beehive builder() {
        return new Beehive(beeType, food);
    }

}
