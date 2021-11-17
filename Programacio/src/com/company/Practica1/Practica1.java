package com.company.Practica1;

import java.util.Locale;
import java.util.Scanner;

public class Practica1 {

    private static Scanner scan = new Scanner(System.in);
    private static String string;

    public static void practica1() {

        System.out.println(" ");
        System.out.println("1. Introduir un text nou.");
        System.out.println("2. Veure el text actual.");
        System.out.println("3. Comptar el numero de lletres.");
        System.out.println("4. Comptar el numero de paraules.");
        System.out.println("5. Numero d’aparicions de cada caracters.");
        System.out.println("6. Dir el caracter mes repetit i el numero d’aparicions.");
        System.out.println("7. Dir la paraula mes repetida i el numero d’aparicions.");
        System.out.println("8. Introduir per teclat un caracter i dir quantes vegades apareix.");
        System.out.println("9. Introduir per teclat una paraula i dir quantes vegades apareix.");
        System.out.println("0. Per sortir del programa");
        System.out.println(" ");
        int opcion = scan.nextInt();

        switch (opcion) {
            case 0:
                break;
            case 1:
                introduirText();
                break;
            case 2:
                veureText();
                break;
            case 3:
                comptarLletres();
                break;
            case 4:
                comptarParaules();
                break;
            case 5:
                aparicionsCaracter();
                break;
            case 6:
                caracterMesRepetit();
                break;
            case 7:
                paraulaMesRepetida();
                break;
            case 8:
                introduirCaracter();
                break;
            case 9:
                introduirParaula();
                break;
            default:
                practica1();
                break;
        }


    }

    public static String introduirText() {

        System.out.println("Introdueix un text nou: ");
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();

        practica1();

        return string;
    }

    public static void veureText() {
        System.out.println(string);

        practica1();

    }

