package com.jerry.springbootcondition.config;

import com.jerry.springbootcondition.bean.Circle;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({Circle.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
@Configuration
public class MyConfig {
}
