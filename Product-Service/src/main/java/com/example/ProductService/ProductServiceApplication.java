package com.example.ProductService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
@SpringBootApplication
//@EnableSwagger2
//@EnableWebMvc
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

//@SuppressWarnings("unchecked")
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.example.ProductService.Controller")).build();
//	}
	
//	@Bean
//	public OpenAPI openApi() {
//		Info info = new Info().description("Documentation").title("Title").version("V1");
//		return new OpenAPI().info(info);
//	}
}
