package com.fangxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 15
 * 将主函数所在类，定义为@Configuration是个明智之举
 * <p>
 * 15.1
 * 可以使用@Import包含多个配置类，而不需要将所有配置写在一个类当中。
 * 否则，@ComponentScan可以包含所有Spring Components，包括@Configuration注解
 * <p>
 * 15.2
 * 如果坚持使用xml配置文件的方式，我们任然推荐先有一个@Configuration,
 * 然后使用@ImportResource注解加载该配置文件
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
