package com.kodilla.good.patterns.firstChallenge.orderCreator;

public class Client {

    private final String name;
    private final String surname;
    private final String address;
    private final String city;
    private final String postalCode;
    private final String phoneNumber;
    private final String email;

    public Client(String name, String surname, String address, String city, String postalCode, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
