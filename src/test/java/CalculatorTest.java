import org.junit.Test;
import org.mammba.Calculator;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAdditionWithPositiveNumbers() {
        assertEquals(3, calc.add(1, 2));
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        assertEquals(-2, calc.add(-1, -1));
    }

    @Test
    public void testAdditionWithMultipleNumbers() {
        assertEquals(15, calc.add(1, 2, 3, 4, 5));
    }

    @Test
    public void testMultiplicationWithPositiveNumbers() {
        assertEquals(3, calc.multiply(1, 3));
    }

    @Test
    public void testMultiplicationWithNegativeNumbers() {
        assertEquals(-3, calc.multiply(-1, 3));
    }

    @Test
    public void testMultiplicationWithMultipleNumbers() {
        assertEquals(120, calc.multiply(1, 2, 3, 4, 5));
    }

    @Test
    public void testSubtractionWithPositiveNumbers() {
        assertEquals(-2, calc.subtract(1, 3));
    }

    @Test
    public void testSubtractionWithNegativeNumbers() {
        assertEquals(-4, calc.subtract(-1, 3));
    }

    @Test
    public void testSubtractionWithMultipleNumbers() {
        assertEquals(5, calc.subtract(20, 1, 2, 3, 4, 5));
    }

    @Test
    public void testDivisionWithPositiveNumbers() {
        assertEquals(1, calc.divide(3, 3), 0.0001);
    }

    @Test
    public void testDivisionWithMultipleNumbers() {
        assertEquals(-5, calc.divide(500, -10, 5, 2), 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        assertTrue("Division by zero should return NaN", Double.isNaN(calc.divide(5, 0)));
    }
}
