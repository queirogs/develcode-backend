package com.develcode.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("*") // Permitir requisições de qualquer origem
            .allowedMethods("GET", "POST", "PUT", "DELETE") // Permitir os métodos HTTP especificados
            .allowedHeaders("*"); // Permitir todos os headers
    }

}
