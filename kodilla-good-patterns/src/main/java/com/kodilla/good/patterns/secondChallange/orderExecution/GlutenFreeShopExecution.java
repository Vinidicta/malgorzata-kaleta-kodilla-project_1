package com.kodilla.good.patterns.secondChallange;

import com.kodilla.good.patterns.firstChallenge.informationService.MailService;
import com.kodilla.good.patterns.firstChallenge.orderCreator.OrderRequest;

public class GlutenFreeShopExecution implements OrderExecution {

    private MailService mailService;
    private NewManufacturer newManufacturer;
    private OrderConfirmation orderConfirmation;
    private OrderRequest orderRequest;

    @Override
    public void process() {
        newManufacturer.getManufacturerDetails(2);
        mailService.inform(newManufacturer.getManufacturer());
        orderConfirmation.orderConfirmationByManufacturer(newManufacturer.getManufacturer(), orderRequest);
    }
}
