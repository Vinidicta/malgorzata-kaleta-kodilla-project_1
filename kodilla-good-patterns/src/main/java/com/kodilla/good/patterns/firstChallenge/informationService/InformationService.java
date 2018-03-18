package com.kodilla.good.patterns.firstChallenge.informationService;

import com.kodilla.good.patterns.challenges.second.database.manufacturer.Manufacturer;
import com.kodilla.good.patterns.firstChallenge.orderCreator.Client;


public interface InformationService {

    String inform(Client client);
    String inform(Manufacturer manufacturer);
}
