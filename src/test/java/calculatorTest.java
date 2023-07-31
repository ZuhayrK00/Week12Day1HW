import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class calculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(25, 10);
        assertEquals(35, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(50, 5);
        assertEquals(45, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(10, 10);
        assertEquals(100, result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(30.0, 5.0);
        assertEquals(6.0, result, 0.01);
    }
}
