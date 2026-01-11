package com.example;

public class Arithmetic {
    private int a;
    private int b;

    public Arithmetic(int a, int b) {
        this.a = 0;
        this.b = 0;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int prod(int a, int b) {
        return a * b;
    }

    public int max(int a, int b) {
        return Math.max(a, b);


    }

    public int min(int a, int b) {
        return Math.min(a, b);
    }
}


