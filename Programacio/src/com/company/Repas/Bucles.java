package com.company.Repas;

import java.util.Scanner;

public class Bucles {
    private static Scanner scanner;

    public static void ex1() {
        scanner = new Scanner(System.in);
        int num1;
        System.out.println("Introdueix un numero: ");
        num1 = scanner.nextInt();
        int i = 0;
        while (num1 >= i) {
            System.out.println(i);
            i++;
        }
    }

    public static void ex2() {
        scanner = new Scanner(System.in);
        int num1;
        System.out.println("Introdueix un numero: ");
        num1 = scanner.nextInt();
        while (num1 >= 0) {
            System.out.println("Introdueix un numero: ");
            num1 = scanner.nextInt();
            if (num1 < 0) {
                break;
            }
        }
    }

    public static void ex3() {
        scanner = new Scanner(System.in);
        int num1;
        do {
            System.out.println("Introdueix un numero: ");
            num1 = scanner.nextInt();
            if (num1 > 0) {
                System.out.println("Es positiu");
            } else if (num1 < 0) {
                System.out.println("Es negatiu");
            } else {
                System.out.println("S'ha acabat es bucle");
            }
        } while (num1 != 0);
    }

    public static void ex4() {
        scanner = new Scanner(System.in);
        int num1;
        System.out.println("Introdueix un numero: ");
        num1 = scanner.nextInt();
        while (num1 % 2 != 0) {
            System.out.println("Introdueix un numero: ");
            num1 = scanner.nextInt();
        }
        System.out.println(num1 + " es multiple de 2");
    }

    public static void ex5() {
        scanner = new Scanner(System.in);
        int num1;
        System.out.println("Introdueix un numero: ");
        num1 = scanner.nextInt();
        int contador = 0;

        while (num1 >= 0) {
            contador++;
            System.out.println("Introdueix un numero: ");
            num1 = scanner.nextInt();
        }
        System.out.println("S'han introduït " + contador + " numeros");
    }

    public static void ex6() {
        scanner = new Scanner(System.in);
        int num1;
        int suma = 0;
        System.out.println("Introdueix un numero: ");
        num1 = scanner.nextInt();
        while (num1 != 0) {
            suma += num1;
            System.out.println("Introdueix un numero: ");
            num1 = scanner.nextInt();
        }
        System.out.println("La suma dels numero introduits es igual a " + suma);
    }

    public static void ex7() {
        scanner = new Scanner(System.in);
        int num1;
        int suma = 0;
        double mitjana = 0;
        int contador = 0;
        System.out.println("Introdueix un numero: ");
        num1 = scanner.nextInt();
        while (num1 != 0) {
            suma += num1;
            contador++;
            System.out.println("Introdueix un numero: ");
            num1 = scanner.nextInt();
        }
        mitjana = (double) suma / contador;
        System.out.println("La mitjana dels numero introduits es igual a " + mitjana);
    }

    public static void ex8() {
        int num1 = 10;
        int mul = 1;

        for (int i = 0; i < num1; i++) {
            if (i % 2 != 0) {
                mul *= i;
            }
        }
        System.out.println("La multiplicació dels primers números senars és " + mul);
    }

    public static void ex9() {
        scanner = new Scanner(System.in);
        int num1;
        int numeroOcult = 20;
        System.out.println("Introdueix un numero: ");
        num1 = scanner.nextInt();
        int contador = 1;

        while (num1 != numeroOcult) {
            contador++;
            if (num1 > numeroOcult) {
                System.out.println("El numero introduit es major");
            } else {
                System.out.println("El numero introduit es menor");
            }
            System.out.println("Introdueix un numero: ");
            num1 = scanner.nextInt();
        }
        System.out.println("Correcte. El número ocult era " + numeroOcult);
        System.out.println("El numero de intents han estat: " + contador);
    }

    public static void ex10() {
        scanner = new Scanner(System.in);
        int n = 10;
        int numerosNegatius = 0;
        int num1;
        boolean isNegative = false;
        for (int i = 0; i < n; i++){
            System.out.println("Introdueix un numero: ");
            num1 = scanner.nextInt();
            if(num1 < 0){
                isNegative = true;
            }
        }
        if (isNegative){
            System.out.println("S'ha introduit algun numero negatiu");
        } else {
            System.out.println("No s'ha introduit cap numero negatiu");
        }
    }

