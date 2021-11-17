package com.company.ExercicisClasses;

public class Punt {

    double x;
    double y;

    public Punt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Punt punt) {
        double distancia = Math.sqrt(Math.pow(this.x - punt.getX(), 2) + Math.pow(this.y - punt.getY(), 2));
        return distancia;
    }

    /*
     * Alternativament, podem fer el return directament:
     * public double distancia(Punt punt) {
     *   return Math.sqrt(Math.pow(this.x - punt.getX(), 2) + Math.pow(this.y - punt.getY(), 2));
     * }
     * */

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
