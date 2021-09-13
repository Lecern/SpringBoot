package com.jerry.springbootcondition.config;

import com.jerry.springbootcondition.bean.User;
import com.jerry.springbootcondition.condition.ClassCondition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    @Conditional(ClassCondition.class)
    public User user() {
        return new User();
    }

    @Bean
    @ConditionalOnProperty(name = "person.name", havingValue = "jerry")
    public User user2() {
        return new User();
    }

}
