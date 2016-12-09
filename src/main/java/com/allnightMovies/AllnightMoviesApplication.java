package com.allnightMovies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.allnightMovies.interceptor.AllnightMoviesInterceptor;

@SpringBootApplication
public class AllnightMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllnightMoviesApplication.class, args);
	}
// 인터셉터 설정이기는 한데.. 당장의 login 체크에 필요할 것 같지는 않다. 보류	
//	@Bean
//	public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
//		return new WebMvcConfigurerAdapter() {
//			@Override
//			public void addInterceptors(InterceptorRegistry registry) {
//				registry.addInterceptor(new AllnightMoviesInterceptor()).addPathPatterns(patterns);
//				
//			}
//		};
//	}
}
