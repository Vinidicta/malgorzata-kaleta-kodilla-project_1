package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String country;
    private  final BigDecimal peopleQuantity;

    public Country(String country, BigDecimal peopleQuantity) {
        this.country = country;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountry() {
        return country;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country1 = (Country) o;

        if (!country.equals(country1.country)) return false;
        return peopleQuantity.equals(country1.peopleQuantity);
    }

    @Override
    public int hashCode() {
        int result = country.hashCode();
        result = 31 * result + peopleQuantity.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }
}
