package com.susu.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

/**
 * @author sunch
 * @Description
 * @date 2023/6/30 9:31
 **/

@Configuration
@ComponentScan(value = {"com.susu.Bean"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Service.class))
public class SpringConfig {
    //@Component @Controller @Service @Repository
    //类注解，写在类定义上
}
