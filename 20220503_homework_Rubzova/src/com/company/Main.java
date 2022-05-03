package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(nod(14,21));
    }

    public static int nod(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else if (b > a) {
                b = b - a;
            }
        }

        return a;
    }
}
