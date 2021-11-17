package com.company.Revisio;

import java.util.Scanner;

public class Revisio2 {
    private static Scanner scanner;

    public static void convertisEnter() {
        scanner = new Scanner(System.in);
        System.out.println("Introdueix segons i to pasarem a temps: ");
        int teclat = scanner.nextInt();

        int h = teclat / 3600;
        int m = (teclat - (h * 3600)) / 60;
        int s = (teclat - m * 60) / 60;

        System.out.println("Les hores son " + h + ", els minuts son " + m + ", i els segons son " + s);
    }

    public static void calcularTriangle() {
        scanner = new Scanner(System.in);
        System.out.println("Introdueix la longitud del seu triangle equilàter: ");
        double longitud = scanner.nextInt();
        double perimetro = 3 * longitud;
        double altura = (longitud * longitud) - ((longitud / 2) * (longitud / 2));
        double h = Math.sqrt(altura);
        double area = (longitud * h) / 2;

        System.out.println("El perimetre del triangle es: " + perimetro);
        System.out.println("L'àrea del triangle es: " + area);
    }

    public static double quantitatBancaria(double cantidad, double interesosAnuals, int mesos) {

        if (cantidad >= 1000 && interesosAnuals > 0) {
            double resultat = (cantidad * (interesosAnuals / 100) * mesos) / 1200;
            cantidad = resultat;
        }
        return cantidad;
    }

    public static void taulaMultiplicar() {
        scanner = new Scanner(System.in);
        System.out.println("Introdueix un numero i te mostrare la seva taula de multiplicar: ");
        int n = scanner.nextInt();
        System.out.println("La taula de multiplicar de " + n + " : ");

        for (int i = 0; i < 11; i++) {
            int resultat = n * i;
            System.out.println(n + " x " + i + " : " + resultat);

        }
    }

    public static void dibuixaCuadrat(int costat, char caracter) {
        for (int i = 0; i < costat; i++) {
            for (int a = 0; a < costat; a++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    public static void contornCuadrat(int costat, char caracter) {
        String espai = " ";

        for (int i = 0; i < costat; i++) {
            for (int a = 0; a < costat; a++) {
                if (i == 0 || i == costat - 1) {
                    System.out.print(caracter);
                    continue;
                }
                if (a == 0 || a == costat - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(espai);
                }
            }
            System.out.println();
        }
    }

    public static void cambiar3() {
        for (int i = 0; i <= 9; i++) {
            for (int a = 0; a <= 9; a++) {
                for (int b = 0; b <= 9; b++) {
                    for (int c = 0; c <= 9; c++) {
                        System.out.print(i != 3 ? i : "E");
                        System.out.print(a != 3 ? a : "E");
                        System.out.print(b != 3 ? b : "E");
                        System.out.print(c != 3 ? c : "E");
                        System.out.println();
                    }
                }
            }
        }
    }

    public static boolean siEsPrimer(int numero) {
        int contador = 2;
        boolean primer = true;

        while (contador != numero) {
            if (numero % contador == 0) {
                primer = false;
            }
            contador++;
        }
        return primer;
    }

    public static void nombresPrimers(){
        int n = 20;
        boolean primer = true;

        for(int i = 1; i < n; i++){
            if (i % 2 == 0) {
                primer = false;
                System.out.println(i);
            }
        }
    }
}
