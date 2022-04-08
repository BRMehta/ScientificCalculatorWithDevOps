import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double delta = 1e-15;
    Calculator c = new Calculator();

    @Test
    public void squareRootPositive() {
        assertEquals("Testing True Positive for squareRoot", 6.0, c.squareRoot(36.0), delta);
        assertEquals("Testing for True Negative for squareRoot", Double.NaN, c.squareRoot(-49.0), delta);
    }

    @Test
    public void squareRootNegative() {
        assertNotEquals("Testing False Negative for squareRoot", 6.0, c.squareRoot(-15.0), delta);
        assertNotEquals("Testing for False Positives for squareRoot", Double.NaN, c.squareRoot(84.0), delta);
    }

    @Test
    public void factorialPositive() {
        assertEquals("Testing True Positive for factorial", 24, c.factorial(4), delta);
        assertEquals("Testing for True Negative for factorial", 120, c.factorial(5), delta);
    }

    @Test
    public void factorialNegative() {
        assertNotEquals("Testing False Negative for factorial", 6, c.factorial(2), delta);
        assertNotEquals("Testing for False Positives for factorial", 120, c.factorial(6), delta);
    }

    @Test
    public void logarithmPositive() {
        assertEquals("Testing True Positive for logarithm", 2.302585092994046, c.logarithm(10.0), delta);
        assertEquals("Testing for True Negative for logarithm", 0, c.logarithm(1), delta);
    }

    @Test
    public void logarithmNegative() {
        assertNotEquals("Testing False Negative for logarithm", 6.0, c.logarithm(24.0), delta);
        assertNotEquals("Testing for False Positives for logarithm", 2.0, c.logarithm(1), delta);
    }


}
