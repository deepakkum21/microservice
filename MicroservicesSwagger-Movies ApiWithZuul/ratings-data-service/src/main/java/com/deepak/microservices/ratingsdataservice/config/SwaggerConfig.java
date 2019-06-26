package com.deepak.microservices.ratingsdataservice.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
   public Docket api() {
       return new Docket(DocumentationType.SWAGGER_2).select()
               .apis(RequestHandlerSelectors.any())
               .paths(PathSelectors.any()).build().pathMapping("/")
               .apiInfo(apiInfo()).useDefaultResponseMessages(false);
   }
   @Bean
   ApiInfo apiInfo() {
       final ApiInfoBuilder builder = new ApiInfoBuilder();
       builder.title("BlazeMeter Spring Boot API").version("1.0").license("(C) Copyright BlazeMeter")
               .description("List of all endpoints used in API");
       return builder.build();
   }
   
}
