package com.loven.gof23.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 优雅的懒汉模式1
 * 
 * <pre>
 * 因为 SingletonModel3Holder 没有被主动使用时不会对 SingletonModel3 进行初始化,
 * 所以在主动使用SingletonModel3(没有调用 getInstance)的时候并不会对实例进行构建。
 * 测试论证{@see com.loven.gof23.singleton.test.TestSingletonModel#testSingleton}
 * </pre>
 * 
 * @author lw 2019-04-22 11:01 上午
 */
public class SingletonModel3 {

    private static final Logger LOGGER = LoggerFactory.getLogger(SingletonModel3.class);

    private SingletonModel3(){
        LOGGER.info("[{}] constructed", SingletonModel3.class.getSimpleName());
    }

    private static class SingletonModel3Holder {

        private static Logger          LOGGER   = LoggerFactory.getLogger(SingletonModel3Holder.class);

        static {
            LOGGER.info("TEST LOADING...");
        }

        private static SingletonModel3 instance = new SingletonModel3();
    }

    public static void testLoading() {
        LOGGER.info("TEST LOADING METHOD [{}]", "testLoading()");
    }

    public static SingletonModel3 getInstance() {
        return SingletonModel3Holder.instance;
    }

}
