package com.ecommercebackend.javaspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.csrf((csrf) -> csrf.disable()).authorizeHttpRequests(auth -> {

            auth.requestMatchers(HttpMethod.POST, "/v1/api/category/**").permitAll();


            auth.anyRequest().authenticated();

        }).formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults()).build();
    }
}
