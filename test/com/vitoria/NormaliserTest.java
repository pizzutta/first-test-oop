package com.vitoria;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class NormaliserTest {

    private Normaliser normaliser;

    @Before
    public void setup() {
        normaliser = new Normaliser();
    }

    @Test
    public void softwareEngineerMatchTest() {
        String input = "Java engineer";
        assertEquals(Normaliser.SOFTWARE_ENGINEER, normaliser.normalise(input));

        input = "C# engineer";
        assertEquals(Normaliser.SOFTWARE_ENGINEER, normaliser.normalise(input));

        input = "Software engineer";
        assertEquals(Normaliser.SOFTWARE_ENGINEER, normaliser.normalise(input));
    }

    @Test
    public void softwareEngineerNotMatchTest() {
        String input = "Software architect";
        assertNotEquals(Normaliser.SOFTWARE_ENGINEER, normaliser.normalise(input));

        input = "Chief Accountant";
        assertNotEquals(Normaliser.SOFTWARE_ENGINEER, normaliser.normalise(input));

        input = "Quantity surveyor";
        assertNotEquals(Normaliser.SOFTWARE_ENGINEER, normaliser.normalise(input));
    }

    @Test
    public void architectMatchTest() {
        String input = "Architect";
        assertEquals(Normaliser.ARCHITECT, normaliser.normalise(input));

        input = "Software architect";
        assertEquals(Normaliser.ARCHITECT, normaliser.normalise(input));

        input = "DevOps Architect";
        assertEquals(Normaliser.ARCHITECT, normaliser.normalise(input));
    }

    @Test
    public void architectNotMatchTest() {
        String input = "Java Engineer";
        assertNotEquals(Normaliser.ARCHITECT, normaliser.normalise(input));

        input = "Chief Accountant";
        assertNotEquals(Normaliser.ARCHITECT, normaliser.normalise(input));

        input = "Quantity surveyor";
        assertNotEquals(Normaliser.ARCHITECT, normaliser.normalise(input));
    }

    @Test
    public void accountantMatchTest() {
        String input = "Accountant";
        assertEquals(Normaliser.ACCOUNTANT, normaliser.normalise(input));

        input = "Chief Accountant";
        assertEquals(Normaliser.ACCOUNTANT, normaliser.normalise(input));

        input = "Staff Accountant";
        assertEquals(Normaliser.ACCOUNTANT, normaliser.normalise(input));
    }

    @Test
    public void accountantNotMatchTest() {
        String input = "Java Engineer";
        assertNotEquals(Normaliser.ACCOUNTANT, normaliser.normalise(input));

        input = "Software architect";
        assertNotEquals(Normaliser.ACCOUNTANT, normaliser.normalise(input));

        input = "Quantity surveyor";
        assertNotEquals(Normaliser.ACCOUNTANT, normaliser.normalise(input));
    }

    @Test
    public void quantitySurveyorMatchTest() {
        String input = "Quantity surveyor";
        assertEquals(Normaliser.QUANTITY_SURVEYOR, normaliser.normalise(input));

        input = "Quantity Inspector";
        assertEquals(Normaliser.QUANTITY_SURVEYOR, normaliser.normalise(input));

        input = "Quality Surveyor";
        assertEquals(Normaliser.QUANTITY_SURVEYOR, normaliser.normalise(input));
    }

    @Test
    public void quantitySurveyorNotMatchTest() {
        String input = "Java Engineer";
        assertNotEquals(Normaliser.QUANTITY_SURVEYOR, normaliser.normalise(input));

        input = "Software architect";
        assertNotEquals(Normaliser.QUANTITY_SURVEYOR, normaliser.normalise(input));

        input = "Chief accountant";
        assertNotEquals(Normaliser.QUANTITY_SURVEYOR, normaliser.normalise(input));
    }

    @Test
    public void noMatchesTest() {
        String input = "Java Developer";
        assertEquals("", normaliser.normalise(input));

        input = "DevOps Consultant";
        assertEquals("", normaliser.normalise(input));

        input = "Product Owner";
        assertEquals("", normaliser.normalise(input));
    }

}
