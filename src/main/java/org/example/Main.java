package org.example;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Button button = new Button();
        button.click();
        button.click();

        // Задание 2
        Balance balance = new Balance();
        balance.addLeft(5);
        balance.addRight(3);
        balance.result(); // L
        balance.addRight(2);
        balance.result(); // =

        // Задание 3
        Bell bell = new Bell();
        bell.sound(); // ding
        bell.sound(); // dong
        bell.sound(); // ding

        // Задание 4
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);
        separator.even(); // Even numbers: 2 4
        separator.odd();  // Odd numbers: 1 3

        // Задание 5
        Table table = new Table(2, 3);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(0, 2, 3);
        table.setValue(1, 0, 4);
        table.setValue(1, 1, 5);
        table.setValue(1, 2, 6);

        System.out.println("Table:");
        System.out.println(table);
        System.out.println("Average: " + table.average());

        // Использование методов getValue, rows и cols
        System.out.println("Value at (0, 1): " + table.getValue(0, 1)); // 2
        System.out.println("Number of rows: " + table.rows()); // 2
        System.out.println("Number of columns: " + table.cols()); // 3
    }
}
