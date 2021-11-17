package com.company.Repas;

public class Alumne {
    private static String nom;
    private static int edat;
    private static int id;
    private static int [] notes;

    public Alumne(String nom, int edat, int id, int [] notes){
        this.nom = nom;
        this.edat = edat;
        this.id = id;
        this.notes = notes;
    }

    public Alumne(){}

    public double mitjanaNotes(){
        int total = 0;
        for(int i = 0; i < this.notes.length; i++){
            total += this.notes[i];
        }
        return total / (double) this.notes.length;
    }

    public void setName(String name){
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

    public String getNom(){
        return this.nom;
    }

    public int getEdat(){
        return this.edat;
    }

    public int getId(){
        return this.id;
    }

    public int[] getNotes(){
        return this.notes;
    }
}
