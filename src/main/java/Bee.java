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
    
    protected String type;  //to hold initial type of bee
    protected int life;    //for the life (HP) of the bee
    protected int strength;  //for the fighting strength of bee
    protected int hunger;  //hunger or rest need of bee
    protected int harvest;  //harvest ability of bee
    protected int build;   //build ability of bee
    protected boolean alive;
    
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
     * eat - when bee rests gains more hunger points
     */
    public void eat() {
        this.hunger = this.hunger + 50;
    }
    
    /**
     * fight - method where 2 bees fight loser of fight gets 
     * alive set to false.
     * @param bee - Bee for the other bee which its fighting
     */
    public void fight(Bee bee) {
        while (this.life != 0 || bee.life !=0) {
            bee.life = bee.life - this.strength;
            this.life = this.life - bee.strength;
        }
        if (this.life == 0) {
            this.alive = false;
        } else {
            bee.alive = false;
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

