package br.edu.umfg.firstapi.controllers;

import br.edu.umfg.builders.ClientBuilder;
import br.edu.umfg.entities.Address;
import br.edu.umfg.entities.Client;
import br.edu.umfg.entities.Phone;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @GetMapping
    public ResponseEntity<Client> getClient(){
        return ResponseEntity
                .ok(new ClientBuilder("Juliano", "000")
                        .withPhone(new Phone("00000000"))
                        .withPhone(new Phone("11111111"))
                        .withAddress(new Address("TEST", "1A"))
                        .withAddress(new Address("TEST", "2B"))
                        .build());
    }
}
