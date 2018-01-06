package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continent;
    private final List<Country> listOfCountriesAndPeopleQuantity;

    public Continent(String continent, List<Country> listOfCountriesAndPeopleQuantity) {
        this.continent = continent;
        this.listOfCountriesAndPeopleQuantity = listOfCountriesAndPeopleQuantity;
    }

    public String getContinent() {
        return continent;
    }

    public List<Country> getListOfCountries() {
        return listOfCountriesAndPeopleQuantity;
    }

}
