package br.edu.umfg.entities;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Address {
    private String street;
    private String number;

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    @JsonCreator
    public Address(String street, String number) {
        this.street = street;
        this.number = number;
    }
}
