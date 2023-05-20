package com.example.transport;

import com.example.transport.Transport;
import org.springframework.stereotype.Component;

@Component
public class Pickup extends Transport {
    private String manufacturer;
    private double payloadCapacity;

    public Pickup() {
    }

    public Pickup(String manufacturer, double payloadCapacity) {
        this.manufacturer = manufacturer;
        this.payloadCapacity = payloadCapacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String getTransportType() {
        return "Pickup";
    }


    @Override
    public void start() {
        System.out.println("Pickup is starting");
    }

    @Override
    public void stop() {
        System.out.println("Pickup is stopping");
    }

    @Override
    public String toString() {
        return "Pickup [manufacturer=" + manufacturer + ", payloadCapacity=" + payloadCapacity + "]";
    }
}
