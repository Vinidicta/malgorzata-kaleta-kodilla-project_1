package com.kodilla.good.patterns.challenges.second.order.execution;

import com.kodilla.good.patterns.challenges.first.order.service.information.MailService;
import com.kodilla.good.patterns.challenges.first.order.creator.OrderRequest;
import com.kodilla.good.patterns.challenges.second.database.manufacturer.NewManufacturer;

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
