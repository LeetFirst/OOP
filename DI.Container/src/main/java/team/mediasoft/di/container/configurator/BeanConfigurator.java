package team.mediasoft.di.container.configurator;

import org.reflections.Reflections;

public interface BeanConfigurator {
    <T> Class<? extends T> getImplementatonClass(Class<T> interfaceClass);
    Reflections getScanner();
}
