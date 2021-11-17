package com.company.Revisio;

import java.util.Random;
import java.util.Scanner;

public class Revisio1 {

    private static Scanner scanner;

    public static void max() {
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println(a + " es major que " + b);
        } else if (a < b) {
            System.out.println(a + " es menor que " + b);
        } else {
            System.out.println(a + " es igual que " + b);
        }
    }

    public static void mult() {
        int a = 10;
        int b = 5;

        if (a % b == 0) {
            System.out.println(a + " es multiple de " + b);
        } else {
            System.out.println(a + " no es multiple de " + b);
        }
    }

    public static void xifres() {
        int num = 6;
        if (num >= 0 && num <= 9) {
            System.out.println(num + " te una xifra");
        } else if (num <= 99) {
            System.out.println(num + " te dues xifres");
        } else if (num <= 999) {
            System.out.println(num + " te tres xifres");
        } else if (num <= 9999) {
            System.out.println(num + " te cuatre xifres");
        } else {
            System.out.println(num + " es un numero invalid");
        }
    }

    public static void inverse() {
        int num = 2345;
        int invertit = 0;
        int rest;

        while (num > 0) {
            rest = num % 10;
            invertit = invertit * 10 + rest;
            num /= 10;
        }
        System.out.println("Numero invertit: " + invertit);
    }

    public static void dates() {
        scanner = new Scanner(System.in);
        int dia1;
        int mes1;
        int any1;
        int dia2;
        int mes2;
        int any2;

        System.out.println("Introdueix el dia de la primera data: ");
        dia1 = scanner.nextInt();

        while (dia1 <= 0 || dia1 > 31) {
            System.out.println("ERROR, el dia ha der ser del 1 al 31");
            System.out.println("Introdueix el dia de la primera data: ");
            dia1 = scanner.nextInt();
        }

        System.out.println("Introdueix el mes de la primera data: ");
        mes1 = scanner.nextInt();

        if (mes1 <= 0 || mes1 > 12) {
            System.out.println("ERROR, el mes ha der ser del 1 al 12");
            System.out.println("Introdueix el mes de la primera data: ");
            mes1 = scanner.nextInt();
        }

        int diesMesos1 = mes1 * 30;

        System.out.println("Introdueix l'any de la primera data: ");
        any1 = scanner.nextInt();

        int diesAny1 = any1 * 365;

        System.out.println("Introdueix el dia de la segona data: ");
        dia2 = scanner.nextInt();

        while (dia2 <= 0 || dia2 > 31) {
            System.out.println("ERROR, el dia ha der ser del 1 al 31");
            System.out.println("Introdueix el dia de la segona data: ");
            dia2 = scanner.nextInt();
        }

        System.out.println("Introdueix el mes de la segona data: ");
        mes2 = scanner.nextInt();

        if (mes2 <= 0 || mes2 > 12) {
            System.out.println("ERROR, el mes ha der ser del 1 al 12");
            System.out.println("Introdueix el mes de la segona data: ");
            mes2 = scanner.nextInt();
        }

        int diesMesos2 = mes2 * 30;

        System.out.println("Introdueix l'any de la segona data: ");
        any2 = scanner.nextInt();

        int diesAny2 = any2 * 365;

        int calculacioData1 = dia1 + diesMesos1 + diesAny1;
        int calculacioData2 = dia2 + diesMesos2 + diesAny2;

        int calculFinal = calculacioData1 - calculacioData2;
        calculFinal = calculFinal * -1;

        System.out.println("La diferencia de dies es de: " + calculFinal);
    }

    public static void segonSeguent() {
        scanner = new Scanner(System.in);
        System.out.println("Introdueix una hora entre 1-24");
        int hora;
        int minut;
        int segon;
        hora = scanner.nextInt();

        if (hora < 1 || hora > 24) {
            System.out.println("L'hora introduïda no es correcte");
            System.out.println("Introdueix una hora entre 1-24");
            hora = scanner.nextInt();
        }

        System.out.println("Introdueïx un minut entre 0-60");
        minut = scanner.nextInt();
        if (minut < 0 || minut > 60) {
            System.out.println("El minut introduït no es correcte");
            System.out.println("Introdueïx un minut entre 0-60");
            minut = scanner.nextInt();
        }

        System.out.println("Introdueïx un segon entre 0-60");
        segon = scanner.nextInt();
        if (segon < 0 || segon > 60) {
            System.out.println("El segon introduït no es correcte");
            System.out.println("Introdueïx un segon entre 0-60");
            segon = scanner.nextInt();
        }

        segon++;

        if (segon == 60) {
            minut++;
            segon = 00;
        }
        if (minut == 60) {
            hora++;
            minut = 00;
        }
        if (hora == 24) {
            hora = 00;
        }

        System.out.println("L'hora següent de la introduïda es: " + hora + ":" + minut + ":" + segon);
    }

    public static void numeroAlQuadrat() {
        scanner = new Scanner(System.in);
        int num;
        int quadrat = 0;
        System.out.println("Introdueïx un numero: ");
        num = scanner.nextInt();

        while (num > 0) {
            quadrat = num * num;
            System.out.println("El quadrat del numero introduït es: " + quadrat);
            System.out.println("Introdueïx un numero: ");
            num = scanner.nextInt();
        }
        System.out.println("El numero introduit es negatiu");
    }

    public static void numeroAlQuadrat2() {
        scanner = new Scanner(System.in);
        int num;
        int quadrat = 0;
        int suma = 0;
        System.out.println("Introdueïx un numero: ");
        num = scanner.nextInt();

        while (num > 0) {
            quadrat = num * num;
            System.out.println("El quadrat del numero introduït es: " + quadrat);
            System.out.println("Introdueïx un numero: ");
            num = scanner.nextInt();
            suma += quadrat;
        }
        System.out.println("El numero introduit es negatiu");
        System.out.println("La suma dels quadrats es: " + suma);
    }

    public static void multiple2() {
        scanner = new Scanner(System.in);
        int num;
        int contador = 1;
        System.out.println("Introdueïx un numero: ");
        num = scanner.nextInt();

        while (num != 0) {
            contador++;
            if (num % 2 == 0) {
                System.out.println("Es multiple de 2");
                System.out.println("Introdueïx un numero: ");
                num = scanner.nextInt();
            } else {
                System.out.println("No es multiple de 2");
                System.out.println("Introdueïx un numero: ");
                num = scanner.nextInt();
            }
        }
        System.out.println("S'han introduït " + contador + " numeros");
    }

    public static void adivinarNumero() {
        scanner = new Scanner(System.in);
        int max;
        System.out.println("Introdueix un numero maxim per al joc: ");
        max = scanner.nextInt();
        Random random = new Random();
        int numerorandom = random.nextInt(max);
        int num2;

        System.out.println("Introdueix un numero: ");
        num2 = scanner.nextInt();

        while (num2 != max) {
            if (num2 > numerorandom) {
                System.out.println("El numero que has posat es major al resultat");

            } else if (num2 < numerorandom) {
                System.out.println("El numero que has posat es menor al resultat");
            } else {
                System.out.println("El numero que has posat es el correcte");
                break;
            }
            System.out.println("Introdueix un numero: ");
            num2 = scanner.nextInt();
        }
    }

    public static void calcularMitjana() {
        scanner = new Scanner(System.in);
        int num;
        System.out.println("Introdueix un numero: ");
        num = scanner.nextInt();
        int contador = 0;
        int suma = 0;
        double mitjana = 0;

        while (num >= 0) {
            contador++;
            suma += num;
            System.out.println("Introdueix un numero: ");
            num = scanner.nextInt();
        }
        mitjana = (double) suma / contador;
        System.out.println("La mitjana dels numeros introduïts es: " + mitjana);
    }

    public static void mostrarMultiples() {
        scanner = new Scanner(System.in);
        int maxim;
        int multiple;
        System.out.println("Introdueix un numero maxim: ");
        maxim = scanner.nextInt();
        System.out.println("Introdueix un numero multiple: ");
        multiple = scanner.nextInt();
        System.out.println(" ");

        for (int i = 0; i < maxim; i++) {
            if (i % multiple == 0) {
                System.out.println(i);
            }
        }
    }

    public static void mostrarMultiplesInverse() {
        scanner = new Scanner(System.in);
        int maxim;
        int multiple;
        System.out.println("Introdueix un numero maxim: ");
        maxim = scanner.nextInt();
        System.out.println("Introdueix un numero multiple: ");
        multiple = scanner.nextInt();
        System.out.println(" ");

        for (int i = maxim; i > 0; i--) {
            if (i % multiple == 0) {
                System.out.println(i);
            }
        }
    }

    public static void producteSenars(){
        scanner = new Scanner(System.in);
        int n;
        int producte = 1;
        System.out.println("Introdueix un numero: ");
        n = scanner.nextInt();
        for(int i = 0; i <= n; i++){
            if(i % 2 != 0){
                producte *= i;
            }
        }
        System.out.println(producte);
    }

    public static void calcularFactorial(){
        scanner = new Scanner(System.in);
        int num;
        int factorial = 1;
        System.out.println("Introdueix un numero: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static void mitjana(){
        scanner = new Scanner(System.in);
        int num;
        int n = 10;
        int contador1 = 0;
        int contador2 = 0;
        int positius = 0;
        int negatius = 0;
        double mitjanaPositius = 0;
        double mitjanaNegatius = 0;
        int cerosIntrodiuts = 0;

        for (int i = 0; i < n; i++){
            System.out.println("Introdueix un numero: ");
            num = scanner.nextInt();
            if (num > 0){
                contador1++;
                positius += num;
            } else if(num < 0){
                contador2++;
                negatius += num;
            } else {
                cerosIntrodiuts++;
            }
        }
        mitjanaPositius = (double) positius / contador1;
        mitjanaNegatius = (double) negatius / contador2;
        System.out.println("La mitjana dels positius introduïts es: " + mitjanaPositius);
        System.out.println("La mitjana dels negatius introduïts es: " + mitjanaNegatius);
        System.out.println("S'han introduït " + cerosIntrodiuts + " ceros");
    }

    public static void alumnes(){
        scanner = new Scanner(System.in);
        int n = 5;
        int edat;
        double altura;
        int majors = 0;
        int alts = 0;
        int contador1 = 0;
        double contador2 = 0;
        double mitjanaEdat = 0;
        double mitjanaAltura = 0;
        for (int i = 0; i < n; i++){
            System.out.println("Introdueix l'edat: ");
            edat = scanner.nextInt();
            System.out.println("Introdueix l'altura: ");
            altura = scanner.nextDouble();

            contador1 += edat;
            contador2 += altura;

            if (edat > 17){
                majors++;
            }
            if(altura > 1.75){
                alts++;
            }
        }
        mitjanaEdat = (double) contador1 / n;
        mitjanaAltura = (double) contador2 / n;
        System.out.println("La mitjana de l'edat es: " + mitjanaEdat);
        System.out.println("La mitjana de l'altura es: " + mitjanaAltura);
        System.out.println("Alumnes majors d'edat: " + majors);
        System.out.println("Alumnes altura superior a 1.75: " + alts);
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

    public  static void notes() {
        scanner = new Scanner(System.in);
        int n = 10;
        int notes;
        int suspesos = 0;
        int bens = 0;
        int notables = 0;
        int exelents = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Introdueix la teva nota: ");
            notes = scanner.nextInt();

            if(notes < 0 || notes > 10){
                System.out.println("La nota introduïda no es vàlida");
                System.out.println("Introdueix la teva nota: ");
                notes = scanner.nextInt();
            } else if(notes >= 0 && notes < 5){
                suspesos++;
            } else if (notes >= 5 && notes <= 6){
                bens++;
            } else if (notes >= 7 && notes <= 8){
                notables++;
            } else if(notes >= 9 && notes <= 10){
                exelents++;
            }
        }
        System.out.println("Suspesos: " + suspesos);
        System.out.println("Bens: " + bens);
        System.out.println("Notables: " + notables);
        System.out.println("Exel·lents: " + exelents);
    }

    public static void multipleDe3(){
        scanner = new Scanner(System.in);
        int n = 5;
        int num;

        for(int i = 0; i < n; i++){
            System.out.println("Introdueix un numero: ");
            num = scanner.nextInt();
            if (num % 3 == 0){
                System.out.println(num + " es multiple de 3");
                System.out.println("");
            }
        }
    }
}