
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ScientificCalculatorTest {

    @Test
    public void testSquareRoot() {
        double expectedResult = 4.0;
        double actualResult = ScientificCalculator.sqrt(16);
        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    public void testFactorial() {
        int expectedResult = 120;
        int actualResult = ScientificCalculator.factorial(5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNaturalLogarithm() {
        double expectedResult = 1.6094379124341003;
        double actualResult = ScientificCalculator.ln(5);
        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    public void testPower() {
        double expectedResult = 32.0;
        double actualResult = ScientificCalculator.power(2, 5);
        assertEquals(expectedResult, actualResult, 0.0001);
    }
}
