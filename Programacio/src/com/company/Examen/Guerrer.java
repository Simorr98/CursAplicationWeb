package com.company.Examen;

import java.util.ArrayList;

public class Guerrer {
    private String nom;
    private int nivell;
    private int vidaActual;
    private int vidaMaxima;
    private ArrayList<Arma> armes;
    private Arma armaActiva;

    public Guerrer (String nom, int nivell, int vidaActual, int vidaMaxima, ArrayList<Arma> armes, Arma armaActiva) {
        this.nom = nom;
        this.nivell = nivell;
        this.vidaActual = vidaActual;
        this.vidaMaxima = vidaMaxima;
        this.armes = armes;
        this.armaActiva = armaActiva;
    }

    public void pujaNivell() {
        if (this.nivell < 18) {
            this.nivell++;
            this.vidaMaxima = (int)(this.vidaMaxima + this.vidaMaxima * 0.05);
            this.vidaActual = (int)(this.vidaActual + this.vidaActual * 0.05);
        }
    }

    public void novaArma(Arma arma) {
        this.armes.add(arma);
    }


    public Arma canviArma(int arma) {
        this.armaActiva = this.armes.get(arma);
        return this.armaActiva;
    }

    public void activarMillorArma() {
        Arma arma = new Arma("", 0);
        for (int i = 0; i < this.armes.size(); i++) {
            if (this.armes.get(i).getAtac() > arma.getAtac()) {
                arma = this.armes.get(i);
            }
        }
        this.armaActiva = arma;
    }
}
