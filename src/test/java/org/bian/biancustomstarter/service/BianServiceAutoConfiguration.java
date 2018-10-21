package org.bian.biancustomstarter.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(BianService.class)
public class BianServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public BianService bianService(){
        return new BianServiceImpl();
    }
}
