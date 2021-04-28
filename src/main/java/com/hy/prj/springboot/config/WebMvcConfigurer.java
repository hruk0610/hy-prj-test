package com.hy.prj.springboot.config;

import com.hy.prj.springboot.config.auth.LoginUserArgumentResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class WebMvcConfigurer {
    private final LoginUserArgumentResolver loginUserArgumentResolver;
}
