package test;

import static org.junit.Assert.*;

import main.java.Beehive;
import main.java.HiveBuilder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class BeeHiveTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * spawnBeeTest - tests the spawnBee method.
     */
    @Test
    public void spawnBeeTest() {
        HiveBuilder hb = new HiveBuilder();
        hb.setBeeType("warrior");
        hb.setFood(100);
        Beehive bh = hb.builder();
        bh.spawnBee();
        //should be 2 because queen is spawned at creation of hive
        assertEquals(bh.getNumBees(), 2); 
    }
    
    /**
     * addRoomTest - test the add room method.
     */
    @Test
    public void addRoomTest() {
        HiveBuilder hb = new HiveBuilder();
        hb.setBeeType("harvester");
        hb.setFood(100);
        Beehive bh = hb.builder();
        bh.spawnBee();
        bh.addRoom(bh.getBees());
        //should be 2 since 1 room was made at the creation of hive
        assertEquals(bh.getRooms(), 2);
    }
    
    /**
     * harvestFoodTest - tests the harvest food method.
     */
    @Test
    public void harvestFoodTest() {
        HiveBuilder hb = new HiveBuilder();
        hb.setBeeType("worker");
        hb.setFood(100);
        Beehive bh = hb.builder();
        bh.spawnBee();
        bh.harvestFood(bh.getBees());
        assertTrue(bh.getFood() > 100);
    }


}
