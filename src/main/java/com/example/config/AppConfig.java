package com.example.config;

import com.example.transport.Bus;
import com.example.transport.Car;
import com.example.transport.Pickup;
import com.example.transport.Transport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

    @Bean
    public Car car() {
        Car car = new Car("BMW", "X5");
        System.out.println("Car готов к работе");
        return car;
    }

    @Bean
    public Bus bus() {
        Bus bus = new Bus("Mercedes", 50);
        System.out.println("Bus готов к работе");
        return bus;
    }

    @Bean
    public Pickup pickup() {
        Pickup pickup = new Pickup("Ford", 900.0);
        System.out.println("Pickup готов к работе");
        return pickup;
    }
}
