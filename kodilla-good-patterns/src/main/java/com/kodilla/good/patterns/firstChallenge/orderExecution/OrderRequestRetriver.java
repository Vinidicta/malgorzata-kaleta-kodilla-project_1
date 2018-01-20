package com.kodilla.good.patterns.firstChallenge.orderExecution;

import com.kodilla.good.patterns.firstChallenge.orderCreator.Client;
import com.kodilla.good.patterns.firstChallenge.orderCreator.OrderRequest;
import com.kodilla.good.patterns.firstChallenge.orderCreator.Product;
import com.kodilla.good.patterns.firstChallenge.orderCreator.Order;

public class OrderRequestRetriver {

    public OrderRequest retrieve() {
        Client client = new Client("Anna", "Nowak", "Narutowicza 8", "Katowice", "41-920", "+48 603-258-229", "anna.nowak@gmail.com");

        Order order = new Order();
        order.addProduct(new Product("Sushi Nori", 45.0, 1.0));
        order.addProduct(new Product("Rice", 12.0, 1.0));
        order.addProduct(new Product("Wasabi", 5.5, 2.0));

        return new OrderRequest(client, order);
    }
}
