package com.loven.gof23.singleton.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.loven.gof23.singleton.SingletonModel3;
import com.loven.gof23.singleton.SingletonModel4;

/**
 * @author lw 2019-04-22 11:07 上午
 */
public class TestSingletonModel {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestSingletonModel.class);

    @Test
    public void testSingleton() throws Exception {

        SingletonModel3.testLoading();

        SingletonModel3.getInstance();
        LOGGER.info("=============================================");
        SingletonModel4.testLoading();

        SingletonModel4.getInstance();

        Class.forName("com.loven.gof23.singleton.test.Test1");
    }
}
