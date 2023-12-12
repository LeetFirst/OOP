package team.mediasoft.di.container.postprocessor;

import team.mediasoft.di.container.annotation.PostConstruct;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PostConstructBeanPostProcessor implements BeanPostProcessor{

    @Override
    public void process(Object bean) throws InvocationTargetException, IllegalAccessException {
        for(Method method : bean.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(PostConstruct.class)){
                method.invoke(bean);
            }
        }
    }
}
