package com.yswg.ad.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 应用程序启动后 程序运行
 */
@Order(value = 1)
@Component
public class Runner01 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("-------------------------------------");
        System.out.println("---Runner01---Runner01---Runner01----");
        System.out.println("-------------------------------------");
    }
}
