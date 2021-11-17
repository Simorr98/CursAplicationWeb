package com.company.Herencia;

public class Professor extends Persona{

    private String especialitat;

    public Professor(String name, int age, String dni, String genre, int telephone, String especialitat){
        super(name, age, dni, genre, telephone);
        this.especialitat = especialitat;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Especialitat: " + this.especialitat);
    }
}
