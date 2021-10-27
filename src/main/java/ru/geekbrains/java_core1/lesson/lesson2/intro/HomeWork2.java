package ru.geekbrains.java_core1.lesson.lesson2.intro;

import javax.xml.transform.Result;

public class HomeWork2 {

    public static void main(String[] args) {
        within10and20(12, 15);
        isPositiveOrNegative(17);
        isNegative(12);
        printWordNTimes("Hello",5);

    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
        System.out.println("true");
            return true;
        } else {
        System.out.println("false");
            return false;
        }
    }


    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean isNegative(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 0 ; i < times; i++  ) {
            System.out.println(word);

        }

    }
}