package com.company.Collections;

import java.util.HashMap;
import java.util.TreeMap;

public class Store <T>{

    private TreeMap<Integer, T> elements;
    private HashMap<T, Integer> stock;
    private Item item;

    public Store(){
        elements = new TreeMap<>();
        stock = new HashMap<>();
    }

    public void add(Item<T> item) {
        elements.put(item.getCode(), item.getElement());
        if (stock.containsKey(item.getElement())) {
            stock.put(item.getElement(), stock.get(item.getElement()) + 1);
            return;
        }
        stock.put(item.getElement(), 1);
    }

    public void clearItem(Item<T> item) {
        elements.remove(item.getCode());
        stock.remove(item.getElement());
    }

    public void remove(Item<T> item) {
        if (stock.get(item.getElement()) > 0) {
            stock.put(item.getElement(), stock.get(item.getElement()) - 1);
            return;
        }
        clearItem(item);
    }

    public boolean exists(Item<T> item) {
        return elements.containsKey(item.getCode());
    }

    public int getAmount(Item<T> item) {
        return stock.get(item.getElement());
    }

    public void display() {
        System.out.println("Item - Stock");
        for(T key : stock.keySet()) {
            System.out.println(key + " - " + stock.get(key));
        }
    }
}
