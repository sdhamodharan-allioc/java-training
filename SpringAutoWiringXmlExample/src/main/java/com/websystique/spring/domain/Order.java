package com.websystique.spring.domain;

import java.util.List;

public class Order {

    private List<Product> productList;

    public Order(List<Product> productList) {
        this.productList = productList;
    }

    public void setProductList(List<Product> productList){
        productList = this.productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                '}';
    }
}
