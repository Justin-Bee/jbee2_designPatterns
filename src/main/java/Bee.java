package main.java;

/**
 * Bee class - made using decorator
 * should be able to battle other bees
 * each species has a special attribute
 * 
 * @author jbee2 - Justin Bee
 * @version  11/22/18
 *
 */
public class Bee {
    
    protected String type;  //to hold initial type of bee
    protected int life;    //for the life (HP) of the bee
    protected int strength;  //for the fighting strength of bee
    protected int hunger;  //hunger or rest need of bee
    protected int harvest;  //harvest ability of bee
    protected int build;   //build ability of bee
    
    public Bee() {
        this.life = 50;
        this.strength = 1;
        this.hunger = 50;
        this.harvest = 1;
        this.build = 1;
    }
    
    public void eat () {
        this.hunger = this.hunger + 50;
    }
    
    

}

