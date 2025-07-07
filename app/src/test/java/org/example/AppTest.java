package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App calc = new App();

    @Test
    void testValue() {
        assertEquals(1,  calc.value(1));
        assertEquals(3,  calc.value(2));
        assertEquals(6,  calc.value(3));
        assertEquals(10, calc.value(4));
        assertEquals(15, calc.value(5));
    }

    @Test
    void testAdd() {
        assertEquals(4,  calc.add(1, 2));
        assertEquals(9,  calc.add(2, 3));
        assertEquals(16, calc.add(3, 4));
    }

    @Test
    void testSubtract() {
        assertEquals(-2, calc.subtract(1, 2));
        assertEquals(-3, calc.subtract(2, 3));
        assertEquals(-4, calc.subtract(3, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(1,   calc.multiply(1, 1));
        assertEquals(18,  calc.multiply(2, 3));
        assertEquals(315, calc.multiply(5, 6));
    }

    @Test
    void testDivide() {
        assertEquals(1.0, calc.divide(3, 3), 1e-6);
        assertEquals(21.0 / 6.0, calc.divide(6, 3), 1e-6);
        assertEquals(15.0 / 6.0, calc.divide(5, 3), 1e-6);
    }
}
