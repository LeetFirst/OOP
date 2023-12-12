package team.mediasoft.di.container.service.impl;

import team.mediasoft.di.container.model.Gift;
import team.mediasoft.di.container.model.Person;
import team.mediasoft.di.container.service.DeliverySystem;

public class PostDeliverySystem implements DeliverySystem {
    @Override
    public void deliver(Gift gift, Person person) {
        System.out.println("Deliver a Smart wathces to " + person.getName() + " by POST");
    }
}
