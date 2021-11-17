package com.company.Exercicis;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

    public static Scanner scan = new Scanner(System.in);

    public static void ex1a() {
        int[] ages = new int[5];
        ages[0] = 20;
        ages[1] = 18;
        ages[2] = 17;
        ages[3] = 24;
        ages[4] = 15;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);
    }

    public static void ex1b() {
        int mida = 5;
        int[] ages = new int[mida];

        ages[0] = 20;
        ages[1] = 18;
        ages[2] = 17;
        ages[3] = 24;
        ages[4] = 15;

        for (int i = 0; i < mida; i++) {
            System.out.println(ages[i]);
        }
    }

    public static void ex2() {
        int ARRAY_LENGHT = 5;
        int[] numbers = new int[ARRAY_LENGHT];
        Scanner scan = new Scanner(System.in);

        System.out.print("Numero: ");
        numbers[0] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[1] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[2] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[3] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[4] = scan.nextInt();

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
    }

    public static void ex3() {
        int ARRAY_LENGHT = 5;
        int[] numbers = new int[ARRAY_LENGHT];
        Scanner scan = new Scanner(System.in);

        System.out.print("Numero: ");
        numbers[0] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[1] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[2] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[3] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[4] = scan.nextInt();

        System.out.println(numbers[4]);
        System.out.println(numbers[3]);
        System.out.println(numbers[2]);
        System.out.println(numbers[1]);
        System.out.println(numbers[0]);
    }

    public static void ex4() {
        int ARRAY_LENGHT = 5;
        int[] numbers = new int[ARRAY_LENGHT];
        Scanner scan = new Scanner(System.in);

        System.out.print("Numero: ");
        numbers[0] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[1] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[2] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[3] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[4] = scan.nextInt();

        int suma = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];

        System.out.println(suma);
    }

    public static void ex5() {
        int ARRAY_LENGHT = 5;
        char[] list = new char[ARRAY_LENGHT];

        list[0] = 'h';
        list[1] = 'o';
        list[2] = 'l';
        list[3] = 'a';
        list[4] = 'a';

        for (int i = 0; i < ARRAY_LENGHT; i++) {
            System.out.print(list[i]);
        }
    }

    public static void ex6() {
        int ARRAY_LENGHT = 5;
        int[] num = new int[ARRAY_LENGHT];
        num[0] = 20;
        num[1] = 18;
        num[2] = 17;
        num[3] = 24;
        num[4] = 15;

        for (int i = 0; i < ARRAY_LENGHT; i++) {
            System.out.print(num[i]);
        }
    }

    public static void ex7() {
        double suma;
        double mitjana;

        int ARRAY_LENGHT = 5;
        int[] num = new int[ARRAY_LENGHT];

        num[0] = 5;
        num[1] = 6;
        num[2] = 5;
        num[3] = 8;
        num[4] = 5;

        suma = num[0] + num[1] + num[2] + num[3] + num[4];
        mitjana = suma / ARRAY_LENGHT;

        System.out.println(mitjana);
    }

    public static void ex8() {
        int ARRAY_LENGHT = 5;
        int[] list0 = new int[ARRAY_LENGHT];
        int[] list1 = new int[ARRAY_LENGHT];
        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        list0[0] = 1;
        list0[1] = 2;
        list0[2] = 3;
        list0[3] = 4;
        list0[4] = 5;

        list1[0] = 6;
        list1[1] = 7;
        list1[2] = 8;
        list1[3] = 9;
        list1[4] = 10;

        arraylist.add(list0[0]);
        arraylist.add(list0[1]);
        arraylist.add(list0[2]);
        arraylist.add(list0[3]);
        arraylist.add(list0[4]);

        arraylist.add(list1[0]);
        arraylist.add(list1[1]);
        arraylist.add(list1[2]);
        arraylist.add(list1[3]);
        arraylist.add(list1[4]);

        System.out.println(arraylist);
    }

    public static void ex9() {
        int ARRAY_LENGHT = 5;
        int[] list = new int[ARRAY_LENGHT];

        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        list[4] = 5;

        java.util.Arrays.sort(list);
        System.out.println("Array ordenada de manera creixent " + java.util.Arrays.toString(list));
    }

    public static void ex10() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Numeros: ");
        int num = scan.nextInt();

        while (num != 0) {
            if (num > 1) {
                System.out.print("Numeros: ");
                num = scan.nextInt();
                list.add(num);
            } else {
                System.out.print("Numeros: ");
                num = scan.nextInt();
            }
        }
        System.out.println(list);
        System.out.println("Numero 0, bucle aturat");
    }
}
