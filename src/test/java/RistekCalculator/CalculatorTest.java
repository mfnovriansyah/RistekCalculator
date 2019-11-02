package RistekCalculator;

import org.junit.jupiter.api.Test;

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
}