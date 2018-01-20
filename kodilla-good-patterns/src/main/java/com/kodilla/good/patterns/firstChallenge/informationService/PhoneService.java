package com.kodilla.good.patterns.firstChallenge.informationService;

import com.kodilla.good.patterns.firstChallenge.orderCreator.Client;
import com.kodilla.good.patterns.secondChallange.manufacturerDatabase.Manufacturer;

public class PhoneService implements InformationService {

    @Override
    public String inform(Client client) {
        String message = "Order has been completed!";
        return message;
    }

    @Override
    public String inform(Manufacturer manufacturer) {
        String message = "New order request was sent";
        return message;
    }
}
