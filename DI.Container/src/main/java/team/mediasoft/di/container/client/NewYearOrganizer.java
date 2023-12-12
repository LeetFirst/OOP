package team.mediasoft.di.container.client;

import team.mediasoft.di.container.annotation.Inject;
import team.mediasoft.di.container.factory.BeanFactory;
import team.mediasoft.di.container.model.Person;
import team.mediasoft.di.container.service.GiftPresenter;

import java.lang.reflect.InvocationTargetException;

public class NewYearOrganizer {
    @Inject
    private GiftPresenter giftPresenter;

    public NewYearOrganizer() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    }

    public void prepareToCelebration(){
        Person friend = new Person("Иван Иванов");
        giftPresenter.present(friend);
    }
}
