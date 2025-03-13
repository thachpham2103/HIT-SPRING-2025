package org.example.btvnbuoi1.bai1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Động cơ điện ");
    }
}
