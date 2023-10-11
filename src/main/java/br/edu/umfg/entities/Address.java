package br.edu.umfg.entities;

public class Address {
    private String street;
    private String number;

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public Address(String street, String number) {
        this.street = street;
        this.number = number;
    }
}
