package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    public BigDecimal getPeopleQuantity(List<Continent> listOfContinentsAndPeopleQuantity){
        BigDecimal totalQuantityOfPeople = listOfContinentsAndPeopleQuantity.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
                return totalQuantityOfPeople;
    }
}
