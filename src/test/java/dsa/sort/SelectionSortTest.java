package dsa.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    public void should_sort() {

        int[] actual = new int[]{64, 34, 25, 5, 22, 11, 90, 12};
        SelectionSort sort = new SelectionSort(actual);

        sort.sort();

        int[] expected = new int[]{5, 11, 12, 22, 25, 34, 64, 90};
        assertArrayEquals(expected, actual);
    }

}