package com.nadimnesar.inversion.of.control.bean.config;

import com.nadimnesar.inversion.of.control.bean.Computer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Computer hpBook(){
        return new Computer("HP","2", 1, 2, 3.0);
    }

    @Bean
    public Computer dclBook(){
        return new Computer("DCL","1", 1, 2, 3.0);
    }
}
