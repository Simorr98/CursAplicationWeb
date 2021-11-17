package com.company.Prova3;

import java.awt.event.MouseEvent;

public class VaixellsUsuari {

    //coordenades de la casella a partir de la qual es vol posar un vaixell:
    private int x, y;
    //per saber si s'han colocat cada un dels vaixells:
    private boolean colocat2 = false;
    private boolean colocat1 = false;
    public static boolean vaixellsColocats = false; //per quan s'han col·locat tots els vaixells

    //número de vaixells que es posen de cada tipus
    private int vaixell2 = 3;
    private int vaixell1 = 4;

    private static final Espai e = new Espai();

    /**
     * posarDefinitiu. Mètode per posar tots els vaixell al tauler de manera
     * definitiva
     *
     * @param tUsuari
     */
    public void posarDefinitiu(Tauler tUsuari) {
        posarVaixell(tUsuari, 1, vaixell2, colocat2);

        if (colocat2) {
            posarVaixell(tUsuari, 0, vaixell1, colocat1);
        }
        if (colocat2 && colocat1) {
            vaixellsColocats = true;
        }
    }

    private void posarVaixell(Tauler tUsuari, int mida, int vaixellGeneral, boolean colocat) {
        obtenirCasella(tUsuari);
        if (tUsuari.casellaDisponible(y, x)) {
            if (e.esPotPosar(tUsuari, mida) && vaixellGeneral > 0) {
                colocar(tUsuari, mida);
                vaixellGeneral--;
                System.out.println(" Col·loca els teus vaixells  |  Següent vaixell: d'1 posició"
                        + "  |  Restants : " + vaixellGeneral);
            }
        }
        if (vaixellGeneral == 0) {
            colocat = true;
        }
    }

    /**
     * obtenirCasella. Mètode obtenir la casella on s'ha clickat l'usuari i amb quin botó. Assigna
     * un valor a les variables 'x' i 'y' d'aquesta classe.
     *
     * @param tUsuari Tauler on clickam
     */
    public void obtenirCasella(Tauler tUsuari) {
        // codi suprimit per l'exercici
    }

    /**
     * colocar. Mètode per posar el vaixell al tauler. Segons el boolean
     * 'orientacio' es posa en horitzontal o en vertical.
     *
     * @param tUsuari Tauler al qual es posa el vaixell
     * @param mida    Número de caselles que ocupa el vaixell
     */
    private void colocar(Tauler tUsuari, int mida) {
        // codi suprimit per l'exercici
    }

    /**
     * disponibilitat. Aquest mètode s'encarrega de posar 'disponible=false' a
     * les caselles que envolten un vaixell. Així, a l'hora de posar un nou
     * vaixell, no es tocarà amb els altres
     *
     * @param tUsuari Tauler al qual es posen les peces
     * @param xi      Coordenada 'x' inicial del vaixell
     * @param yi      Coordenada 'y' inicial del vaixell
     * @param xf      Coordenada 'x' final del vaixell
     * @param yf      Coordenada 'y' final del vaixell
     */
    private void disponibilitat(Tauler tUsuari, int xi, int yi, int xf, int yf) {
        // codi suprimit per l'exercici
    }

    /**
     * Retorna vertader si l'usuari ha fet click amb el botó esquerre.
     *
     * @return
     */
    public boolean clickEsquerre() {
        // codi suprimit per l'exercici
        return true;
    }

    public static void setVaixellsColocats(boolean vaixellsColocats) {
        VaixellsUsuari.vaixellsColocats = vaixellsColocats;
    }

    public void setColocat2(boolean colocat2) {
        this.colocat2 = colocat2;
    }

    public void setColocat1(boolean colocat1) {
        this.colocat1 = colocat1;
    }

    public void setVaixell2(int vaixell2) {
        this.vaixell2 = vaixell2;
    }

    public void setVaixell1(int vaixell1) {
        this.vaixell1 = vaixell1;
    }

}