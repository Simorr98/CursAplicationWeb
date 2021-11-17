package com.company.ExerciciPractica;

public class Alumne {
    private String nom;
    private int edat;
    private int id;
    private int [] notes;

    public Alumne(String nom, int edat, int id, int [] notes) {
        this.nom = nom;
        this.edat = edat;
        this.id = id;
        this.notes = notes;
    }

    public double mitjanaNotes(){
        int total = 0;
        for(int i = 0; i < notes.length; i++){
            total += notes[i];
        }
        return total / (double)notes.length;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setEdat(int edat){
        this.edat = edat;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNotes(int [] notes){
        this.notes = notes;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public int getId() {
        return id;
    }

    public int[] getNotes() {
        return notes;
    }
}
