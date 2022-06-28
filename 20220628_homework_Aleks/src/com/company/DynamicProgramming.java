package com.company;


import java.util.Arrays;

public class DynamicProgramming {

    public static void main(String[] args) {
        int num = 7;
        int[] arr = new int[num + 1];
        for (int i = 2; i <= num; i++) {
            arr[i] = -1;
        }


        System.out.println(Arrays.toString(arr));
        long starTime = System.currentTimeMillis(); // save start time before calculation

        System.out.println(fibonacciRecursion(num));
        long fibonacciTime = System.currentTimeMillis(); // save new time after fibonacciRecursion

        System.out.println(fibonacciDpMemoization(num, arr));
        long fibonacciDpMemoizationTime = System.currentTimeMillis();

        System.out.println(fibonacciDpTabulation(num));
        long fibonacciDpTabulationTime = System.currentTimeMillis();

        System.out.println("fibonacciRecursion: " + (fibonacciTime - starTime));
        System.out.println("fibonacciDpMemoization: " + (fibonacciDpMemoizationTime - starTime));
        System.out.println("fibonacciDpTabulationTime: " + (fibonacciDpTabulationTime - starTime));
    }

    private static int fibonacciRecursion(int num) {
        if (num < 2) {
            return num; // for num = 1 -> 1, num = 2 -> 2, we was always return 1
        }

        return fibonacciRecursion(num - 1) + fibonacciRecursion(num - 2);
    }

    private static int fibonacciDpMemoization(int num, int[] arr) {
        if (num < 2) {
            return num; // for num = 1 -> 1, num = 2 -> 2, we was always return 1
        }

        if (arr[num] != -1) {
            return arr[num];
        }

        arr[num] = fibonacciDpMemoization(num - 1, arr) + fibonacciDpMemoization(num - 2, arr);
        return arr[num];
    }

    private static int fibonacciDpTabulation(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;
        arr[1] = 1;

        int res = 0;

        for (int index = 2; index <= num; index++) {
            arr[index] = arr[index - 2] + arr[index - 1];

            if (index == num) {
                res = arr[index];
            }
        }

        return res;
    }
}
