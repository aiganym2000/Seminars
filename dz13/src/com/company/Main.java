package com.company;

import java.io.File;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Хлеб", 120);
        Product product2 = new Product("Молоко", 200);
        Product product3 = new Product("Печенья", 800);
        Product product4 = new Product("Сухарики", 100);
        Product product5 = new Product("Сок", 230);
        Product product6 = new Product("Капуста", 120);
        LinkedHashMap products = new LinkedHashMap<Product, Integer>();

        products.put(product1, 2);
        products.put(product2, 3);
        products.put(product3, 4);
        products.put(product4, 2);
        products.put(product5, 2);
        products.put(product6, 1);

        Basket basket = new Basket(products);

        File file = new File("src\\com\\company\\basket.txt");
        Serializer.serialize(basket, file);

        Object desHorse = Serializer.deserialize(file);
        System.out.println(desHorse);
    }
}