package com.company.Repas;

public class Obra {
    private static String titol;
    private static String tematica;
    private static int numPagines;

    public Obra(){}

    public Obra(String titol, String tematica, int numPagines){
        this.titol = titol;
        this.tematica = tematica;
        this.numPagines = numPagines;
    }

    public String getTitol(){
        return this.titol;
    }

    public int getNumPagines(){
        return this.numPagines;
    }
}
