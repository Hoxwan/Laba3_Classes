package org.example;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private final List<Integer> numbers;

    public OddEvenSeparator() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void even() {
        System.out.print("Even numbers: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public void odd() {
        System.out.print("Odd numbers: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
