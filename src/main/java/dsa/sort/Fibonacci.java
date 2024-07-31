package dsa.sort;

public class Fibonacci {
    public int f(int n) {
        if (n <= 1) {
            return n;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
