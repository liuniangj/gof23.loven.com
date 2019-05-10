package com.loven.gof23.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lw 2019-05-10 09:39
 */
public class ConcreteComponent implements IComponent {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteComponent.class);

    @Override
    public void operation() {
        LOGGER.info("ConCreateComponent:\t [{}]", ConcreteComponent.class);
    }
}
