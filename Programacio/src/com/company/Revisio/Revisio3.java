package com.company.Revisio;

import java.util.Scanner;

public class Revisio3 {
    private static Scanner scanner;

    public static void ordreInvers() {
        scanner = new Scanner(System.in);
        int[] elements = new int[5];

        for (int i = 0; i < elements.length; i++) {
            System.out.println("Escrius un numero per a l'array: ");
            elements[0] = scanner.nextInt();
        }
        ;

        for (int i = elements.length - 1; i >= 0; i--) {
            System.out.println(elements[i]);
        }
    }

    public static void mitjanaAritmetica() {
        scanner = new Scanner(System.in);
        int[] elements = new int[5];
        int contador = 0;

        for (int i = 0; i < elements.length; i++) {
            System.out.println("Escrius un numero per a l'array: ");
            elements[0] = scanner.nextInt();
        }

        double mitjana = (double) (elements[0] + elements[1] + elements[2] + elements[3] + elements[4]) / elements.length;
        System.out.println("La mitjana de els arrays es: " + mitjana);
    }

    public static void contaZeros() {
        scanner = new Scanner(System.in);
        int[] elements = new int[5];
        int contador = 0;

        for (int i = 0; i < elements.length; i++) {
            System.out.println("Escrius un numero per a l'array: ");
            elements[0] = scanner.nextInt();
        }

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0) {
                contador++;
            }
        }
        double mitjana = (double) (elements[0] + elements[1] + elements[2] + elements[3] + elements[4]) / elements.length;
        System.out.println("La mitjana de els arrays es: " + mitjana);
        System.out.println("Zeros introduïts: " + contador);
    }

    public static void mostrarArray() {
        scanner = new Scanner(System.in);
        int[] arrayA = new int[7];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Escrius un numero per a l'array: ");
            arrayA[i] = scanner.nextInt();
        }


        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
            if (i == arrayA.length / 2) {
                break;
            }
            System.out.println(arrayA[arrayA.length - 1 - i]);
        }
    }

    public static void mostrarArrays() {
        scanner = new Scanner(System.in);
        int[] arrayA = new int[4];
        int[] arrayB = new int[3];
        int[] arrayC = new int[7];
        int b = 0;

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Escrius un numero per a l'array: ");
            arrayA[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("Escrius un numero per a l'array: ");
            arrayB[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayA.length; i++) {
            if (i < arrayA.length) {
                arrayC[b] = arrayA[i];
                b++;
            }
            if (i < arrayB.length) {
                arrayC[b] = arrayB[i];
                b++;
            }
        }

        for (int i = 0; i < arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }
    }

    public static void mostrarArrayParametre(int n) {
        scanner = new Scanner(System.in);
        int[] arrayA = new int[7];
        int[] arrayB = new int[8];
        int[] arrayC = new int[arrayA.length + arrayB.length];
        int b = 0;
        int c = 0;
        int x = 0;

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Escrius un numero per a l'array: ");
            arrayA[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("Escrius un numero per a l'array: ");
            arrayB[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayC.length; i++) {
            if (i < arrayA.length) {
                for (int j = 0; j < n && c < arrayA.length; j++) {
                    arrayC[b] = arrayA[c];
                    b++;
                    c++;
                }
            }
            if (i < arrayB.length) {
                for (int h = 0; h < n && x < arrayB.length; h++) {
                    arrayC[b] = arrayB[x];
                    b++;
                    x++;
                }
            }
        }
        for (int i = 0; i < arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }
    }

    public static void rebreIndex(int[] arrayNumeros, int element, int index) {
        int[] arrayFinal = new int[arrayNumeros.length + 1];
        int a = 0;

        for (int i = 0; i < arrayFinal.length; i++) {
            if (index > arrayNumeros.length) {
                System.out.println("L'index introduït es mes gran que l'array");
                break;
            }

            if (index == i) {
                arrayFinal[i] = element;
            } else {
                arrayFinal[i] = arrayNumeros[a];
                a++;
            }
        }

        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.println(arrayFinal[i]);
        }
    }
}