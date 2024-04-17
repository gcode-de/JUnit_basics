import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    @DisplayName("testAdd_PositiveNumbers ➕")
    public void testAdd_PositiveNumbers() {
        assertEquals(5, Calculator.add(2, 3), "Adding 2 and 3 should return 5");
    }

    @Test
    @DisplayName("testAdd_NegativeNumbers ➕")
    public void testAdd_NegativeNumbers() {
        assertEquals(-5, Calculator.add(-2, -3), "Adding -2 and -3 should return -5");
    }

    @Test
    public void testIsEven_EvenNumber() {
        assertTrue(Calculator.isEven(4), "4 is an even number");
    }

    @Test
    public void testIsEven_OddNumber() {
        assertFalse(Calculator.isEven(5), "5 is an odd number");
    }

    @Test
    public void testMultiply_TwoPositiveNumbers() {
        assertEquals(6, Calculator.multiply(2, 3), "Multiplying 2 and 3 should return 6");
    }

    @Test
    public void testMultiply_NegativeByPositive() {
        assertEquals(-6, Calculator.multiply(-2, 3), "Multiplying -2 by 3 should return -6");
    }

    @Test
    public void testToUpperCase_LowerCaseString() {
        assertEquals("HELLO", Calculator.toUpperCase("hello"), "Converting 'hello' to upper case should return 'HELLO'");
    }

    @Test
    public void testToUpperCase_MixedCaseString() {
        assertEquals("HELLO WORLD", Calculator.toUpperCase("Hello World"), "Converting 'Hello World' to upper case should return 'HELLO WORLD'");
    }

    @Test
    public void testIsPositive_PositiveNumber() {
        assertTrue(Calculator.isPositive(1), "1 is a positive number");
    }

    @Test
    public void testIsPositive_NegativeNumber() {
        assertFalse(Calculator.isPositive(-1), "Negative one (-1) is not a positive number");
    }

}
