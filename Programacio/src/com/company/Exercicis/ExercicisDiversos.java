package com.company.Exercicis;

public class ExercicisDiversos {
    //Exercici 1
    public static void minim(String[] args) {
        int array[] = new int [5];
        int valorMin = 0;
        int contadorMinimos = 0;

        System.out.println("Array: ");

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random()*100)+1;

            System.out.print(array[i] + "//");

            valorMin = array[0];

            if (valorMin > array[i]) {
                valorMin=array[i];
                contadorMinimos++;
            }

        }

        System.out.println("");
        System.out.println("El valor minimo es " + valorMin + " y se ha repetido " + contadorMinimos + " veces.");
    }
}
