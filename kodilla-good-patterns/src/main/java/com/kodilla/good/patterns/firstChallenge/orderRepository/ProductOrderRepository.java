package com.kodilla.good.patterns.firstChallenge.orderRepository;

import com.kodilla.good.patterns.firstChallenge.orderCreator.Client;
import com.kodilla.good.patterns.firstChallenge.orderCreator.Order;

public class ProductOrderRepository implements OrderServiceRepository {
    @Override
    public void createOrder(Client client, Order order) {
        System.out.println("Order for client " + client.getName() + " " + client.getSurname() + " was saved in order repository.");
    }
}
