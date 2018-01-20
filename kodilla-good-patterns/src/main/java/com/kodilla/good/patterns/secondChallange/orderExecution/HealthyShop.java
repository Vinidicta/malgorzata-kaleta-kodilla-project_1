package com.kodilla.good.patterns.secondChallange;

import com.kodilla.good.patterns.firstChallenge.informationService.PhoneService;
import com.kodilla.good.patterns.firstChallenge.orderCreator.OrderRequest;

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
