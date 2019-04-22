package com.loven.gof23.singleton;

/**
 * 懒汉模式 double check 双重验证
 *
 * @author lw 2019-04-22 10:57 上午
 */
public class SingletonModel2 {

    private volatile static SingletonModel2 instance;

    private SingletonModel2() {
    }

    public static SingletonModel2 getInstance() {
        if (null == instance) {
            synchronized (SingletonModel2.class) {
                if (null == instance) {
                    return new SingletonModel2();
                }
            }
        }
        return instance;
    }
}
