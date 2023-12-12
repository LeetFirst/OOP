package team.mediasoft.di.container.factory;

import lombok.Getter;
import lombok.SneakyThrows;
import team.mediasoft.di.container.annotation.Inject;
import team.mediasoft.di.container.config.Configuration;
import team.mediasoft.di.container.config.JavaConfiguration;
import team.mediasoft.di.container.configurator.BeanConfigurator;
import team.mediasoft.di.container.configurator.JavaBeanConfigurator;
import team.mediasoft.di.container.context.ApplicationContext;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BeanFactory {
    private final Configuration configuration;
    private final BeanConfigurator beanConfigurator;
    private ApplicationContext applicationContext;

    public BeanFactory(ApplicationContext applicationContext) {
        this.configuration = new JavaConfiguration();
        this.beanConfigurator = new JavaBeanConfigurator(configuration.getPackageToScan(), configuration.getInterfaceToImplementations());
        this.applicationContext = applicationContext;
    }

    public <T> T getBean(Class<T> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<? extends T> implementationClass = clazz;
        if (implementationClass.isInterface()) {
            implementationClass = beanConfigurator.getImplementatonClass(implementationClass);
        }
        T bean = implementationClass.getDeclaredConstructor().newInstance();
        for (Field field : Arrays.stream(implementationClass.getDeclaredFields()).filter(field -> field.isAnnotationPresent(Inject.class)).collect(Collectors.toList())) {
            field.setAccessible(true);
            field.set(bean, applicationContext.getBean(field.getType()));
        }
        return bean;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public BeanConfigurator getBeanConfigurator() {
        return beanConfigurator;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
