package com.company;

public class QuickSortWithDivideAndConquer {
    int operationCount = 0;

    public int quickSort(int[] inputArray) {
        operationCount = 0;
        divide(inputArray, 0, inputArray.length - 1);

        return operationCount;
    }

    public void divide(int[] inputArray, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int pivotIndex = conquer(inputArray, startIndex, endIndex);

        divide(inputArray, startIndex, pivotIndex - 1);
        divide(inputArray, pivotIndex + 1, endIndex);
    }

    public int conquer(int[] inputArray, int low, int high) {
        int pivot = inputArray[(high - low)/2]; // take middle element (not last one)
        int index = low;

        for (int i = low; i < high; i++) {
            operationCount++;
            if (inputArray[i] <= pivot) {
                exchangeElements(inputArray, index, i);
                index++;
            }
        }

        exchangeElements(inputArray, index, high);

        return index;
    }

    public void exchangeElements(int[] inputArray, int from, int to) {
        int tmp = inputArray[from];

        inputArray[from] = inputArray[to];
        inputArray[to] = tmp;
    }
}
