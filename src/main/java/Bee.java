package main.java;

/**
 * Bee class - made using decorator.
 * should be able to battle other bees
 * each species has a special attribute
 * 
 * @author jbee2 - Justin Bee
 * @version  11/22/18
 *
 */
public class Bee {
    
    public String type;  //to hold initial type of bee
    protected int life;    //for the life (HP) of the bee
    protected int strength;  //for the fighting strength of bee
    protected int hunger;  //hunger or rest need of bee
    protected int harvest;  //harvest ability of bee
    protected int build;   //build ability of bee
    protected boolean alive; //to set if the bee is alive
    
    /**
     * default constructor for the bee.
     */
    public Bee() {
        this.life = 50;
        this.strength = 1;
        this.hunger = 50;
        this.harvest = 1;
        this.build = 1;
        this.alive = true;
    }
    
    /**
     * eat - when bee rests gains more hunger points.
     */
    public void eat() {
        this.hunger = this.hunger + 50;
    }
    
    /**
     * getLife - gets the life of the bee.
     * @return this.life - life of bee
     */
    public int getLife() {
        return this.life;
    }
    
    /**
     * getStrength - gets the strength of the bee.
     * @return this.strength - int strength of bee
     */
    public int getStrength() {
        return this.strength;
    }
    
    /**
     * getHunger - returns the hunger of the bee.
     * @return this.hunger - int hunger of bee
     */
    public int getHunger() {
        return this.hunger;
    }
    
    /**
     * getHarvest - returns the harvest ability.
     * @return this.harvest - int harvest ability
     */
    public int getHarvest() {
        return this.harvest;
    }
    
    /**
     * getBuild - returns the build ability of bee.
     * @return this.build - int build ability
     */
    public int getBuild() {
        return this.build;
    }
    
    /**
     * getAlive - returns boolean value true if alive
     * false for dead.
     * @return this.alive - boolean
     */
    public boolean getAlive() {
        return this.alive;
    }
    
    /**
     * setDead - sets the alive variable to false.
     */
    public void setDead() {
        this.alive = false;
    }
    
    /**
     * getType - gets the type of the bee.
     * @return
     */
    public String getType() {
        return this.type;
    }
    
    /**
     * fight - method where 2 bees fight loser of fight gets 
     * alive set to false.
     * @param bee - Bee for the other bee which its fighting
     */
    public void fight(Bee bee) {
        while (this.life != 0 || bee.life != 0) {
            bee.life = bee.life - this.strength;
            this.life = this.life - bee.strength;
        }
        if (bee.getLife() == 0) {
            bee.setDead();
        } else {
            this.setDead();
        }
        
        if (this.alive == true) {
            this.strength = this.strength + bee.strength;
            this.harvest = this.harvest + bee.harvest;
            this.build = this.build + bee.build;
        } else {
            bee.strength = bee.strength + this.strength;
            bee.harvest = bee.harvest + this.harvest;
            bee.build = bee.build + this.build;
        }
    }
    
    
    

}

