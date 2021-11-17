package com.company.Repas;

import java.util.Scanner;

public class Condicionals {
    private static Scanner sc;
    private static int num1;
    private static int num2;

    public static void ex1(){
        sc = new Scanner(System.in);

        System.out.println("Introdueix un numero: ");
        num1 = sc.nextInt();

        if(num1 > 0){
            System.out.println("Es positiu");
        } else if(num1 < 0){
            System.out.println("Es negatiu");
        } else {
            System.out.println("Ni positiu ni negatiu");
        }
    }

    public static void ex2() {
        sc = new Scanner(System.in);

        System.out.println("Introdueix un numero: ");
        num1 = sc.nextInt();

        if (num1 % 2 == 0 ) {
            System.out.println("Es multiple de 2");
        } else {
            System.out.println("No es multiple de 2");
        }
    }

    public static void ex3() {
        sc = new Scanner(System.in);

        System.out.println("Introdueix un numero: ");
        num1 = sc.nextInt();

        System.out.println("Introdueix un numero: ");
        num2 = sc.nextInt();

        if(num1 < num2){
            System.out.println(num2 + " es mes gran que " + num1);
        } else if(num1 > num2){
            System.out.println(num1 + " es mes gran que " + num2);
        } else {
            System.out.println(num2 + " es igual que " + num1);
        }
    }

    public static void ex4a() {
        sc = new Scanner(System.in);

        System.out.println("Introdueix un numero: ");
        num1 = sc.nextInt();

        if(num1 == 1){
            System.out.println("Dilluns");
        } else if(num1 == 2){
            System.out.println("Dimarts");
        } else if(num1 == 3){
            System.out.println("Dimecres");
        } else if(num1 == 4){
            System.out.println("Dijous");
        } else if(num1 == 5){
            System.out.println("Divendres");
        } else if(num1 == 6){
            System.out.println("Dissabte");
        }else if(num1 == 7){
            System.out.println("Diumenge");
        } else {
            System.out.println("Valor incorrecte");
        }
    }

    public static void ex4b() {

    }
}
