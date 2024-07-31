package dsa.sort;

public class FindLowestValueInArray {
    public int f(int[] arr) {
        int lowest = arr[0];
        for (int i : arr) {
            if (i < lowest) {
                lowest = i;
            }
        }
        return lowest;
    }
}
