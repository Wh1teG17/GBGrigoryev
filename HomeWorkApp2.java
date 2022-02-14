package ru.geekbrains.lesson1;
/**
* @name Homework 2
* @author Grigoryev
* @date 14.02.2022
 * */
public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(met1(20, 8));
        met2(0);
        System.out.println(met3(2));
        met4();
    }

    static boolean met1(int a, int b) {
        System.out.println("Метод 1");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    static void met2(int a) {
        System.out.println("Метод 2");
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    static boolean met3(int a) {
        System.out.println("Метод 3");
        if (a >= 0) return true;
        else return false;
    }

    static void met4() {
        System.out.println("Метод 4");
        for (int i = 0; i < 5; i++) {
            System.out.println("Лень порождает лень");
        }
    }
}