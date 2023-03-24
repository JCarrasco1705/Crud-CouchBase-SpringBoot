package com.example.demo.config;

import com.example.demo.controller.AutoController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
@Configuration

public class SwaggerConfig {

	// Se define el paquete donde estan los controllers para de ahi tomar la documentacion
	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				//.apis(RequestHandlerSelectors.basePackage("com.example.demo.controller")).paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage(AutoController.class.getPackage().getName()))
				.build().apiInfo(getApiInfo());
	}

	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"Order Service API",
				"Order Service API Description",
				"1.0",
				"http://www.gruposalinas.com",
				new Contact("Grupo Salinas", "www.gruposalinas.com", "apis@gruposalinas.com.mx"),
				"LICENSE",
				"LICENSE URL",
				Collections.emptyList()
		
				);
	}
}
