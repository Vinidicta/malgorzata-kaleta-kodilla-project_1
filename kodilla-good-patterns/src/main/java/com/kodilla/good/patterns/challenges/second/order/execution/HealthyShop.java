package com.kodilla.good.patterns.challenges.second.order.execution;

import com.kodilla.good.patterns.challenges.first.order.service.information.PhoneService;
import com.kodilla.good.patterns.challenges.first.order.creator.OrderRequest;
import com.kodilla.good.patterns.challenges.second.database.manufacturer.NewManufacturer;

public class HealthyShop implements OrderExecution {

    private PhoneService phoneService;
    private NewManufacturer newManufacturer;
    private OrderConfirmation orderConfirmation;
    private OrderRequest orderRequest;

    @Override
    public void process() {
        newManufacturer.getManufacturerDetails(1);
        phoneService.inform(newManufacturer.getManufacturer());
        orderConfirmation.orderConfirmationByManufacturer(newManufacturer.getManufacturer(), orderRequest);
    }
}