    public static void comptarLletres() {
        int contador = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                contador++;
            }
        }
        System.out.println("El numero de lletres es de " + contador);

        practica1();
    }

    public static void comptarParaules() {
        String texte = string;
        int contador = 0;

        for (int i = 0; i < string.length(); i++) {
            if (texte.charAt(i) == ' ') {
                contador++;
            }
        }
        if(string.length() > 0){
            contador++;
        }

        System.out.println("El numero de paraules es de " + contador);

        practica1();
    }

    public static void aparicionsCaracter() {
        int[] contadorLletres = new int[32];
        char[] lletres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ',', '?',
                '!', ':'};
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'a':
                case 'A':
                    contadorLletres[0]++;
                    break;
                case 'b':
                case 'B':
                    contadorLletres[1]++;
                    break;
                case 'c':
                case 'C':
                    contadorLletres[2]++;
                    break;
                case 'd':
                case 'D':
                    contadorLletres[3]++;
                    break;
                case 'e':
                case 'E':
                    contadorLletres[4]++;
                    break;
                case 'f':
                case 'F':
                    contadorLletres[5]++;
                    break;
                case 'g':
                case 'G':
                    contadorLletres[6]++;
                    break;
                case 'h':
                case 'H':
                    contadorLletres[7]++;
                    break;
                case 'i':
                case 'I':
                    contadorLletres[8]++;
                    break;
                case 'j':
                case 'J':
                    contadorLletres[9]++;
                    break;
                case 'k':
                case 'K':
                    contadorLletres[10]++;
                    break;
                case 'l':
                case 'L':
                    contadorLletres[11]++;
                    break;
                case 'm':
                case 'M':
                    contadorLletres[12]++;
                    break;
                case 'n':
                case 'N':
                    contadorLletres[13]++;
                    break;
                case 'ñ':
                case 'Ñ':
                    contadorLletres[14]++;
                    break;
                case 'o':
                case 'O':
                    contadorLletres[15]++;
                    break;
                case 'p':
                case 'P':
                    contadorLletres[16]++;
                    break;
                case 'q':
                case 'Q':
                    contadorLletres[17]++;
                    break;
                case 'r':
                case 'R':
                    contadorLletres[18]++;
                    break;
                case 's':
                case 'S':
                    contadorLletres[19]++;
                    break;
                case 't':
                case 'T':
                    contadorLletres[20]++;
                    break;
                case 'u':
                case 'U':
                    contadorLletres[21]++;
                    break;
                case 'v':
                case 'V':
                    contadorLletres[22]++;
                    break;
                case 'w':
                case 'W':
                    contadorLletres[23]++;
                    break;
                case 'x':
                case 'X':
                    contadorLletres[24]++;
                    break;
                case 'y':
                case 'Y':
                    contadorLletres[25]++;
                    break;
                case 'z':
                case 'Z':
                    contadorLletres[26]++;
                    break;
                case '.':
                    contadorLletres[27]++;
                    break;
                case ',':
                    contadorLletres[28]++;
                    break;
                case '?':
                    contadorLletres[29]++;
                    break;
                case '!':
                    contadorLletres[30]++;
                    break;
                case ':':
                    contadorLletres[31]++;
                    break;
            }
        }

        for (int i = 0; i < contadorLletres.length; i++) {
            if (contadorLletres[i] >= contadorLletres[i]) {
                System.out.println("El caracter " + lletres[i] + " apareix: " + contadorLletres[i] + " vegades");
            }
        }

        practica1();
    }

    public static void caracterMesRepetit() {
        int[] contadorLletres = new int[32];
        char[] lletres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ',', '?',
                '!', ':'};

        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'a':
                case 'A':
                    contadorLletres[0]++;
                    break;
                case 'b':
                case 'B':
                    contadorLletres[1]++;
                    break;
                case 'c':
                case 'C':
                    contadorLletres[2]++;
                    break;
                case 'd':
                case 'D':
                    contadorLletres[3]++;
                    break;
                case 'e':
                case 'E':
                    contadorLletres[4]++;
                    break;
                case 'f':
                case 'F':
                    contadorLletres[5]++;
                    break;
                case 'g':
                case 'G':
                    contadorLletres[6]++;
                    break;
                case 'h':
                case 'H':
                    contadorLletres[7]++;
                    break;
                case 'i':
                case 'I':
                    contadorLletres[8]++;
                    break;
                case 'j':
                case 'J':
                    contadorLletres[9]++;
                    break;
                case 'k':
                case 'K':
                    contadorLletres[10]++;
                    break;
                case 'l':
                case 'L':
                    contadorLletres[11]++;
                    break;
                case 'm':
                case 'M':
                    contadorLletres[12]++;
                    break;
                case 'n':
                case 'N':
                    contadorLletres[13]++;
                    break;
                case 'ñ':
                case 'Ñ':
                    contadorLletres[14]++;
                    break;
                case 'o':
                case 'O':
                    contadorLletres[15]++;
                    break;
                case 'p':
                case 'P':
                    contadorLletres[16]++;
                    break;
                case 'q':
                case 'Q':
                    contadorLletres[17]++;
                    break;
                case 'r':
                case 'R':
                    contadorLletres[18]++;
                    break;
                case 's':
                case 'S':
                    contadorLletres[19]++;
                    break;
                case 't':
                case 'T':
                    contadorLletres[20]++;
                    break;
                case 'u':
                case 'U':
                    contadorLletres[21]++;
                    break;
                case 'v':
                case 'V':
                    contadorLletres[22]++;
                    break;
                case 'w':
                case 'W':
                    contadorLletres[23]++;
                    break;
                case 'x':
                case 'X':
                    contadorLletres[24]++;
                    break;
                case 'y':
                case 'Y':
                    contadorLletres[25]++;
                    break;
                case 'z':
                case 'Z':
                    contadorLletres[26]++;
                    break;
                case '.':
                    contadorLletres[27]++;
                    break;
                case ',':
                    contadorLletres[28]++;
                    break;
                case '?':
                    contadorLletres[29]++;
                    break;
                case '!':
                    contadorLletres[30]++;
                    break;
                case ':':
                    contadorLletres[31]++;
                    break;
            }
        }

        int contador = 0;


        for (int i = 0; i < contadorLletres.length; i++) {
            if ((i + 1) <= 31) {
                if (contadorLletres[contador] <= contadorLletres[i]) {
                    contador = i;
                }
            }
        }

        System.out.println("El caracter més repetit es " + lletres[contador] + " amb " + contadorLletres[contador] + " aparicions");

        practica1();
    }

    public static void paraulaMesRepetida() {
        String[] paraules = string.split("\\W+");

        int contador = 0;
        int contadorMasRepetido = 0;
        int palabraMasRepetida = -1;

        for (int i = 0; i < paraules.length; i++) {

            contador = 0;

            for (int j = 0; j < paraules.length; j++) {
                if (paraules[i].equalsIgnoreCase(paraules[j])) {
                    contador++;
                }
            }
            if (contadorMasRepetido < contador) {
                contadorMasRepetido = contador;
                palabraMasRepetida = i;
            }

        }
        System.out.println("La paraula mes repetida es " + paraules[palabraMasRepetida] + " amb " + contadorMasRepetido + " repeticiones");

        practica1();
    }

    public static void introduirCaracter() {
        scan = new Scanner(System.in);
        System.out.println("Escriu un caracter que vulguis cercar al teu texte: ");
        char caracter = scan.next().charAt(0);
        System.out.println(caracter);

        int posicion = 0;
        int contador = 0;

        posicion = string.indexOf(caracter);

        while(posicion != -1){
            contador++;

            posicion = string.indexOf(caracter, posicion + 1);
        }

        System.out.println("El caracter " + caracter + " es repeteix "+contador+" vegades");

        practica1();
    }

    public static void introduirParaula() {
        scan = new Scanner(System.in);
        System.out.println("Escriu una paraula que vulguis cercar al teu texte: ");
        String paraula = scan.nextLine();
        String[] paraules = string.split("\\W+");
        int contador = 0;

        for (int i = 0; i < paraules.length; i++) {
            if (paraula.equalsIgnoreCase(paraules[i])) {
                contador++;
            }
        }
        System.out.println("La paraula es repeteix " + contador + " vegades.");

        practica1();
    }
}