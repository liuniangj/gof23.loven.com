package com.loven.gof23.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lw 2019-05-10 09:51
 */
public class ConcreteDecoratorB extends AbstractDecorator {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteDecoratorB.class);

    public ConcreteDecoratorB(IComponent component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        anotherOperationB();
    }

    public void anotherOperationB() {
        LOGGER.info("ConcreteDecorator:\t[{}]", ConcreteDecoratorB.class);
    }
}
