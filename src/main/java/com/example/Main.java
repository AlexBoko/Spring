package com.example;

import com.example.config.AppConfig;
import com.example.driver.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получение бинов из контекста
        Driver carDriver = context.getBean("driver", Driver.class);
        Driver busDriver = context.getBean("driver", Driver.class);
        Driver pickupDriver = context.getBean("driver", Driver.class);


        // Вывод информации о бинах Driver
        System.out.println("Car Driver: " + carDriver);
        System.out.println("Bus Driver: " + busDriver);
        System.out.println("Pickup Driver: " + pickupDriver);

        // Вызов метода drive() для каждого водителя
        carDriver.drive();
        busDriver.drive();
        pickupDriver.drive();

        // Закрытие контекста Spring
        context.close();
    }
}
