package team.mediasoft.di.container.service.impl;

import team.mediasoft.di.container.annotation.Inject;
import team.mediasoft.di.container.factory.BeanFactory;
import team.mediasoft.di.container.model.Gift;
import team.mediasoft.di.container.model.Person;
import team.mediasoft.di.container.service.GiftChooseHelper;

import java.lang.reflect.InvocationTargetException;

public class SmartGiftChooseHelper implements GiftChooseHelper {
   @Inject
    Recomendator recomendator;

    public SmartGiftChooseHelper() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    }

    @Override
    public Gift choose(Person person) {
        recomendator.recommend();
        return new Gift("Smart watches", 1000);
    }
}
