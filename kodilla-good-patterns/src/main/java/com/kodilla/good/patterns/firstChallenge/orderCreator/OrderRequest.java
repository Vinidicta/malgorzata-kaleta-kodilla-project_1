package com.kodilla.good.patterns.firstChallenge.orderCreator;

public class OrderRequest {

    public Client client;
    public Order order;

    public OrderRequest(Client client, Order order) {
        this.client = client;
        this.order = order;
    }

    public Client getClient() {
        return client;
    }

    public Order getOrder() {
        return order;
    }
}
