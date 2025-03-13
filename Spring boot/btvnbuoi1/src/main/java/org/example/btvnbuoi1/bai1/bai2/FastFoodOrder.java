package org.example.btvnbuoi1.bai1.bai2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class FastFoodOrder implements Order{

    private PaymentMethod paymentMethod;

    @Autowired
    public FastFoodOrder(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void order() {
        paymentMethod.pay();
        System.out.println("Đặt món ăn nhanh");
    }
}
