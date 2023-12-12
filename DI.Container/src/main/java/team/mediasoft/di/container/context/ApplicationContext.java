package team.mediasoft.di.container.context;

import lombok.Setter;
import team.mediasoft.di.container.factory.BeanFactory;
import team.mediasoft.di.container.postprocessor.BeanPostProcessor;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApplicationContext {
    @Setter
    private BeanFactory beanFactory;
    private final Map<Class, Object> beanMap = new ConcurrentHashMap<>();
    public ApplicationContext(){

    }
    public <T> T getBean(Class<T> clazz) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        if(beanMap.containsKey(clazz)){
            return (T) beanMap.get(clazz);
        }
        T bean = beanFactory.getBean(clazz);
        callPostProcessors(bean);

        beanMap.put(clazz, bean);
        return bean;
    }
    private void callPostProcessors(Object bean) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       for(Class processor : beanFactory.getBeanConfigurator().getScanner().getSubTypesOf(BeanPostProcessor.class)){
           BeanPostProcessor postProcessor =(BeanPostProcessor) processor.getDeclaredConstructor().newInstance();
           postProcessor.process(bean);
       }

    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }
}
