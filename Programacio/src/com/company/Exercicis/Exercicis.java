package com.company.Exercicis;

public class Exercicis {
    public static void ex2() {
        String nom = "Simo Ramos Rayo";
        System.out.println("El meu nom es " + nom);
    }

    public static void ex3() {
        int a = 20;
        int b = 40;

        int suma = a + b;
        int resta = a - b;
        int mult = a * b;
        int divisio = a / b;

        System.out.println(" ");
        System.out.println("La suma de a i b es de " + suma);
        System.out.println("La resta de a i b es de " + resta);
        System.out.println("La multiplicacio de a i b es de " + mult);
        System.out.println("La divisio de a i b es de " + divisio);
    }

    public static void ex4() {
        int a = 3;
        int b = 6;

        System.out.println("("+ a +"*(" + b +" + 2)*10");
        int suma = b+2;
        System.out.println("(" + a + "*(" + suma + ")*10");
        System.out.println("a * " + suma + " * 10");
        int mult = a*suma*10;
        System.out.println("El resultat es: " + mult);
    }

    public static void ex5() {
        float c = 30;

        System.out.println(c + "Cº a Fº");

        float divisio = 9/c;
        float resultado = divisio+32;

        System.out.println("F = " + resultado);
    }

    public static void ex6() {
        double euros = 20;
        double dolar = 1.18;
        double resultat = euros*dolar;

        System.out.println(euros + " son en total " + resultat + " dolars");
    }

    public static void ex7() {
        int a;
        int b;
        int aux;

        a = 5;
        b = 10;

        System.out.println("Valor inicial de b = " + b);
        System.out.println("Valor inicial de a = " + a);
        System.out.println("   ");

        //resultat = a = 10 i b = 5

        aux = a;
        a = b;
        b = aux;

        System.out.println("Valor intercanviat de b = " + b);
        System.out.println("Valor intercanviat de a = " + a);
    }

    public static void ex8() {
        int a;
        int b;
        int c;

        a = 10;
        b = 5;
        c = 3;

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

        amplada = 2.50;
        altura = 4;

        double area = altura*amplada;

        System.out.println("Area de rectangle: " + area);

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
        h = 20;
        d = 40;

        double radi = d / 2;
        double radielevat = radi*radi;
        volum = pi*radielevat*h;

        System.out.println("El volum de un cilindre amb altura " + h + " i amb diametre " + d + " es un total de " + volum);

    }
}
