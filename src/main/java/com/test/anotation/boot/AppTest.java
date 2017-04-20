package com.test.anotation.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@ImportResource("classpath:spring-mybatis.xml")
@SpringBootApplication(scanBasePackages = {
        "com.test.controller"
})
@EnableSwagger2
public class AppTest {
	@Bean
	public String test(){
		System.out.println("-------***--");
		return "1";
	}
	  @Bean
	    public HttpMessageConverters restFileDownloadSupport() {
	        ByteArrayHttpMessageConverter arrayHttpMessageConverter = new ByteArrayHttpMessageConverter();
	        return new HttpMessageConverters(arrayHttpMessageConverter);
	    }
	
	public static void main(String[] args) {
        SpringApplication.run(AppTest.class, args);
	}
}
