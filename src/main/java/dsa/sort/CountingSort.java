package dsa.sort;// https://www.w3schools.com/dsa/dsa_algo_countingsort.php

public class CountingSort {
    int outerLoop = 0;
    int innerLoop = 0;
    private final int[] arr;

    public CountingSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int max = max(arr);
        // create an element for each possible value
        // assumes positive numbers only
        int[] counts = new int[max + 1];
        // for each index put the count for that number
        for (int i : arr) {
            counts[i]++;
        }
        // now rebuild the array in order
        int i = 0;
        for (int x = 0; x < counts.length; x++) {
            outerLoop++;
            int count = counts[x];
            if (count > 0) {
                for (int j = 0; j < count; j++) {
                    innerLoop++;
                    arr[i++] = x;
                }
            }
        }
    }

    int max(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
