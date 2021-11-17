package com.company.Repas;

public class Persona {
    private String name;
    private int age;
    private String id;
    private String genre;
    private int telephone;

    public Persona(String name, int age, String id, String genre, int telephone){
        this.name = name;
        this.age = age;
        this.id = id;
        this.genre = genre;
        this.telephone = telephone;
    }

    public Persona(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public int getTelephone() {
        return telephone;
    }

    public void display() {
        System.out.println("Nom: " + getName());
        System.out.println("Edat: " + getAge());
        System.out.println("Dni: " + getId());
        System.out.println("Sexe: " + getGenre());
        System.out.println("Telefon: " + getTelephone());
    }
}
