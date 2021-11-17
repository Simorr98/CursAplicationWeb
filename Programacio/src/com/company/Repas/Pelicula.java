package com.company.Repas;

public class Pelicula {
    private static String titol;
    private static int duracio;
    private static String director;

    public Pelicula(String titol, int duracio, String director){
        this.titol = titol;
        this.duracio = duracio;
        this.director = director;
    }

    public String getTitol(){
        return this.titol;
    }

    public int getDuracio(){
        return this.duracio;
    }
}
