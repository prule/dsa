package dsa.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLowestValueInArrayTest {

    @Test
    public void should_find_lowest_value() {
        int actual = new FindLowestValueInArray().f(new int[]{7, 12, 9, 11, 3});
        assertEquals(3, actual);
    }
}