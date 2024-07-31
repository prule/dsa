package dsa.sort;// https://www.w3schools.com/dsa/dsa_algo_insertionsort.php
// https://www.algolist.net/Algorithms/Sorting/Insertion_sort

public class InsertionSort {
    int outerLoop = 0;
    int innerLoop = 0;
    private final int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        // pick value to be sorted
        // first element of array is "already sorted"! so skip that one
        for (int i = 1; i < arr.length; i++) {
            outerLoop++;
            int valueToBeSorted = arr[i];
            // insert it in the sorted part of array
            // work backwards from the RHS of the sorted part of array, shifting each element across until we get to the right place
            int j = i;
            while (j > 0 && arr[j - 1] > valueToBeSorted) {
                innerLoop++;
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToBeSorted;
        }
    }

}
