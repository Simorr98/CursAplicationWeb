package com.company.Taller;

import java.util.ArrayList;

public class Autor {
    private String nom;
    private ArrayList<Obra> llistaObres;

    public Autor(String nom, ArrayList<Obra> llistaObres){
        this.nom = nom;
        this.llistaObres = llistaObres;
    }

    public Obra obraMesLlarga(){
        int numPagines = 0;
        Obra obra = new Obra();

        for (int i = 0; i < this.llistaObres.size(); i++){
            if (this.llistaObres.get(i).getNumPagines() > numPagines){
                numPagines = this.llistaObres.get(i).getNumPagines();
                obra = this.llistaObres.get(i);
            }
        }
        return obra;
    }

}
