package main.java;

import java.util.Scanner;

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

        //  String input = "";
        //  Scanner scan = new Scanner(System.in);

        // while(input != "Q") {
        //  System.out.println("Enter commands Q to quit");
        //  input = scan.nextLine();



        Apiary ap = Apiary.getInstance();
        ap.addBeehive("worker", 100);
        ap.returnBeehive(0).spawnBee();
        ap.returnBeehive(0).harvestFood(ap.returnBeehive(0).getBees());
        ap.returnBeehive(0).toString();
    }



    // }

}
