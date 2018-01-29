package com.kodilla.good.patterns.challenges.second.order.execution;

import com.kodilla.good.patterns.challenges.first.order.creator.OrderRequest;
import com.kodilla.good.patterns.challenges.second.database.manufacturer.Manufacturer;

public class OrderConfirmation {

    public void orderConfirmationByManufacturer(Manufacturer manufacturer, OrderRequest orderRequest) {
        System.out.println(manufacturer.getName() + " confirm completion of the order" + orderRequest.getOrder());
    }
}
