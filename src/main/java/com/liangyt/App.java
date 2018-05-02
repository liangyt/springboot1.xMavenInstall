package com.liangyt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**ß
 * 描述：
 * 创建时间 2018-04-27 09:44
 * 作者 liangyongtong
 */
@SpringBootApplication
@EnableConfigurationProperties
@MapperScan(basePackages = "com.liangyt.dao")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
