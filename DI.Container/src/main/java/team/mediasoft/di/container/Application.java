package team.mediasoft.di.container;

import team.mediasoft.di.container.client.NewYearOrganizer;
import team.mediasoft.di.container.context.ApplicationContext;
import team.mediasoft.di.container.factory.BeanFactory;

import java.lang.reflect.InvocationTargetException;

public class Application {
    public ApplicationContext run(){
        ApplicationContext applicationContext = new ApplicationContext();
        BeanFactory beanFactory = new BeanFactory(applicationContext);
        applicationContext.setBeanFactory(beanFactory);
        return applicationContext;
    }
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Application Application = new Application();
        ApplicationContext context = Application.run();
        NewYearOrganizer newYearOrganizer = context.getBean(NewYearOrganizer.class);
        newYearOrganizer.prepareToCelebration();
    }
}
