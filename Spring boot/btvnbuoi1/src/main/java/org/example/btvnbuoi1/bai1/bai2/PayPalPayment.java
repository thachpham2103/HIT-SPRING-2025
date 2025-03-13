package org.example.btvnbuoi1.bai1.bai2;

import org.springframework.stereotype.Component;

@Component

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println(" thanh toán bằng PayPal");
    }
}
