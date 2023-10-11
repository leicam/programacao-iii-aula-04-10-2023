package br.edu.umfg.entities;

import java.util.ArrayList;

public class Client {

    private String name;
    private String document;
    private ArrayList<Phone> phones = new ArrayList<Phone>();
    private ArrayList<Address> addresses = new ArrayList<Address>();

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
        this.name = name;
        this.document = document;
    }

    public void addPhone(Phone phone){
        phones.add(phone);
    }

    public void addAddresses(Address address){
        addresses.add(address);
    }
}
