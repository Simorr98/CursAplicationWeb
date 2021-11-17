package com.company.Collections;

public class Item <T>{
    private int code;
    private T element;

    public Item(int code, T element){
        this.code = code;
        this.element = element;
    }

    public int getCode(){
        return code;
    }

    public T getElement(){
        return element;
    }
}
