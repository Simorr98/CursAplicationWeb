package com.company.Herencia;

public class Persona {
    private String name;
    private int age;
    private String dni;
    private String genre;
    private int telephone;

    public Persona(String name, int age, String dni, String genre, int telephone) {
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.genre = genre;
        this.telephone = telephone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getDni() {
        return this.dni;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getTelephone() {
        return this.telephone;
    }

    public void display(){
        System.out.println("Nom: " +this.name);
        System.out.println("Edat: " +this.age);
        System.out.println("DNI: " +this.dni);
        System.out.println("Genere: " +this.genre);
        System.out.println("Telefon: " +this.telephone);
    }
}

