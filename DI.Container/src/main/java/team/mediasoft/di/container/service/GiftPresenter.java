package team.mediasoft.di.container.service;

import team.mediasoft.di.container.annotation.Inject;
import team.mediasoft.di.container.annotation.PostConstruct;
import team.mediasoft.di.container.factory.BeanFactory;
import team.mediasoft.di.container.model.Gift;
import team.mediasoft.di.container.model.Person;
import team.mediasoft.di.container.service.impl.CardPaymentSystem;
import team.mediasoft.di.container.service.impl.PostDeliverySystem;
import team.mediasoft.di.container.service.impl.SmartGiftChooseHelper;

import java.lang.reflect.InvocationTargetException;

public class GiftPresenter {
    @Inject
    private  GiftChooseHelper giftChooseHelper;
    @Inject
    private PaymentSystem paymentSystem;
    @Inject
    private DeliverySystem deliverySystem;

    @PostConstruct
    public void postConsturct(){
        System.out.println("Gift presenter has been initialized!");
    }

    public void present(Person person){
        Gift gift = giftChooseHelper.choose(person); //  выбираем подарок
        System.out.println("Gift has been choosen: " + gift.getName()); //
        paymentSystem.pay(gift); // покупаем подарок
        deliverySystem.deliver(gift, person); // доставляем подарок
    }
}
