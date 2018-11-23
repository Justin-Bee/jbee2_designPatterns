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
    
    private String type;
    private int life;
    private int strength;
    private int hunger;
    
    public Bee(String type) {
        this.type = type;
        if (type.equals("worker")) {
            this.life = 50;
            this.strength = 1;
            this.hunger = 50;
        } else if (type.equals("harvester")) {
            this.life = 50;
            this.strength = 1;
            this.hunger = 100;
        } else if (type.equals("warrior")) {
            this.life = 100;
            this.strength = 3;
            this.hunger = 25;
        } else if (type.equals("queen")) {
            this.life = 500;
            this.strength = 5;
            this.hunger = 200;         
        }
    }
    
    public void eat () {
        this.hunger = this.hunger + 50;
    }

}
