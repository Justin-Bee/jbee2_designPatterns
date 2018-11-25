package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ApiaryTest.class, BeeHiveTest.class, BeeTest.class, HiveBuilderTest.class })
public class AllTests {

}
