package org.example.btvnbuoi1.bai1.bai2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private  FastFoodOrder fastFoodOrder;
    private  HealthyFoodOrder healthyFoodOrder;
    private  CreditCardPayment creditCardPayment;
    private  PaymentMethod payPalPayment;

    @Autowired
    public Customer(@Qualifier("fastFoodOrder") FastFoodOrder fastFoodOrder, HealthyFoodOrder healthyFoodOrder, @Qualifier("creditCardPayment") CreditCardPayment creditCardPayment,
          PaymentMethod payPalPayment) {
        this.fastFoodOrder = fastFoodOrder;
        this.healthyFoodOrder = healthyFoodOrder;
        this.creditCardPayment = creditCardPayment;
        this.payPalPayment = payPalPayment;
    }

    public void orderFastFood() {
        fastFoodOrder.order();
        creditCardPayment.pay();
    }

    public void orderHealthyFood() {  
        healthyFoodOrder.order();
        payPalPayment.pay();
    }
}