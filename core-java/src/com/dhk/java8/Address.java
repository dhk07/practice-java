package com.dhk.java8;

public class Address {
    private String houseApartment;
    private String street;
    private String city;

    private String state;
    private String country;
    private int pinCode;

    public Address(String houseApartment, String street, String city, String state, String country, int pinCode) {
        this.houseApartment = houseApartment;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    public String getHouseApartment() {
        return houseApartment;
    }

    public void setHouseApartment(String houseApartment) {
        this.houseApartment = houseApartment;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
