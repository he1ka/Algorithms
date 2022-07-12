package com.company;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println(queue);
        queue.pushToEnd(1);
        queue.pushToEnd(2);
        queue.pushToEnd(3);
        queue.pushToEnd(4);
        queue.pushToEnd(5);
        queue.pushToEnd(6);

        System.out.println(queue);

        // Удаляем элемент из начала
        try {
            queue.remove();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Проверяем что "1" не печатается
        System.out.println(queue);

        try {
            System.out.println(queue.peek()); // получаем первый элемент "2"
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Проверяем что "2" печатается
        System.out.println(queue);

        System.out.println(queue.size()); // size должен быть 5
    }
}
