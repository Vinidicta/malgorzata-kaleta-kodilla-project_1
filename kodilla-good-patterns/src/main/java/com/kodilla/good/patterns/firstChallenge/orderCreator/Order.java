package com.kodilla.good.patterns.firstChallenge.orderCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {

    private final List<Product> listOfProducts = new ArrayList<>();

    public void addProduct(Product product) {
        listOfProducts.add(product);
    }

    public boolean removeProduct(Product product) {
        return listOfProducts.remove(product);
    }

    public List<Product> getListOfProducts() {
        return new ArrayList<>(listOfProducts);
    }

    public double getValueToPay() {
        return getListOfProducts().stream()
                .collect(Collectors.summingDouble(Product::getValue));
    }

    public void showContentsOfList() {
        getListOfProducts().stream()
                .forEach(System.out::println);
    }

}
