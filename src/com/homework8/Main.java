package com.homework8;

import com.homework8.task1.Task1;
import com.homework8.task2.Task2;
import com.homework8.task3.Task3;
import com.homework8.task4.Task4;

public class Main {
    public static void main(String[] args) {
        new Task1().calculateDays();
        new Task2().filterUsers();
        new Task3().printAveragePriceByGenre();
        new Task4().printResultExtraPacking();
    }
}
