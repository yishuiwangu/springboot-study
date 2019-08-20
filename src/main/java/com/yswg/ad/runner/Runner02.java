package com.yswg.ad.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 应用程序启动后 程序运行
 * 默认情况下: ApplicationRunner优先于CommandLineRunner
 * 通过@Order来限制顺序
 */
@Order(value = 2)
@Component
public class Runner02 implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("-------------------------------------");
        System.out.println("---Runner02---Runner02---Runner02----");
        System.out.println("-------------------------------------");
    }
}
