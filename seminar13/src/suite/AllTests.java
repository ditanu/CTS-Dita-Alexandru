package suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.AplicaDiscount;
import test.PachetTuristicTest;

@Suite.SuiteClasses({AplicaDiscount.class, PachetTuristicTest.class})

public class AllTests {
}
