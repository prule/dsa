package dsa.sort;// https://www.w3schools.com/dsa/dsa_algo_selectionsort.php

public class SelectionSort {
    int outerLoopCount = 0;
    int innerLoopCount = 0;
    private final int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        for (int x = 0; x < arr.length; x++) {
            outerLoopCount++;
            int minPos = x;
            // find position of min value
            for (int y = x + 1; y < arr.length; y++) {
                innerLoopCount++;
                int a = arr[y];
                if (a < arr[minPos]) {
                    minPos = y;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[x];
            arr[x] = temp;
        }
    }
}
