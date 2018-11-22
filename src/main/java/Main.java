package main.java;

/**
 * Main class instantiates the other classes of the system.
 * @author jbee2 - Justin Bee
 * @version 11/22/18
 *
 */
public class Main {

    /**
     * main.
     * @param args - String args
     */
    public static void main(String[] args) {
        
        Apiary ap = Apiary.getInstance();
        
        Beehive beehive = new Beehive();
        ap.addBeehive(beehive);
        ap.returnBeehive();

    }

}
