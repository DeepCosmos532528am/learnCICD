package com.learncicd.cicd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class CustomSecurityConfig {

@Bean
SecurityFilterChain customSecurityFilterChain(HttpSecurity http) {
	http.cors(Customizer.withDefaults())
			.authorizeHttpRequests(
			authorize -> authorize.requestMatchers("/greet").permitAll()
	);
	return http.build();
}

@Bean
public CorsConfigurationSource corsConfigurationSource() {
	CorsConfiguration corsConfiguration = new CorsConfiguration();
	corsConfiguration.setAllowedOrigins(Arrays.asList("http://13.201.222.247:5173")); //The server IP is exposed openly here, never the right approach in real applications
//	As this project is primarily to focus on learning CICD flow!!! And the IP is temporary so kept open here without any env variables configuration
	corsConfiguration.setAllowedMethods(Arrays.asList("GET"));
	corsConfiguration.setAllowedHeaders(Arrays.asList("*"));
	
	
	corsConfiguration.setAllowCredentials(true);
	
	corsConfiguration.setMaxAge(36000L);
	
	UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	
	source.registerCorsConfiguration("/**", corsConfiguration);
	
	return source;
}
}