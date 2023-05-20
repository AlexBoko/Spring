package com.example.driver;

import com.example.transport.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Driver {

    private String name;
    private Transport transport;

    @Autowired
    public Driver(@Qualifier("car") Transport transport, @Value("${driver.car.name}") String name) {
        this.transport = transport;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, transport);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Driver other = (Driver) obj;
        return Objects.equals(name, other.name) && Objects.equals(transport, other.transport);
    }


    public void drive() {
        System.out.println(name + " is driving " + transport.getTransportType());
    }

    // Геттеры и сеттеры для поля name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
