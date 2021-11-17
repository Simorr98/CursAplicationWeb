package com.company.Exercicis;

import java.util.Scanner;

public class Bucles {

    private static Scanner scan = new Scanner(System.in);

    public static void exercise1() {

        System.out.print("Digues un numero: ");
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }

    public static void exercise2() {

        System.out.print("Introdueixi un numero: ");
        int i = scan.nextInt();

        while (i > 0) {
            System.out.print("Introdueixi un numero: ");
            i = scan.nextInt();
        }
        System.out.println("Negatiu");
    }

    public static void exercise3() {
        System.out.print("Introdueixi un numero: ");
        int num = scan.nextInt();

        while (num != 0) {
            System.out.print("Introdueixi un numero: ");
            num = scan.nextInt();
        }
        if (num == 0) {
            System.out.println("Numero 0");
        } else {
            System.out.print("Introdueixi un numero: ");
            num = scan.nextInt();
        }
    }

    public static void exercise4() {
        int num;
        int rest;

        System.out.print("Introdueixi un numero: ");
        num = scan.nextInt();
        rest = num % 2;

        for (int i = 2; rest == num % 2; ) {
            if (rest == 0) {
                System.out.println(num + " SI es multiple de 2");
                break;
            } else {
                System.out.println(num + " NO es multiple de 2");
                System.out.println(" ");
                System.out.print("Introdueixi un numero: ");
                num = scan.nextInt();
            }
        }
    }
    public static void exercise5() {
        int n;
        int contador = 0;

        do {
            System.out.println("Introdueix un numero: ");
            n = scan.nextInt();
            contador++;
        } while (n >= 0);
        if (n < 0) {
            System.out.println("Has introduït " + contador + " numeros");
        }
    }
}
