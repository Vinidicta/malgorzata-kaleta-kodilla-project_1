package com.kodilla.good.patterns.firstChallenge.orderRepository;

import com.kodilla.good.patterns.firstChallenge.orderCreator.Client;
import com.kodilla.good.patterns.firstChallenge.orderCreator.Order;

public interface OrderServiceRepository {
    void createOrder(Client client, Order order);
}
