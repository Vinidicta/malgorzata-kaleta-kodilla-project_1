package com.kodilla.good.patterns.challenges.first.order.executor;

import com.kodilla.good.patterns.challenges.first.order.creator.Client;
import com.kodilla.good.patterns.challenges.first.order.creator.OrderRequest;
import com.kodilla.good.patterns.challenges.first.order.creator.Product;
import com.kodilla.good.patterns.challenges.first.order.creator.Order;

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
