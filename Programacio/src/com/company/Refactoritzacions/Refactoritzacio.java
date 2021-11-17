package com.company.Refactoritzacions;


import java.util.Scanner;

public class Refactoritzacio {

    private static Scanner scanner = new Scanner(System.in);

    public static void printPersona() {
        System.out.println("Dades de la persona: ");
    }

    public static void displayNumbers() {

        int [] elements = new int[5];

        for (int i = 0; i < elements.length; i++) {
            System.out.print("Introdueix un número: ");
            elements[i] = scanner.nextInt();
        }

        System.out.println("Els números introduïts són:");
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
    }

    public static void sumaNumeros() {

        int [] elements = new int[5];
        int sum = 0;
        double average;

        for (int i = 0; i < elements.length; i++) {
            System.out.print("Introdueix un número: ");
            elements[i] = scanner.nextInt();
        }

        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }

        average = (double)sum / elements.length;
        System.out.println("La suma és: " + average);
    }

    public static String paraulaLlargaInversa(String frase) {
        String paraulaActualInversa = "";
        String paraulaMesLlargaInversa = "";

        int counter = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                paraulaActualInversa = frase.charAt(i) + paraulaActualInversa;
            } else {
                if (paraulaActualInversa.length() > paraulaMesLlargaInversa.length()) {
                    paraulaMesLlargaInversa = paraulaActualInversa;
                }
                paraulaActualInversa = "";
            }
        }
        return paraulaMesLlargaInversa;
    }

    public static String novaFrase(String frase) {
        String paraulaActual = "";
        String novaFrase = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                paraulaActual = frase.charAt(i) + paraulaActual;
            } else {
                novaFrase += paraulaActual + ' ';
                paraulaActual = "";
            }
        }

        return novaFrase;
    }

}
