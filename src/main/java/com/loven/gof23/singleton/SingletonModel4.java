package com.loven.gof23.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 基于enum的特性构建的优雅单例模式
 *
 * <pre>
 * 测试论证{@see com.loven.gof23.singleton.test.TestSingletonModel#testSingleton}
 * </pre>
 *
 * @author lw 2019-04-22 11:22 上午
 */
public class SingletonModel4 {

    private static final Logger LOGGER = LoggerFactory.getLogger(SingletonModel4.class);

    private SingletonModel4(){
        LOGGER.info("[{}] constructed", SingletonModel3.class.getSimpleName());
    }

    private static enum Single {

        INSTANCE;

        private SingletonModel4 instance;

        Single(){
            instance = new SingletonModel4();
        }
    }

    public static void testLoading() {
        LOGGER.info("TEST LOADING METHOD [{}]", "testLoading()");
    }

    public static SingletonModel4 getInstance() {
        return Single.INSTANCE.instance;
    }
}
