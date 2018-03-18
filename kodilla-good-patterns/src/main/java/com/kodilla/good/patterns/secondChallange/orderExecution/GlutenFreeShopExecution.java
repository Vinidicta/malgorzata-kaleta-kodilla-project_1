package com.kodilla.good.patterns.secondChallange.orderExecution;


import com.kodilla.good.patterns.firstChallenge.informationService.MailService;
import com.kodilla.good.patterns.firstChallenge.orderCreator.OrderRequest;


import com.kodilla.good.patterns.secondChallange.OrderExecution;
import com.kodilla.good.patterns.secondChallange.manufacturerDatabase.NewManufacturer;

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
