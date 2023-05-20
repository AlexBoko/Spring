package com.example.driver;

import com.example.transport.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Driver {

    private Transport transport;

    @Autowired
    public Driver(@Qualifier("car") Transport transport) {
        this.transport = transport;
    }

    public void drive() {
        System.out.println("Driving " + transport.getTransportType());
    }
}
