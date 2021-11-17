package com.company.Repas;

public class Cinema {
    private static String nom;
    private static int numSales;
    private static Pelicula [] pelicules;

    public Cinema(String nom, int numSales, Pelicula [] pelicules){
        this.nom = nom;
        this.numSales = numSales;
        this.pelicules = pelicules;
    }

    public Pelicula peliculaMesLlarga(){
        Pelicula pelicula = new Pelicula("", 0, "");
        int duracio = 0;

        for(int i = 0; i < this.pelicules.length; i++){
            if(this.pelicules[i].getDuracio() > duracio){
                duracio = this.pelicules[i].getDuracio();
                pelicula = this.pelicules[i];
            }
        }
        return pelicula;
    }
}
