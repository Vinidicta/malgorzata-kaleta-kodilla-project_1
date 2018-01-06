package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //given
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


        Continent asia = new Continent("Asia", listOfCountriesAndPeopleQuantity1);
        Continent australia = new Continent("Australia", listOfCountriesAndPeopleQuantity2);
        Continent africa = new Continent("Africa", listOfCountriesAndPeopleQuantity3);
        Continent northernAmerica = new Continent("Northern America", listOfCountriesAndPeopleQuantity4);
        Continent southAmerica = new Continent("South America", listOfCountriesAndPeopleQuantity5);
        Continent europa = new Continent("Europa", listOfCountriesAndPeopleQuantity6);

        List<Continent> listOfContinentsAndPeopleQuantity = new ArrayList<>();
        listOfContinentsAndPeopleQuantity.add(asia);
        listOfContinentsAndPeopleQuantity.add(australia);
        listOfContinentsAndPeopleQuantity.add(africa);
        listOfContinentsAndPeopleQuantity.add(northernAmerica);
        listOfContinentsAndPeopleQuantity.add(southAmerica);
        listOfContinentsAndPeopleQuantity.add(europa);

        World world = new World();
        //when
        BigDecimal peopleQuantity = world.getPeopleQuantity(listOfContinentsAndPeopleQuantity);
        //then
        BigDecimal expectedQuantity = new BigDecimal("365345346652");
        Assert.assertEquals(expectedQuantity, peopleQuantity);
    }

}
