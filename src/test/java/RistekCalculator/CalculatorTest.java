package RistekCalculator;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 4;
        int expected = 9;

        int actual = calculator.add(a, b);

        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 1;
        int expected = 1;

        int actual = calculator.subtract(a, b);

        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 1;
        int excpected = 2;

        int actual = calculator.multiply(a, b);

        assertEquals(excpected, actual);
    }
    @Test
    void divide() {
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 2;
        int expected = 1;

        int actual = calculator.divide(a, b);

        assertEquals(expected, actual);
    }
}