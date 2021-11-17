package com.company.Examen;

import java.util.ArrayList;

public class Equip {
    private String nom;
    private ArrayList<Jugador> jugadors;
    private Jugador capita;

    public Equip(String nom, ArrayList<Jugador> jugadors, Jugador capita) {
        this.nom = nom;
        this.jugadors = jugadors;
        this.capita = capita;
    }

    public void fitxatge(Jugador jugador) {
        this.jugadors.add(jugador);
    }

    public Jugador maximGolejador() {
        Jugador jugador = new Jugador("", 0, 0, "", 0);
        for (int i = 0; i < this.jugadors.size(); i++) {
            if (this.jugadors.get(i).getGols() > jugador.getGols()) {
                jugador = this.jugadors.get(i);
            }
        }
        return jugador;
    }

    public int numCentrals() {
        int numCentrals = 0;
        for (int i = 0; i < jugadors.size(); i++) {
            if (jugadors.get(i).getPosicio().equals("central")) {
                numCentrals++;
            }
        }
        return numCentrals;
    }

    public void assignarCapita() {
        this.capita = maximGolejador();;
    }
}
