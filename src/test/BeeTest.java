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

}
