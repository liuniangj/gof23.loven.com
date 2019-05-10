package com.loven.gof23.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lw 2019-05-10 09:48
 */
public class ConcreteDecoratorA extends AbstractDecorator {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteDecoratorA.class);

    public ConcreteDecoratorA(IComponent component){
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        anotherOperationA();
    }

    public void anotherOperationA() {
        LOGGER.info("ConcreteDecorator:\t[{}]", ConcreteDecoratorA.class);
    }
}
