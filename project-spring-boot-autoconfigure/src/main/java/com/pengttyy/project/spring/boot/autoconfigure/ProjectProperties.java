package com.pengttyy.project.spring.boot.autoconfigure;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author pengt
 */
@ConfigurationProperties(prefix = "project")
@Setter
@Getter
public class ProjectProperties {
    private String name = "hello my spring-boot-starter";
}
