package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    public Client client;
    public ProductsToOrder productsToOrder;

    public OrderRequest(Client client, ProductsToOrder productsToOrder) {
        this.client = client;
        this.productsToOrder = productsToOrder;
    }

    public Client getClient() {
        return client;
    }

    public ProductsToOrder getProductsToOrder() {
        return productsToOrder;
    }
}
