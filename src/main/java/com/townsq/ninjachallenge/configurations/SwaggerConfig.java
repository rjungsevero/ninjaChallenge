package com.townsq.ninjachallenge.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket produtoApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.townsq.ninjachallenge"))
                .paths(PathSelectors.regex("/usuarios.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        ApiInfo apiInfo;
        return apiInfo = new ApiInfo(
                "Condominio API Rest ",
                "API Rest de Condominio",
                "1.0",
                "Terms of Service",
                new Contact("Raul Severo", "https://github.com/rjungsevero/ninjaChallenge", "rjungsevero@gmail.com"),
                "MIT License",
                "https://github.com/rjungsevero/ninjaChallenge/blob/master/LICENSE", new ArrayList<VendorExtension>());
    }
}

