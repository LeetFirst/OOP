package team.mediasoft.di.container.service;

import team.mediasoft.di.container.model.Gift;
import team.mediasoft.di.container.model.Person;

public interface DeliverySystem {
    void deliver(Gift gift, Person person);

}
