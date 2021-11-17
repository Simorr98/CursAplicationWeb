package com.company.Exercicis;

import java.util.Scanner;

public class ScannerExs {
    public static Scanner sc = new java.util.Scanner(System.in);

    public static void ex3() {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int suma = a + b;
        int resta = a - b;
        int mult = a * b;
        double divisio = (double) a / b;

        System.out.println(" ");
        System.out.println("La suma de a i b es de " + suma);
        System.out.println("La resta de a i b es de " + resta);
        System.out.println("La multiplicacio de a i b es de " + mult);
        System.out.println("La divisio de a i b es de " + divisio);
    }

    public static void ex4() {
        System.out.println("Introduce dos numeros enteros: (Uno debajo del otro)");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(" ");
        System.out.println("("+ a +" * (" + b + " + 2) * 10");

        int suma = b+2;

        System.out.println(a + " * " + suma + " * 10");
        System.out.println(a + " * " + suma + " * 10");

        int mult = a*suma*10;

        System.out.println("El resultat es: " + mult);
    }

    public static void ex5() {

        double c = sc.nextFloat();

        System.out.println(c + "Cº a Fº");

        double divisio = (double) 9/c;
        double resultado = divisio+32;

        System.out.println("F = " + resultado);
    }

    public static void ex6() {

        double euros = sc.nextDouble();
        double dolar = 1.18;
        double resultat = euros*dolar;

        System.out.println(euros + " euros son en total " + resultat + " dolars");
    }

    public static void ex7() {

        int a;
        int b;
        int aux;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Valor inicial de a = " + a);
        System.out.println("Valor inicial de b = " + b);
        System.out.println("   ");

        aux = a;
        a = b;
        b = aux;

        System.out.println("Valor intercanviat de a = " + a);
        System.out.println("Valor intercanviat de b = " + b);
    }

    public static void ex8() {

        int a;
        int b;
        int c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double belevat = b*b;
        double mult = 4*a*c;
        double resul = belevat-mult;
        double mult2 = 2*a;
        double div = resul/mult2;


        System.out.println(belevat);
        System.out.println(mult);
        System.out.println(resul);
        System.out.println(mult2);
        System.out.println("El Resultat es: " + div);
    }

    public static void ex9() {
        double altura;
        double amplada;

        amplada = sc.nextDouble();
        altura = sc.nextDouble();

        double area = altura*amplada;

        System.out.println("Area de rectangle: " + area);

        // 2*(amplada+altura)
        double suma = amplada+altura;
        double mult = 2*suma;

        System.out.println("Perimetro de rectangle: " + mult);
    }

    public static void ex10() {

        double pi;
        double h;
        double d;
        double volum;

        pi = 3.14;
        h = sc.nextDouble();
        d = sc.nextDouble();

        // V = pi * r2 * h

        double radi = d / 2;
        double radielevat = radi*radi;
        volum = pi*radielevat*h;

        System.out.println("El volum de un cilindre amb altura " + h + " i amb diametre " + d + " te un volum de " + volum);
    }
}
