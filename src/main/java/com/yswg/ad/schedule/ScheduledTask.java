package com.yswg.ad.schedule;

import com.yswg.ad.config.MySQLConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

    @Autowired
    private MySQLConfig mySQLConfig;

    // @Scheduled(fixedRate = 5000)         上一次开始执行时间点之后5秒再执行
    // @Scheduled(fixedDelay = 5000)        上一次执行完毕时间点之后5秒再执行
    // @Scheduled(cron = "*/5 * * * * *")   通过 crontab 表达式定义规则
    @Scheduled(fixedRate = 1000)
    public void helloSpringBootStudy() {
        System.out.println("------------------------------");
        System.out.println("-----helloSpringBootStudy-----");
        System.out.println(mySQLConfig.toString());
        System.out.println(new MySQLConfig().toString());
        System.out.println("------------------------------");
    }
}
