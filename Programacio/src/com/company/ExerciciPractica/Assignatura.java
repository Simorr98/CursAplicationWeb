package com.company.ExerciciPractica;

import java.util.ArrayList;

public class Assignatura {
    private String nom;
    private ArrayList<Alumne> llistaAlumnes;

    public Assignatura(String nom, ArrayList<Alumne> llistaAlumnes){
        this.nom = nom;
        this.llistaAlumnes = llistaAlumnes;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setLlistaAlumnes(ArrayList<Alumne> llistaAlumnes){
        this.llistaAlumnes = llistaAlumnes;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Alumne> getAlumnes() {
        return llistaAlumnes;
    }
}