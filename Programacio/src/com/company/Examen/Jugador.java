package com.company.Examen;

public class Jugador {
    private String nom;
    private int edat;
    private int dorsal;
    private String posicio;
    private int gols;

    public Jugador(String nom, int edat, int dorsal, String posicio, int gols) {
        this.nom = nom;
        this.edat = edat;
        this.dorsal = dorsal;
        this.posicio = posicio;
        this.gols = gols;
    }

    public int getGols() {
        return this.gols;
    }

    public String getPosicio() {
        return this.posicio;
    }
}
