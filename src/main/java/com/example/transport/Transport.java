package com.example.transport;

public abstract class Transport {
    public abstract String getTransportType();

    public void start() {
        System.out.println(getTransportType() + " is starting.");
    }

    public void stop() {
        System.out.println(getTransportType() + " is stopping.");
    }
    private String name;
    private int year;

    public Transport() {
    }

    public Transport(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
