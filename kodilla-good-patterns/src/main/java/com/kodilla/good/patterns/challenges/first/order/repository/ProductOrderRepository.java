package com.kodilla.good.patterns.challenges.first.order.repository;

import com.kodilla.good.patterns.challenges.first.order.creator.Client;
import com.kodilla.good.patterns.challenges.first.order.creator.Order;
import com.kodilla.good.patterns.challenges.first.order.repository.OrderServiceRepository;

public class ProductOrderRepository implements OrderServiceRepository {
    @Override
    public void createOrder(Client client, Order order) {
        System.out.println("Order for client " + client.getName() + " " + client.getSurname() + " was saved in order repository.");
    }
}
