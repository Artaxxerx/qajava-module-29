import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTest {
    @DataProvider(name = "ageDataProvider")
    Object[][] ageDataProvider() {
        return new Object[][]{
                {12, false},
                {13, true},
                {14, true},
                {15, true},
                {16, true},
                {17, true},
                {18, true},
                {19, true},
        };
    }

    @Test(dataProvider = "ageDataProvider")
    public void PersonAgeTest(int age, boolean expected) {
        boolean result = Person.isTeenager(age);
        assertEquals(result, expected);
    }
}


