package com.company.Refactorizacio2;

public class Invoice {

    public float totalPrice (float price, float vat, float discount) {
        float appliedVait = (vat * price) / 100;
        float totalWithVat = price + appliedVait;
        System.out.println("Applied vat: " + appliedVait);
        System.out.println("Total with vat: " + totalWithVat);
        return totalWithVat - discount;
    }
}
