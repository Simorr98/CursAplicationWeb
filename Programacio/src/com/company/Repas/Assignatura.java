package com.company.Repas;

import java.util.ArrayList;

public class Assignatura {
    private static String nom;
    private static ArrayList<Alumne> alumnes;

    public Assignatura(String nom, ArrayList<Alumne> alumnes){
        this.nom = nom;
        this.alumnes = alumnes;
    }

    public void nouMatriculat(Alumne alumne){
        this.alumnes.add(alumne);
    }

    public void baixaAlumne(Alumne alumne){
        this.alumnes.remove(alumne);
    }

    public Alumne millorAlumne(){
        Alumne alumne = new Alumne();
        for (int i = 0; i < this.alumnes.size(); i++){
            if(alumne.mitjanaNotes() > this.alumnes.get(i).mitjanaNotes()){
                alumne = this.alumnes.get(i);
            }
        }
        return alumne;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setAlumnes(ArrayList<Alumne> alumnes){
        this.alumnes = alumnes;
    }

    public String getNom(){
        return this.nom;
    }

    public ArrayList<Alumne> getAlumnes(){
        return this.alumnes;
    }
}
