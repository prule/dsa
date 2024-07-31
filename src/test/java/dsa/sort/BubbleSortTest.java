package dsa.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void array_should_sort_in_10() {
        int[] actual = {7, 12, 9, 11, 3};
        BubbleSort bubbleSort = new BubbleSort(actual);
        bubbleSort.sort();

        int[] expected = {3,7,9,11,12};
        assertArrayEquals(expected, actual);
        assertEquals(4, bubbleSort.loopCount);
    }

    @Test
    public void array_should_sort_in_2_loops() {
        int[] actual = {7, 3, 9, 12, 11};
        BubbleSort bubbleSort = new BubbleSort(actual);
        bubbleSort.sort();

        int[] expected = {3,7,9,11,12};
        assertArrayEquals(expected, actual);
        assertEquals(2, bubbleSort.loopCount);
    }

}