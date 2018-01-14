package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriver {

    public OrderRequest retrieve() {
        Client client = new Client("Anna", "Nowak", "Narutowicza 8", "Katowice", "41-920", "+48 603-258-229", "anna.nowak@gmail.com");

        ProductsToOrder productsToOrder = new ProductsToOrder();
        productsToOrder.addProduct(new Product("Sushi Nori", 45.0, 1.0));
        productsToOrder.addProduct(new Product("Rice", 12.0, 1.0));
        productsToOrder.addProduct(new Product("Wasabi", 5.5, 2.0));

        return new OrderRequest(client, productsToOrder);
    }
}
