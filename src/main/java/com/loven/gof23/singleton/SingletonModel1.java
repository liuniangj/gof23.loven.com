package com.loven.gof23.singleton;

/**
 * 简单的饿汉模式
 * 
 * <pre>
 * 优点：多线程模式下可以确保是单例
 * </pre>
 * 
 * <pre>
 * 缺点：在类被主动使用时，类中所有静态变量(静态常量除外)都会进入初始化阶段，因此在SingletonModel1主动使用时 实例就已经被创建
 * </pre>
 * 
 * @author lw 2019-04-22 10:35 上午
 */
public class SingletonModel1 {

    private static SingletonModel1 instance = new SingletonModel1();

    private SingletonModel1(){
    }

    public static SingletonModel1 getInstance() {
        return instance;
    }
}
