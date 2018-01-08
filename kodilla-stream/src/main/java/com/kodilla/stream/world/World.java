package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continentsList;

    public World(List<Continent> continentsList) {
        this.continentsList = continentsList;
    }

    public List<Continent> getContinentsList() {
        return new ArrayList<>(continentsList);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal totalQuantityOfPeople = getContinentsList().stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
                return totalQuantityOfPeople;
    }
}
