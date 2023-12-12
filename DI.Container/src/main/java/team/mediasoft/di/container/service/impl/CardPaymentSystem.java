package team.mediasoft.di.container.service.impl;

import team.mediasoft.di.container.model.Gift;
import team.mediasoft.di.container.service.PaymentSystem;

public class CardPaymentSystem implements PaymentSystem {
    @Override
    public void pay(Gift gift) {
        System.out.println("Pay " + gift.getPrice() + " for a " + gift.getName() + " by CARD");
    }
}
