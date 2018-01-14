package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public String inform(Client client) {
        String message = "Order has been completed!";
        return message;
    }
}
