package com.kodilla.good.patterns.challenges;

public interface OrderServiceRepository {
    void createOrder(Client client, ProductsToOrder productsToOrder);
}
