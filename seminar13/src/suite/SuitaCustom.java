package suite;

import categorii.Categorie1;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.AplicaDiscount;
import test.PachetTuristicTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AplicaDiscount.class, PachetTuristicTest.class})
//@IncludeTags({"tag1", "tag2"})
public class SuitaCustom {
}
