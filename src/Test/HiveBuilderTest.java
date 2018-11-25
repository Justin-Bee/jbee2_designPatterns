package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.HiveBuilder;

/**
 * HiveBuilderTest - test class for the HiveBuilder class. 
 * @author jbee2 - Justin Bee
 * @version 11/24/2018
 */
public class HiveBuilderTest {

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
     * defaultConTest - tests the default constructor of the 
     * HiveBuilder class.
     */
    @Test
    public void defaultConTest() {
        HiveBuilder hb = new HiveBuilder();
        assertEquals(hb.getBeeType(), "worker");
        assertEquals(hb.getFood(), 100);
    }
    
    /**
     * setBeeTypeTest - tests the set bee type method.
     */
    @Test
    public void setBeeTypeTest() {
        HiveBuilder hb = new HiveBuilder();
        hb.setBeeType("queen"); //sets the type to queen
        assertEquals(hb.getBeeType(), "queen");
    }

    /**
     * setFoodTest - tests the set food method.
     */
    @Test 
    public void setFoodTest() {
        HiveBuilder hb = new HiveBuilder();
        hb.setFood(2000); //sets the food to 2000
        assertEquals(hb.getFood(), 2000);
    }
}
