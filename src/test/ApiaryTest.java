package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Apiary;
import main.java.Beehive;

public class ApiaryTest {

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

    @Test
    public void numOfHives() {
        Apiary ap = Apiary.getInstance();
        ap.addBeehive("warrior", 100);
        assertEquals(ap.getNumHives(), 1);
    }

}
