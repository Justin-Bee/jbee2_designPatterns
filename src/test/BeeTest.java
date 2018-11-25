package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Bee;

public class BeeTest {

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
     * beeAliveTest - tests if bee is alive.
     */
    @Test
    public void beeAliveTest() {
        Bee bee = new Bee();
        assertTrue(bee.getAlive());
       
    }
    
    /**
     * beeLifeTest - tests the life of the bee.
     */
    @Test
    public void beeLifeTest() {
        Bee bee = new Bee();
        assertEquals(bee.getLife(), 50);
    }
    
    /**
     * beeGetStrengthTest - tests the strength.
     */
    @Test
    public void beeGetStrengthTest() {
        Bee bee = new Bee();
        assertEquals(bee.getStrength(), 1);
    }
    
    /**
     * beeGetHungerTest - tests the hunger of bee.
     */
    @Test
    public void beeGetHungerTest() {
        Bee bee = new Bee();
        assertEquals(bee.getHunger(), 50);
    }
    
    /**
     * beeGetHarvestTest - tests the harvest ability of bee.
     */
    @Test
    public void beeGetHarvestTest() {
        Bee bee = new Bee();
        assertEquals(bee.getHarvest(), 1);
    }
    
    /**
     * beeGetBuildTest - tests the build ability of bee. 
     */
    @Test
    public void beeGetBuildTest() {
        Bee bee = new Bee();
        assertEquals(bee.getBuild(), 1);
    }
    
    /**
     * beeFightTest - tests the fight method of bee. 
     */
    @Test
    public void beeFigthTest() {
        Bee bee = new Bee();
        Bee bee2 = new Bee();
        bee.fight(bee2);
        assertTrue(bee2.getAlive());
        
    }
}
