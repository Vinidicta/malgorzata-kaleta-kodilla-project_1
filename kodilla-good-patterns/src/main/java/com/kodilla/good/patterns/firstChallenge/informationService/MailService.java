package com.kodilla.good.patterns.firstChallenge.informationService;

import com.kodilla.good.patterns.firstChallenge.orderCreator.Client;
import com.kodilla.good.patterns.firstChallenge.orderCreator.Order;
import com.kodilla.good.patterns.secondChallange.manufacturerDatabase.Manufacturer;

public class MailService implements InformationService {

    private Order order;

    @Override
    public String inform(Client client) {
        String message = "Order has been completed!";
        return message;
    }

    @Override
    public String inform(Manufacturer manufacturer) {
        String message = "New order request was sent";
        order.showContentsOfList();
        return message;
    }
}