package com.kodilla.good.patterns.challenges.first.order.service.information;

import com.kodilla.good.patterns.challenges.first.order.creator.Client;
import com.kodilla.good.patterns.challenges.second.database.manufacturer.Manufacturer;

public class PhoneService implements InformationService {

    @Override
    public String inform(Client client) {
        String message = "Order has been completed!";
        return message;
    }
    @Override
    public String inform(Manufacturer manufacturer) {
        String message = "New order has been registered";
        return message;
    }
}
