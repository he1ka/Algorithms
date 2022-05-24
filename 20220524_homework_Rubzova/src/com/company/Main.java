package com.company;

public class Main {

    public static void main(String[] args) {
        searchKeysInInput(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{-2, 0, 4, 9, 12});
    }

    /**
     * Задача №4. Двоичный поиск
     * Реализуйте алгоритм бинарного поиска.
     * <p>
     * Входные данные
     * В первой строке входных данных содержатся натуральные числа 𝑁 и 𝐾 (0<𝑁,𝐾≤100000).
     * Во второй строке задаются 𝑁 элементов первого массива, отсортированного по возрастанию,
     * а в третьей строке – 𝐾 элементов второго массива. Элементы обоих массивов - целые числа,
     * каждое из которых по модулю не превосходит 109
     * <p>
     * Выходные данные
     * Требуется для каждого из K чисел вывести в отдельную строку "YES",
     * если это число встречается в первом массиве, и "NO" в противном случае.
     */
    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < a[middle]) {
                high = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public static void searchKeysInInput(int[] input, int[] keys) {
        for (int i = 0; i < keys.length; i++) {
            if (binarySearch(input, keys[i]) == -1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
