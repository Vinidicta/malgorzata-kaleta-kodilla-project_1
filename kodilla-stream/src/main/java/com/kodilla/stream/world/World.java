package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continentsList = new ArrayList<>();

    public World(){
        List<Country> listOfCountriesAndPeopleQuantity1 = new ArrayList<>();
        listOfCountriesAndPeopleQuantity1.add(new Country("China", new BigDecimal("33213213332")));
        listOfCountriesAndPeopleQuantity1.add(new Country("India", new BigDecimal("33213213332")));

        List<Country> listOfCountriesAndPeopleQuantity2 = new ArrayList<>();
        listOfCountriesAndPeopleQuantity2.add(new Country("Australia", new BigDecimal("33213213332")));

        List<Country> listOfCountriesAndPeopleQuantity3 = new ArrayList<>();
        listOfCountriesAndPeopleQuantity3.add(new Country("Egypt", new BigDecimal("33213213332")));
        listOfCountriesAndPeopleQuantity3.add(new Country("Kenya", new BigDecimal("33213213332")));

        List<Country> listOfCountriesAndPeopleQuantity4 = new ArrayList<>();
        listOfCountriesAndPeopleQuantity4.add(new Country("Canada", new BigDecimal("33213213332")));
        listOfCountriesAndPeopleQuantity4.add(new Country("US of America", new BigDecimal("33213213332")));

        List<Country> listOfCountriesAndPeopleQuantity5 = new ArrayList<>();
        listOfCountriesAndPeopleQuantity5.add(new Country("Brazil", new BigDecimal("33213213332")));
        listOfCountriesAndPeopleQuantity5.add(new Country("Colombia", new BigDecimal("33213213332")));

        List<Country> listOfCountriesAndPeopleQuantity6 = new ArrayList<>();
        listOfCountriesAndPeopleQuantity6.add(new Country("Germany", new BigDecimal("33213213332")));
        listOfCountriesAndPeopleQuantity6.add(new Country("England", new BigDecimal("33213213332")));

        continentsList.add(new Continent("Asia", listOfCountriesAndPeopleQuantity1));
        continentsList.add(new Continent("Australia",  listOfCountriesAndPeopleQuantity2));
        continentsList.add(new Continent("Africa",  listOfCountriesAndPeopleQuantity3));
        continentsList.add(new Continent("Northern America", listOfCountriesAndPeopleQuantity4));
        continentsList.add(new Continent("South America", listOfCountriesAndPeopleQuantity5));
        continentsList.add(new Continent("Europa", listOfCountriesAndPeopleQuantity6));
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
