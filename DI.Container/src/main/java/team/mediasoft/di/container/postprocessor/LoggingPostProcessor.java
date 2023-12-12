package team.mediasoft.di.container.postprocessor;

import java.lang.reflect.InvocationTargetException;

public class LoggingPostProcessor implements BeanPostProcessor{

    @Override
    public void process(Object bean) throws InvocationTargetException, IllegalAccessException {
        System.out.println(String.format("Log: bean has been created: %s", bean.getClass()));
    }
}
