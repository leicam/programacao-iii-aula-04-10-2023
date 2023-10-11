package br.edu.umfg.entities;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.UUID;

public class Client {

    private UUID id;
    private String name;
    private String document;
    private ArrayList<Phone> phones = new ArrayList<Phone>();
    private ArrayList<Address> addresses = new ArrayList<Address>();

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public Client(String name, String document) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.document = document;
    }

    @JsonCreator
    public Client(String name, String document,
                  ArrayList<Phone> phones,
                  ArrayList<Address> addresses){
        this.id = UUID.randomUUID();
        this.name = name;
        this.document = document;
        this.phones = phones;
        this.addresses = addresses;
    }

    public void addPhone(Phone phone){
        phones.add(phone);
    }

    public void addAddresses(Address address){
        addresses.add(address);
    }
}
