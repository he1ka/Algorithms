package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {0, -3, 27, 4, 8};
        printArray(stoneSort(arr1));
    }

    /**
     * Задача №112317. Сортировка
     * Напишите программу, которая сортирует массив по возрастанию "методом камня": аналогично
     * "методу пузырька", но в обратном порядке: самый "тяжелый" элемент из оставшихся спускается
     * к концу массива.
     *
     * Входные данные
     * Первая строка содержит размер массива N . Во второй строке через пробел задаются N чисел –
     * элементы массива. Гарантируется, что 0 < N ≤ 1000 .
     *
     * Выходные данные
     * Программа должна выводить весь массив после каждой перестановки элементов. Все элементы
     * массива выводятся в одну строку и разделяются пробелами, после окончания вывода массива
     * выполняется переход на новую строку. Если перестановок не было, программа выводит только
     * число 0.
     */
    public static int[] stoneSort(int array[]) {
        int arraySize = array.length;

        //  Мы проходим с последнего индекса массива до нулевого
        for (int i = arraySize - 1; i >= 0 ; i--) {
            // Во  внутреннем проходе мы движемся с конца до последнего
            // не отсортированного элемента
            // на первом проходе 0, потом 1 и тд
            for (int j = arraySize - 1; j >= arraySize - i ; j--) {
                    if (array[j] < array[j - 1]) {
                    // Поскольку мы движемся в обратном направлении
                    // Мы сравниваем со следующим элементом, который будет
                    // по индексу на один меньше (-1)
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        return array;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
