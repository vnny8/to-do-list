package com.vnny8.todolst.docs;

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
public class SwaggerConfiguration {

    @Bean
    public Docket api(){
        return  new Docket(
                DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.
                        basePackage("com.vnny8.todolst.controller"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(true)
                .apiInfo(apiInfo());

    }


    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("To-do list  - InfoCorp")
                .description("Aplicação de Gerenciar tarefas para a InfoCorp")
                .version("1.0.0")
                .build();
    }
}