package com.pengttyy.project.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 * @author pengt
 */
@Configuration
@EnableConfigurationProperties({ProjectProperties.class})
public class ProjectAutoConfiguration {

    @Bean
    public String demoBean(ProjectProperties properties) {
        return properties.getName();
    }
}
