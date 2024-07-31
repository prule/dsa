package dsa.sort;

public class QuickSort {
    private final int[] arr;

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    int partition(int[] arr, int left, int right) {
        int pivotValue = arr[(left + right) / 2];
        int l = left;
        int r = right;
        int tmp;

        while (l <= r) {
            while (arr[l] < pivotValue) {
                l++;
            }
            while (arr[r] > pivotValue) {
                r--;
            }
            if (l <= r) {
                tmp = arr[l];
                arr[l] = arr[r];
                arr[r] = tmp;
                l++;
                r--;
            }
        }
        return l;
    }

    void sort(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            sort(arr, left, index - 1);
        }
        if (right > index) {
            sort(arr, index, right);
        }
    }

    public void sort() {
        sort(arr, 0, arr.length-1);
    }
}
