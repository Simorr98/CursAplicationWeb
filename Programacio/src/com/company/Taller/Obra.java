package com.company.Taller;

public class Obra {
    private String titol;
    private String tematica;
    private int numPagines;

    private Obra(String titol, String tematica, int numPagines){
        this.titol = titol;
        this.tematica = tematica;
        this.numPagines = numPagines;
    }

    public Obra(){}

    public String getTitol() {
        return this.titol;
    }

    public int getNumPagines() {
        return this.numPagines;
    }
}
