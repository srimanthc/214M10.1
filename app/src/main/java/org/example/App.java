package org.example;

public class App {

    public int value(int n) {
        if (n == 1) {
            return 1;
        }
        return n + value(n - 1);
    }

    public int add(int n, int m) {
        return value(n) + value(m);
    }

    public int subtract(int n, int m) {
        return value(n) - value(m);
    }

    public int multiply(int n, int m) {
        return value(n) * value(m);
    }

    public double divide(int n, int m) {
        return (double) value(n) / value(m);
    }
}
