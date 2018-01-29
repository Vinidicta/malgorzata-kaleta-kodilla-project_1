package com.kodilla.good.patterns.challenges.first.order.repository;

import com.kodilla.good.patterns.challenges.first.order.creator.Client;
import com.kodilla.good.patterns.challenges.first.order.creator.Order;

public interface OrderServiceRepository {
    void createOrder(Client client, Order order);
}
