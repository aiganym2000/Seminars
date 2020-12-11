package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Basket implements Serializable {
    private LinkedHashMap<Product, Integer> products;

    public Basket() {
        products = new LinkedHashMap<>();
    }

    public Basket(LinkedHashMap<Product, Integer> products) {
        this.products = products;
    }

    public LinkedHashMap<Product, Integer> getProducts() {
        return products;
    }

    public static <K, V> K last(LinkedHashMap<K, V> map) {
        List<K> keys = new ArrayList<>(map.keySet());
        return keys.get(keys.size() - 1);
    }

    @Override
    public String toString() {
        return "Корзина {" +
                "продукт: '" + getProducts() + "'" +
                '}';
    }
}
