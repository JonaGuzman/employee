package org.beings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.factory.PersonFactory;
import org.singleton.Worker;
import org.junit.Test;

/**
 * Unit test for Person Project.
 */
public class PersonTest
{
    Person canadianPerson = new CanadianPerson("Drake", 34, "Canada");

    @Test
    public void shouldHaveLocationsMatch() {
        assertEquals("Assert that Drake location is Canada",
                "Canada", Worker.getInstance().getAnyonesLocaiton(canadianPerson));
    }

    @Test
    public void shouldHaveAgesMatch() {
        assertTrue("Assert that Drakes age is 34",
                (Worker.getInstance().getAnyonesAge(canadianPerson) == 34));
    }

    @Test
    public void shouldHaveNamesMatch() {
        assertEquals("Assert that Drake name is Drake",
                "Drake", Worker.getInstance().getAnyonesName(canadianPerson));
    }

    @Test
    public void testToStringMethod() {
        assertEquals(canadianPerson.toString(),"Drake\t34\tCanada" );
    }

    @Test
    public void testPersonFactory() {
        PersonFactory personFactory = new PersonFactory();
        Person asianPerson = personFactory.getPerson("Asia");
        asianPerson.setLocation("China");

        Person spanishPerson = personFactory.getPerson("South America");
        spanishPerson.setLocation("Venezuela");

        Person canadianPerson = personFactory.getPerson("North America");
        canadianPerson.setLocation("Canada");

        assertTrue((asianPerson.getLocation().equals("China") &&
                spanishPerson.getLocation().equals("Venezuela") &&
                canadianPerson.getLocation().equals("Canada")));
    }
}
