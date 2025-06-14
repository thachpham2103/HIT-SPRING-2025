package org.example.btvnbuoi1.bai1.bai2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Thanh toán bnagwf the tín dụng");
    }
}
