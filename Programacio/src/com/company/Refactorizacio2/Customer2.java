package com.company.Refactorizacio2;

public class Customer2 {

    private boolean isVip;
    private boolean isSpecial;
    private int type;

    public static final int NORMAL = 0;
    public static final int SPECIAL = 1;
    public static final int VIP = 2;

    public Customer2(boolean isVip, boolean isSpecial, int type) {
        this.isVip = isVip;
        this.isSpecial = isSpecial;
        this.type = type;
    }

    public double applyDiscount(double price, double discount) {
        double finalPrice;
        double appliedVat;

        switch (getType()) {
            case Customer2.NORMAL:
                appliedVat = 1.21f;
                break;
            case Customer2.SPECIAL:
                appliedVat = 1.15f;
                break;
            case Customer2.VIP:
                appliedVat = 1.04f;
                break;
            default:
                appliedVat = 1.21f;
                break;
        }

        if (price > 50 && isVip()) {
            finalPrice = price * 0.5;
        } else if (price > 10 && isSpecial()) {
            finalPrice = price * 0.1;
        } else {
            finalPrice = price;
        }

        return finalPrice * appliedVat - discount;
    }

    public int getType() {
        return type;
    }

    public boolean isVip() {
        return isVip;
    }

    public boolean isSpecial() {
        return isSpecial;
    }
}
