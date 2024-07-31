package dsa.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

    @Test
    public void should_sort() {
        int[] actual = new int[] {4, 2, 2, 6, 3, 3, 1, 6, 5, 2, 3};
        CountingSort sort = new CountingSort(actual);

        sort.sort();

        int[] expected = new int[] {1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 6};
        assertArrayEquals(expected, actual);

    }
}