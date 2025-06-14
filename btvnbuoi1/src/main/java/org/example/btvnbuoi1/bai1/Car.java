package org.example.btvnbuoi1.bai1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
   
    private Engine engine;

    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void move() {
        engine.start();
        System.out.println("Car is moving");
    }
}
