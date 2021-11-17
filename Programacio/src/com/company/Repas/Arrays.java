package com.company.Repas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Arrays {

    private static Scanner scanner = new Scanner(System.in);

    public static void ex1a(){
        int [] elements = {1,2,3,4};
        System.out.println(elements[0]);
        System.out.println(elements[1]);
        System.out.println(elements[2]);
        System.out.println(elements[3]);
    }

    public static void ex1b() {
        int [] elements = {1,2,3,4};

        for(int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    public static void ex2() {
        scanner = new Scanner(System.in);
        int n = 5;
        int [] elements = new int[n];
        for(int i = 0; i < elements.length; i++) {
            System.out.println("Introdueix un numero: ");
            elements[i] = scanner.nextInt();
        }
        for(int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    public static void ex3() {
        scanner = new Scanner(System.in);
        int n = 5;
        int [] elements = new int[n];
        for(int i = elements.length - 1; i >= 0; i--) {
            System.out.println("Introdueix un numero: ");
            elements[i] = scanner.nextInt();
        }
        for(int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    public static void ex4(){
        scanner = new Scanner(System.in);
        int n = 5;
        int [] elements = new int[n];
        int sum = 0;
        for(int i = elements.length - 1; i >= 0; i--) {
            System.out.println("Introdueix un numero: ");
            elements[i] = scanner.nextInt();
        }

        for(int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }
        System.out.println("La suma de l'array es igual a: " + sum);
    }
}

