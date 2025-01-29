package com.absjrdev.dslist.services.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Game List").version("1.0.0")
				.description("Listing and information about games").contact(new Contact().name("Arnaldo Junior")
						.url("https://github.com/absjuniordev").email("abs.junnior@hotmail.com"))

		);
	}
}
