package com.kodilla.good.patterns.challenges.second.order.execution;

import com.kodilla.good.patterns.challenges.first.order.service.information.MailService;
import com.kodilla.good.patterns.challenges.first.order.service.information.PhoneService;
import com.kodilla.good.patterns.challenges.first.order.creator.OrderRequest;
import com.kodilla.good.patterns.challenges.second.database.manufacturer.ManufacturersDatabase;
import com.kodilla.good.patterns.challenges.second.database.manufacturer.NewManufacturer;

public class ExtraFoodShop implements OrderExecution {
    private MailService mailService;
    private PhoneService phoneService;
    private NewManufacturer newManufacturer;
    private OrderConfirmation orderConfirmation;
    private OrderRequest orderRequest;

    @Override
    public void process() {
        ManufacturersDatabase database = new ManufacturersDatabase();
        newManufacturer.getManufacturerDetails(0);
        mailService.inform(newManufacturer.getManufacturer());
        phoneService.inform(newManufacturer.getManufacturer());
        orderConfirmation.orderConfirmationByManufacturer(newManufacturer.getManufacturer(), orderRequest);
    }
}
