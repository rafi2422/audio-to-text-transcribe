package com.audio.transcribe;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // CORS config to allow frontend to access backend
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // allow all paths
                .allowedOrigins("http://localhost:5173") // your frontend's origin
                .allowedMethods("*") // allow all HTTP methods
                .allowedHeaders("*");
    }
}
