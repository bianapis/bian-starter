package org.bian.starter.autoconfigure;

import org.bian.starter.config.PubSubProperties;
import org.bian.starter.pubsub.PubSubFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// TODO: Auto-generated Javadoc
/**
 * The Class PubSubAutoConfiguration.
 */
@Configuration
@EnableConfigurationProperties(PubSubProperties.class)
public class PubSubAutoConfiguration {

    /**
     * Gets the pub sub factory.
     *
     * @return the pub sub factory
     */
    @Bean
    @ConditionalOnMissingBean
    public PubSubFactory getPubSubFactory(){
        return new PubSubFactory();
    }
}
