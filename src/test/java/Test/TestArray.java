package Test;

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
    public void intEqualsIntInteger() {
        Assert.assertEquals(4, 4);
        Assert.assertTrue(4 == 4);

        Integer firstFour = new Integer(4);
        Integer secondFour = new Integer(4);

        Assert.assertEquals(firstFour, secondFour);
        extracted(secondFour == firstFour);
    }

    public void extracted(boolean b) {
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

    @Test
    public void canConvertIntToHex() {
        assertEquals("hex 11 is b", "b",
                Integer.toHexString(11));
        assertEquals("hex 10 is a", "a",
                Integer.toHexString(10));
        assertEquals("hex 3 is 3", "3",
                Integer.toHexString(3));
        assertEquals("hex 21 is 15", "15",
                Integer.toHexString(21));
    }
}