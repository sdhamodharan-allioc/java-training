package com.websystique.spring.domain;

public class Product {

    private final String name;

    public Product(String name){
        this.name = name;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
