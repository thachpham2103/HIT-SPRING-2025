package org.example.btvnbuoi1.bai1;

import org.springframework.stereotype.Component;

@Component

public class GasolineEngine implements Engine {


    @Override
    public void start() {
        System.out.println("Động cơ xăng");
    }
}
