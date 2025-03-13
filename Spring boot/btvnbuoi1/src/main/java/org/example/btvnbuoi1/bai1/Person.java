package org.example.btvnbuoi1.bai1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Person {

    private Vehicle vehicle;


    public Person( @Qualifier("motorbike") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void book(){
        vehicle.move();
    }

}
