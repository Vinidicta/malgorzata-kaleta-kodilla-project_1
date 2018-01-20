package com.kodilla.good.patterns.firstChallenge.informationService;

import com.kodilla.good.patterns.firstChallenge.orderCreator.Client;

public class MailService implements InformationService {

    @Override
    public String inform(Client client) {
        String message = "Order has been completed!";
        return message;
    }
}
