package com.example.demo.utility;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration                        // 빈 등록
@RequiredArgsConstructor
@PropertySource("classpath:test.properties")
public class PropertyUtil {

    final private Environment environment;

    public String getProperty(String key){
        return environment.getProperty(key);
    }
}
