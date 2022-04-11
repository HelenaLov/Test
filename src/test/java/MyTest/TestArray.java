package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class TestArray {
    @Test
    public void simpleArrayExample() {
        String[] numbers0234 = {"zero", "one", "two", "three"};
        for (String numbersText : numbers0234) {
            System.out.println(numbersText);
        }
        Assert.assertEquals("zero", numbers0234[0]);
        Assert.assertEquals("three", numbers0234[3]);
    }

    @Test
    public void simpleArrayWorkdays() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        Assert.assertEquals("Monday", workdays[0]);
        Assert.assertEquals("Friday", workdays[4]);
    }

    @Test
    public void intEqualsIntVsIntegerEqualsInteger() {
        Assert.assertEquals(4, 4);
        Assert.assertTrue(4 == 4);

        Integer firstFour = new Integer(4);
        Integer secondFour = new Integer(4);

        Assert.assertEquals(firstFour, secondFour);
        extracted(secondFour == firstFour);
    }

    private void extracted(boolean b) {
    }

    @Test
    public void intEqualsIntVsIntegerAssertTrue() {
        Assert.assertEquals(4, 4);
        Assert.assertTrue(4 == 4);

        Integer firstFour = new Integer(4);
        Integer secondFour = new Integer(4);

        Assert.assertEquals(firstFour, secondFour);
        Assert.assertTrue(firstFour.equals(secondFour));
    }

    @Test
    public void canConfirmIntMinAndMaxLimits() {
        int minimumInt = -2147483648;
        int maximumInt = 2147483647;

        assertEquals("integer min", minimumInt, Integer.MIN_VALUE);
        assertEquals("integer max", maximumInt, Integer.MAX_VALUE);
    }
}