package com.github.thetruehoha.springGPT.Config;

import feign.Logger;
import feign.Request;
import feign.RequestInterceptor;
import feign.Retryer;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Indexed;


@Indexed
@Configuration
@ConfigurationProperties
@Slf4j
@Getter
@Setter
public class OpenApiConfig {

    //@Value("${openai-service.http-client.read-timeout")
    private int readTimeout = 3000;
    //@Value("${openai-service.http-client.connect-timeout}")
    private int connectTimeout = 3000;
    @Value("${openai-service.api-key}")
    private String apiKey;
    @Value("${openai-service.gpt-model}")
    private String model;
    @Bean
    public Request.Options options(){
        return new Request.Options(getReadTimeout(), getConnectTimeout());
    }
    @Bean
    public Logger.Level feignLogger(){
        return Logger.Level.FULL;
    }
    @Bean
    public Retryer retryer(){
        return new Retryer.Default();
    }
    @Bean
    public RequestInterceptor requestInterceptor(){
        return request -> request.header("Authorization", "Bearer" + apiKey);
    }
}
