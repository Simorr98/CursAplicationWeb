package com.company.Exercicis;

import java.util.Scanner;

public class Condicionals {

    public static Scanner scan = new Scanner(System.in);

    public static void ex1() {
        int num;

        num = scan.nextInt();

        if (num > 0 ) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static void ex2() {
        int num1;
        int num2;
        int rest;

        num1 = scan.nextInt();
        num2 = 2;

        rest = num1%num2;

        if (rest == 0) {
            System.out.println(num1 + " SI es multiple de 2");
        } else {
            System.out.println(num1 + " NO es multiple de 2");
        }
    }

    public static void ex3() {
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > b) {
            System.out.println("Es major es " + a);
        } else if (a < b) {
            System.out.println("Es menor es " + a);
        } else {
            System.out.println("Iguals");
        }
    }

    public static void ex4a() {
        int day = scan.nextInt();

        if (day == 1) {
            System.out.println("Monday");
        }
        if (day == 2) {
            System.out.println("Tuesday");
        }
        if (day ==3) {
            System.out.println("Wednsday");
        }
        if (day == 4) {
            System.out.println("Thursday");
        }
        if (day == 5) {
            System.out.println("Friday");
        }
        if (day == 6) {
            System.out.println("Saturday");
        }
        if (day == 7) {
            System.out.println("Sunday");
        }
    }

    public static void ex4b() {
        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

    public static void ex5() {
        int hora = scan.nextInt();

        if (hora == 8 || hora == 9 || hora == 10 || hora == 11 || hora == 12) {
            System.out.println("mati");
        } else if (hora == 13 || hora == 14 || hora == 15 || hora == 16 || hora == 17 ) {
            System.out.println("migdia");
        } else if (hora == 18 || hora == 19 || hora == 20) {
            System.out.println("horabaixa");
        } else if (hora == 21 || hora == 22 || hora == 23) {
            System.out.println("vespre");
        }
    }

    public static void ex6() {
        int nota = scan.nextInt();

        if (nota == 0 || nota == 1 || nota == 2 || nota == 3 || nota == 4 ) {
            System.out.println("Insuficient");
        } else if (nota == 5) {
            System.out.println("Suficient");
        } else if (nota == 6) {
            System.out.println("Be");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Excelent");
        }
    }

    public static void ex7() {
        System.out.print("Dia: ");
        int dia = scan.nextInt();

        System.out.print("Mes: ");
        int mes = scan.nextInt();

        System.out.print("Any: ");
        int any = scan.nextInt();

        if (dia <= 30 || mes <= 12 || any <= 2060) {
            System.out.println("La data es correcte");
        } else {
            System.out.println("La data no es correcte");
        }
    }

    public static void ex8() {
        System.out.print("Dia: ");
        int dia = scan.nextInt();

        System.out.print("Mes: ");
        int mes = scan.nextInt();

        System.out.print("Any: ");
        int any = scan.nextInt();

        switch (mes) {
            case 1:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                break;
            case 2:
                dia = 28;
                if (dia <= 28) {
                    System.out.println("Data correcte");
                }
                mes = 2;
            case 3:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                mes = 3;
                break;
            case 4:
                if (dia <= 30) {
                    System.out.println("Data correcte");
                }
                mes = 4;
                break;
            case 5:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                mes = 5;
                break;
            case 6:
                if (dia <= 30) {
                    System.out.println("Data correcte");
                }
                mes = 6;
                break;
            case 7:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                mes = 7;
            case 8:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                mes = 8;
                break;
            case 9:
                if (dia <= 30) {
                    System.out.println("Data correcte");
                }
                mes = 9;
                break;
            case 10:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                mes = 10;
                break;
            case 11:
                if (dia <= 30) {
                    System.out.println("Data correcte");
                }
                mes = 11;
            case 12:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                mes = 12;
                break;
            default:
                System.out.println("Incorrecte");
                break;
        }
    }

    public static void ex9() {

        System.out.print("Num1: ");
        int num1 = scan.nextInt();

        System.out.print("Num2: ");
        int num2 = scan.nextInt();

        System.out.print("Num3: ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Numero major es: " + num1);
        } else if (num1 == num2 && num1 == num3) {
            System.out.println("Son iguals: " + num1 + num2 + num3);
        } else if (num1 < num2 && num1 < num3) {
            System.out.println("Numero menor es: " + num1);
        }
    }

    public static void ex10() {
        int age = scan.nextInt();

        if (age < 65) {
            System.out.println("No es major d'edat");
        } else {
            System.out.println("Si es major d'edat");
        }
    }
}
