package dsa.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void f19_should_be() {
        int actual = new Fibonacci().f(19);
        assertEquals(4181, actual);
    }
}