package com.company.Prova3;

public class Espai {
    private int x, y;
    private VaixellsUsuari usuari;
    private VaixellsCPU vaixell;
    private boolean es;

    /**
     * espaiDisponible. S'encarrega, una vegada tenim la casella inicial i
     * l'orientació d'un vaixell, de mirar no xocaria ni tocaria cap altre
     * vaixell en ser col·locat.
     *
     * @param tUsuari Tauler on es posa el vaicell
     * @param mida    Número de caselles que ocupa el vaixell
     * @return espaiDisponible
     */
    private boolean espaiDisponible(Tauler tUsuari, int mida, int num) {

        if (num == 1) {
            es = usuari.clickEsquerre();
        }
        if (num == 2) {
            es = vaixell.getOrientacio();
        }
        boolean espaiDisponible = true;
        if (es) {
            for (int i = x; i <= x + mida; i++) {
                if (!tUsuari.casellaDisponible(y, i)) {
                    espaiDisponible = false;
                }
            }
        } else {
            for (int i = y; i <= y + mida; i++) {
                if (!tUsuari.casellaDisponible(i, x)) {
                    espaiDisponible = false;
                }
            }
        }
        return espaiDisponible;
    }

    /**
     * hiCab. Mètode que mira si un vaixell té lloc suficient per a ser
     * col·locat sense sortir del tauler.
     *
     * @param mida Número de caselles que ocupa el vaixell
     * @return hiCab
     */
    public boolean hiCab(int mida) {
        boolean hiCab = false;
        if (usuari.clickEsquerre()) {
            hiCab = 9 - x >= mida;
        } else {
            hiCab = 9 - y >= mida;
        }
        return hiCab;
    }

    /**
     * esPotPosar. Retorna si un vaixell té lloc suficient dins el tauler (no
     * sortiria per defora) i si tocaria o es xocaria amb un altre vaixell.
     *
     * @param tUsuari Tauler on es posa el vaicell
     * @param mida    Número de caselles que ocupa el vaixell
     * @return
     */
    public boolean esPotPosar(Tauler tUsuari, int mida) {
        return hiCab(mida) && espaiDisponible(tUsuari, mida, 0);
    }
}