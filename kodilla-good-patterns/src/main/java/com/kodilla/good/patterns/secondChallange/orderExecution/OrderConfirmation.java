package com.kodilla.good.patterns.secondChallange.orderExecution;

import com.kodilla.good.patterns.challenges.second.database.manufacturer.Manufacturer;
import com.kodilla.good.patterns.firstChallenge.orderCreator.OrderRequest;

public class OrderConfirmation {

    public void orderConfirmationByManufacturer(Manufacturer manufacturer, OrderRequest orderRequest) {
        System.out.println(manufacturer.getName() + " confirm completion of the order" + orderRequest.getOrder());
    }
}
