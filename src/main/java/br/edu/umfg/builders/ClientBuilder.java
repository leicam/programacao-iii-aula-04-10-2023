package br.edu.umfg.builders;

import br.edu.umfg.entities.Address;
import br.edu.umfg.entities.Client;
import br.edu.umfg.entities.Phone;

public class ClientBuilder {
    private Client client;

    public ClientBuilder(String name, String document) {
        this.client = new Client(name, document);
    }

    public ClientBuilder withPhone(Phone phone){
        this.client.addPhone(phone);
        return this;
    }

    public ClientBuilder withAddress(Address address){
        this.client.addAddresses(address);
        return this;
    }

    public Client build(){
        return client;
    }
}
