package com.company;

import java.util.Arrays;

public class Queue {
    private int[] array;      // массив для хранения элементов queue
    private int head;      // head указывает на передний элемент в queue
    private int tail;       // tail часть указывает на последний элемент в queue
    private int capacity;   // максимальная емкость queue
    private int count;      // текущий размер queue

    public Queue(int size) {
        array = new int[size];
        capacity = size;
        head = 0;
        tail = -1;
        count = 0;
    }

    /**
     * Вставляет элемент в конец
     */
    public void pushToEnd(int data) {
        tail++;
        count++;
        array[tail] = data;

        if (count >= capacity) {
            growSize();
        }
    }

    /**
     * Удаляет элмент из начала
     */
    public void remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        head++;
    }

    /**
     * Возвращает элемент из начал не удаляя его
     */
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        return array[head];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return tail - head + 1;
    }

    private void growSize() {
        int newSize = capacity * 2;
        int[] newArray = new int[newSize];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        capacity = newSize;
    }

    @Override
    public String toString() {
        String returnStr = "";
        for (int i = head; i <= tail; i++) {
            returnStr += array[i] + ",";
        }
        return "Queue{" + returnStr + '}';
    }
}
