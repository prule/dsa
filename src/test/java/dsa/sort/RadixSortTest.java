package dsa.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RadixSortTest {

    @Test
    public void should_sort() {
        int[] actual = new int[]{170, 45, 75, 90, 802, 24, 2, 66};
        RadixSort sort = new RadixSort(actual);

        sort.sort();

        int[] expected = new int[]{2, 24, 45, 66, 75, 90, 170, 802};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void should_sort2() {
        int[] actual = new int[]{114, 450, 304, 554, 589, 381, 506, 519, 372, 182};
        RadixSort sort = new RadixSort(actual);

        sort.sort();

        int[] expected = new int[]{114, 182, 304, 372, 381, 450, 506, 519, 554, 589};

        assertArrayEquals(expected, actual);
    }
}