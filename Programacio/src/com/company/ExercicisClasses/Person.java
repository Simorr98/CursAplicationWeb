package com.company.ExercicisClasses;

public class Person {

    private String name;
    private int age;
    private String DNI;
    private String genre;
    private int telephone;

    public Person(String name, int age, String DNI, String genre, int telephone) {
        this.name = name;
        this.age = age;
        this.DNI = DNI;
        this.genre = genre;
        this.telephone = telephone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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

    public String getDNI() {
        return this.DNI;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getTelephone() {
        return this.telephone;
    }
}

