package com.example.transport;

import com.example.transport.Transport;
import org.springframework.stereotype.Component;

@Component
public class Car extends Transport {
    private String brand;
    private String model;

    public Car() {
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String getTransportType() {
        return "Car";
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + "]";
    }

}
