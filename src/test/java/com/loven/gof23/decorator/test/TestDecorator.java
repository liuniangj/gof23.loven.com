package com.loven.gof23.decorator.test;

import com.loven.gof23.decorator.ConcreteComponentB;
import com.loven.gof23.decorator.ConcreteDecoratorA;
import com.loven.gof23.decorator.ConcreteDecoratorB;
import com.loven.gof23.decorator.IComponent;
import org.junit.Test;

/**
 * @author lw 2019-05-10 09:52
 */
public class TestDecorator {

    @Test
    public void testDecorator() {
        IComponent component = new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponentB()));
        component.operation();
    }
}
