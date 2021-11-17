package com.company.Herencia;

public class Alumne extends Persona {

    private int [] notes;

    public Alumne (String name, int age, String dni, String genre, int telephone, int [] notes){
        super(name, age, dni, genre, telephone);
        this.notes = notes;
    }


    @Override
    public void display(){
        super.display();
        System.out.println("Notes: ");
        for (int i = 0; i < notes.length; i++){
            System.out.println(notes[i]);
        }
    }
}
