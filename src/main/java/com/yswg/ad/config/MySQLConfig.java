package com.yswg.ad.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "adconf.mysql")
public class MySQLConfig {
    private String host;
    private Integer port;
    private String username;
    private String password;
}
