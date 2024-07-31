package dsa.sort;// https://www.w3schools.com/dsa/dsa_algo_radixsort.php

import java.util.LinkedList;

public class RadixSort {
    int outerLoop = 0;
    int innerLoop = 0;
    private final int[] arr;

    public RadixSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        // initialise an array of stacks
        LinkedList<Integer>[] radixArray = new LinkedList[10];
        for (int i = 0; i < radixArray.length; i++) {
            radixArray[i] = new LinkedList<>();
        }

        int exp = 1;

        int max = max(arr);

        while (max / exp > 0) {
            outerLoop++;
            for (int i : arr) {
                radixArray[(i / exp) % 10].add(i);
            }

            int i = 0;
            for (LinkedList<Integer> integers : radixArray) {
                innerLoop++;
                while (!integers.isEmpty()) {
                    arr[i++] = integers.pop();
                }
            }

            exp *= 10;
        }


    }


    int max(int[] arr) {
        int max = 0;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }
}
