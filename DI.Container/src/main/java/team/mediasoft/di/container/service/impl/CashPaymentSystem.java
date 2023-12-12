package team.mediasoft.di.container.service.impl;

import team.mediasoft.di.container.model.Gift;
import team.mediasoft.di.container.service.PaymentSystem;

public class CashPaymentSystem implements PaymentSystem {
    @Override
    public void pay(Gift gift) {
        System.out.println(String.format("Pay to %d for %s by CASH", gift.getPrice(),gift.getName()));
    }
}
