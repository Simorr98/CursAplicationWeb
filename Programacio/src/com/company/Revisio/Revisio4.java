package com.company.Revisio;

import java.util.Scanner;

public class Revisio4 {

    private static Scanner scanner;

    public static void sumaColumna() {
        int x = 4;
        int n = 4;
        int[][] array = new int[n][x];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void ompleContingut() {
        scanner = new Scanner(System.in);
        int x = 4;
        int n = 4;
        int[][] array = new int[n][x];
        int num;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introdueix un numero per omplir el array: ");
                num = scanner.nextInt();
                array[i][j] = num;
            }
        }

        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
            System.out.println(" ");
        }

        if (array[0][1] == array[1][0] || array[0][2] == array[2][0] || array[0][3] == array[3][0] || array[1][2] == array[2][1] || array[1][3] == array[3][1] || array[2][3] == array[3][2]){
            System.out.println("L'array es simetrica");
        } else {
            System.out.println("L'array no es simetrica");
        }
    }
}