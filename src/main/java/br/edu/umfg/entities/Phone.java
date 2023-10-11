package br.edu.umfg.entities;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Phone {
    private String number;

    public String getNumber() {
        return number;
    }

    @JsonCreator
    public Phone(String number) {
        this.number = number;
    }
}