    public static void ex11(){
        scanner = new Scanner(System.in);
        int n = 10;
        int num1;
        int numGran = 0;
        for (int i = 0; i < n; i++){
            System.out.println("Introdueix un numero: ");
            num1 = scanner.nextInt();
            if (num1 > numGran){
                numGran = num1;
            }
        }
        System.out.println("El numero mes gran introduit es: " + numGran);
    }

    public static void ex12(){
        scanner = new Scanner(System.in);
        int n = 10;
        int num1;
        int numAprovats = 0;
        int numSuspesos = 0;
        int numInvalids = 0;
        int suma = 0;
        double mitjana;
        for (int i = 0; i < n; i++){
            System.out.println("Introdueix un numero: ");
            num1 = scanner.nextInt();
            if (num1 >= 5 && num1 <= 10){
                numAprovats++;
            } else if (num1 >= 0 && num1 <= 4){
                numSuspesos++;
            } else{
                numInvalids++;
            }
            if(num1 >= 0 && num1 <= 10){
                suma += num1;
            }
        }
        System.out.println("Els numero d'aprovats es de: " + numAprovats);
        System.out.println("Els numero de suspesos es de: " + numSuspesos);
        System.out.println("Els numero de invalids es de: " + numInvalids);
        mitjana = (double) suma / (numAprovats + numSuspesos);
        System.out.println("La mitjana de les notes es: " + mitjana);
    }

    public static void exExtra1(){
        scanner = new Scanner(System.in);
        String texte;
        System.out.println("Introdueix un texte: ");
        texte = scanner.nextLine();

        for (int i = texte.length() - 1; i >= 0; i--){
            System.out.println(texte.charAt(i));
        }
    }

    public static void exExtra2(){
        scanner = new Scanner(System.in);
        String texte;
        boolean esPalindrome = true;
        System.out.println("Introdueix un texte: ");
        texte = scanner.nextLine();

        for (int i = 0; i < texte.length(); i++){
            if(texte.charAt(i) != texte.charAt(texte.length() - i - 1)){
                esPalindrome = false;
                break;
            }
        }
        if (esPalindrome) {
            System.out.println("'" + texte + "' és un palíndrom");
        } else {
            System.out.println("'" + texte + "' no és un palíndrom");
        }
    }

    public static void exExtra3(){
        scanner = new Scanner(System.in);
        String texte;
        System.out.println("Introdueix un texte: ");
        texte = scanner.nextLine();
        int numeroDeParaules = 1;

        for(int i=0; i < texte.length(); i++){
            if(texte.charAt(i) == ' '){
                numeroDeParaules++;
            }
        }
        if(numeroDeParaules == 1){
            System.out.println(numeroDeParaules + " paraula");
        } else {
            System.out.println(numeroDeParaules + " paraules");
        }
    }

    public static void exExtra4(){
        scanner = new Scanner(System.in);
        String texte;
        System.out.println("Introdueix un texte: ");
        texte = scanner.nextLine();
        int a = 0;
        for (int i = 0; i < texte.length(); i++){
            if (texte.charAt(i) == 'a' || texte.charAt(i) == 'A'){
                a++;
            }
        }
        System.out.println("La lletra A ha aperagut " + a + " vegades");
    }

    public static void exExtra5(){
        scanner = new Scanner(System.in);
        String texte;
        System.out.println("Introdueix un texte: ");
        texte = scanner.nextLine();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        for (int j = 0; j < texte.length(); j++){
            if (texte.charAt(j) == 'a' || texte.charAt(j) == 'A'){
                a++;
            } else if (texte.charAt(j) == 'e' || texte.charAt(j) == 'E'){
                e++;
            } else if (texte.charAt(j) == 'i' || texte.charAt(j) == 'I'){
                i++;
            } else if (texte.charAt(j) == 'o' || texte.charAt(j) == 'O'){
                o++;
            } else if (texte.charAt(j) == 'u' || texte.charAt(j) == 'U'){
                u++;
            }
        }
        System.out.println("La lletra A ha aperagut " + a + " vegades");
        System.out.println("La lletra E ha aperagut " + e + " vegades");
        System.out.println("La lletra I ha aperagut " + i + " vegades");
        System.out.println("La lletra O ha aperagut " + o + " vegades");
        System.out.println("La lletra U ha aperagut " + u + " vegades");
    }
}
