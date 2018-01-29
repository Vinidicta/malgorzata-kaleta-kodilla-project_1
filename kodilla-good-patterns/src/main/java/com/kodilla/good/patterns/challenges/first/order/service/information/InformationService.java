package com.kodilla.good.patterns.challenges.first.order.service.information;

import com.kodilla.good.patterns.challenges.first.order.creator.Client;
import com.kodilla.good.patterns.challenges.second.database.manufacturer.Manufacturer;

public interface InformationService {

    String inform(Client client);

    String inform(Manufacturer manufacturer);
}
