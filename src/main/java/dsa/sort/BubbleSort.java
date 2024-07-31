package dsa.sort;

// https://www.w3schools.com/dsa/dsa_algo_bubblesort.php

public class BubbleSort {
    int loopCount = 0;
    int iterationCount = 0;
    private final int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        // loop for as many items as there are in the list
        for (int x = 0; x < arr.length - 1; x++) {
            boolean swapped = false;
            loopCount++;
            // compare with remaining unsorted items
            for (int i = 0; i < arr.length - 1 - x; i++) {
                iterationCount++;
                // compare this item to the next item
                int a = arr[i];
                int b = arr[i + 1];
                if (a > b) {
                    // swap
                    swapped = true;
                    arr[i] = b;
                    arr[i + 1] = a;
                }
            }
            // if nothing got swapped, we are done!
            if (!swapped) {
                break;
            }
        }
    }
}
