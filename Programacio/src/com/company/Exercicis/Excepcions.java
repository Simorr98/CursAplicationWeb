package com.company.Exercicis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcions {

    public static void ex1(int num){
        try{
            int res = num/0;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e);
        }
    }

    public static void ex2() {
        try {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Error: " + e);
        }
    }

    public static void ex3 (String num) {
        try {
            int n = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e);
        }
    }

    public static void ex4 () {
        Scanner scanner = new Scanner(System.in);

        String string1;
        String string2;

        int num1;
        int num2;
        int result = 0;

        System.out.println("Introdueix un número: ");
        string1 = scanner.nextLine();
        System.out.println("Introdueix un número: ");
        string2 = scanner.nextLine();

        try {
            num1 = Integer.parseInt(string1);
            num2 = Integer.parseInt(string2);

            result = num1 / num2;

        } catch (NumberFormatException e) {
            System.err.println("Format erroni - " + e);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e);
        }

        System.out.println(result);
    }

    public static void ex5(int n) {
        try {
            int[] numbers = {0, 1, 2, 3, 4};
            System.out.println(numbers[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e);
        }
    }
}