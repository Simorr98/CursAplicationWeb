package com.company.Repas;

import java.util.ArrayList;

public class Autor {
    private static String nom;
    private static ArrayList<Obra> obres;

    public Autor(String nom, ArrayList<Obra> obres){
        this.nom = nom;
        this.obres = obres;
    }

    public Obra obraMesLlarga(){
        int longitud = 0;
        Obra obra = new Obra();
        for(int i = 0; i < this.obres.size(); i++){
            if(this.obres.get(i).getNumPagines() > longitud){
                longitud = this.obres.get(i).getNumPagines();
                obra = this.obres.get(i);
            }
        }
        return obra;
    }
}
