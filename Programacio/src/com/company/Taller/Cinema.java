package com.company.Taller;

public class Cinema {
    private String nom;
    private int numeroSales;
    private Pelicula[] pelicules;

    public Cinema(String nom, int numeroSales, Pelicula[] pelicules) {
        this.nom = nom;
        this.numeroSales = numeroSales;
        this.pelicules = pelicules;
    }

    public Pelicula peliculaMesLlargas() {
        int duracio = 0;
        Pelicula pelicula = new Pelicula(" ", 0, " ");

        for (int i = 0; i < this.pelicules.length; i++){
            if (this.pelicules[i].getDuracio() > duracio){
                duracio = this.pelicules[i].getDuracio();
                pelicula = this.pelicules[i];
            }
        }
        return pelicula;
    }

}
