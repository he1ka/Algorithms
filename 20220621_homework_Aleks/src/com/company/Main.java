package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    /**
     * Quick sort
     * 1.Выбираем опорный элемент из массива. Как правило, это средний элемент.
     * 2.Делим массив на 2 подмассива. Элементы, которые меньше опорного, и элементы, которые больше 	опорного.
     * 3.Рекурсивно применяем сортировку к обоим подмассивам.
     * В результате массивы будут делиться до тех пор, пока не останется один элемент, который потом отсортируется.
     */
    public static void main(String[] args) {
        QuickSortWithDivideAndConquer quickSorter = new QuickSortWithDivideAndConquer();

        int[] inputArray = generateRandomArray(10);
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(inputArray));

        int numberOfOperations = quickSorter.quickSort(inputArray);

        System.out.println("Operation number: " + numberOfOperations);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(inputArray));
    }

    /**
     * https://www.tutorialspoint.com/generate-a-random-array-of-integers-in-java
     */
    public static int[] generateRandomArray(int length) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); // storing random integers in an array
        }

        return arr;
    }
}
