package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int year = 1584;
        if (isLeap(year)) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }

    static boolean isLeap(int year) {
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }
}