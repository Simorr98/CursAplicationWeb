package com.company.Herencia;

public class Empleat extends Persona{

    private int id;
    private double sou;
    private int anysPertenencia;

    public Empleat(String name, int age, String dni, String genre, int telephone, int id, double sou, int anysPertenencia){
        super(name, age, dni, genre, telephone);
        this.id = id;
        this.sou = sou;
        this.anysPertenencia = anysPertenencia;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setSou(double sou){
        this.sou = sou;
    }

    public void setAnysPertenencia(int anysPertenencia){
        this.anysPertenencia = anysPertenencia;
    }

    public int getId(){
        return this.id;
    }

    public double getSou(){
        return this.sou;
    }

    public int getAnysPertenencia() {
        return this.anysPertenencia;
    }

    public void aumentarSou(){
        double incrementar = getSou() * 0.05;
        double souIncrementat = incrementar + getSou();
        System.out.println("Sou incrementat un 5%: " + souIncrementat);
    }

    public void aumentarAnys(){
        int aumentar = ++anysPertenencia;
        System.out.println("Anys Pertenencia aumentats: " + aumentar);
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Id: " + this.id);
        System.out.println("Sou: " + this.sou);
        System.out.println("AnysPertenencia: " + this.anysPertenencia);
        aumentarSou();
        aumentarAnys();
    }
}
