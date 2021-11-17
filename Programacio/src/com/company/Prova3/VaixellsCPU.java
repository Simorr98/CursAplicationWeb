package com.company.Prova3;

import java.util.Random;

public class VaixellsCPU {

    private int x, y;//coordenades de la casella
    private boolean colocat, orientacio;
    private static final Espai e = new Espai();
    private static final Random r = new Random();

    /**
     * distribucioAleatoria. Posa els vaixells de la cpu aleatòriament al tauler.
     *
     * @param cpu Tauler on es distribueixen els vaixells
     */
    public void distribucioAleatoria(Tauler cpu) {
        for (int i = 0; i < 3; i++) {
            posarVaixell(cpu, 1);
        }
        for (int i = 0; i < 4; i++) {
            posarVaixell(cpu, 0);
        }
    }


    /**
     * posar. Mètode per col·locar, aleatòriament, un vaixell.
     *
     * @param cpu Tauler que reb per paràmetre on posa el vaixell. orientacio:
     *            Boolean que indica si el vaixell està col·locat en vertical (false) o
     *            horitzontal (true). coloca: Boolean per controlar si el vaixell ha esta
     *            col·locat correctament.
     */
    private void posarVaixell(Tauler cpu, int mida) {
        colocat = false;

        while (!colocat) {
            // generar casella aleatoria
            y = (int) (Math.random() * (9 + 1));
            x = (int) (Math.random() * (9 + 1));
            // generar orientació aleatoria
            orientacio = r.nextBoolean();
            if (cpu.casellaDisponible(y, x)) {
                if (e.esPotPosar(cpu, mida)) {
                    colocar(cpu, mida);
                    colocat = true;
                }
            }
        }
    }

    /**
     * colocar. Mètode per posar el vaixell al tauler. Segons el boolean
     * 'orientacio' es posa en horitzontal o en vertical.
     *
     * @param cpu  Tauler al qual es posa el vaixell
     * @param mida Número de caselles que ocupa el vaixell
     */
    private void colocar(Tauler cpu, int mida) {
        // int xInicial, yInicial, xFinal, yFinal;
        // codi suprimit per l'exercici
        // disponibilitat(cpu, xInicial, yInicial, xFinal, yFinal);
    }

    /**
     * disponibilitat. Aquest mètode s'encarrega de posar 'disponible=false' a
     * les caselles que envolten un vaixell. Així, a l'hora de posar un nou
     * vaixell, no es tocarà amb els altres.
     *
     * @param cpu Tauler al qual es posen les peces
     * @param xi  Coordenada 'x' inicial del vaixell
     * @param yi  Coordenada 'y' inicial del vaixell
     * @param xf  Coordenada 'x' final del vaixell
     * @param yf  Coordenada 'y' final del vaixell
     */
    private void disponibilitat(Tauler cpu, int xi, int yi, int xf, int yf) {
        // codi suprimit per l'exercici
    }

    public boolean getOrientacio() {
        return orientacio;
    }
}