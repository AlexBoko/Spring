package com.example.transport;

import com.example.transport.Transport;
import org.springframework.stereotype.Component;

@Component
public class Bus extends Transport {
    private String manufacturer;
    private int seatingCapacity;

    public Bus() {
    }

    public Bus(String manufacturer, int seatingCapacity) {
        this.manufacturer = manufacturer;
        this.seatingCapacity = seatingCapacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String getTransportType() {
        return "Bus";
    }


    @Override
    public void start() {
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping");
    }

    @Override
    public String toString() {
        return "Bus [manufacturer=" + manufacturer + ", seatingCapacity=" + seatingCapacity + "]";
    }
}
