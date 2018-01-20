package com.kodilla.good.patterns.firstChallenge.informationService;

import com.kodilla.good.patterns.firstChallenge.orderCreator.Client;
import com.kodilla.good.patterns.secondChallange.manufacturerDatabase.Manufacturer;

public interface InformationService {

    String inform(Client client);
    String inform(Manufacturer manufacturer);
}
