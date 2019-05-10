package com.loven.gof23.decorator;

/**
 * @author lw 2019-05-10 09:44
 */
public abstract class AbstractDecorator implements IComponent {

    protected IComponent component;

    public AbstractDecorator(IComponent component){
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
