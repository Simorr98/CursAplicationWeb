package com.company.ExercicisClasses;

public class Dog {

    String name;
    int age;
    String race;
    int nvacunes;
    String pedigri;
    boolean vacuned;

    public Dog(String name, int age, String race, int nvacunes, String pedigri) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.nvacunes = nvacunes;
        this.pedigri = pedigri;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setNvacunes(int nvacunes) {
        this.nvacunes = nvacunes;
    }

    public void setPedigri(String pedigri) {
        this.pedigri = pedigri;
    }

    public String getName(String name) {
        return this.name;
    }

    public int getAge(int age) {
        return this.age;
    }

    public String getRace(String race) {
        return this.race;
    }

    public int getNvacunes(int nvacunes) {
        return this.nvacunes;
    }

    public String getPedigri(String pedigri) {
        return this.pedigri;
    }

    public void display() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.nvacunes);
        System.out.println(this.race);
        System.out.println(this.pedigri);
    }

    public void novaVacuna() {
        nvacunes++;
        System.out.println(nvacunes);
    }
}
