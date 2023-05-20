package com.example.config;

import com.example.driver.Driver;
import com.example.transport.Bus;
import com.example.transport.Car;
import com.example.transport.Pickup;
import com.example.transport.Transport;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

    @Value("${driver.car.name}")
    private String carDriverName;

    @Value("${driver.bus.name}")
    private String busDriverName;

    @Value("${driver.pickup.name}")
    private String pickupDriverName;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocation(new ClassPathResource("application.properties"));
        return configurer;
    }

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

    @Bean
    public Driver carDriver(@Qualifier("car") Transport transport) {
        return new Driver(transport, carDriverName);
    }

    @Bean
    public Driver busDriver(@Qualifier("bus") Transport transport) {
        return new Driver(transport, busDriverName);
    }

    @Bean
    public Driver pickupDriver(@Qualifier("pickup") Transport transport) {
        return new Driver(transport, pickupDriverName);
    }
}
