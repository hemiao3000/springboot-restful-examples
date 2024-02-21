package com.example.springbootrestfulexample2.config;

import com.google.common.base.Predicate;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ConditionalOnProperty(name = "spring.swagger.enable", havingValue = "true", matchIfMissing = true)
public class SwaggerConfig {

    private static final ApiInfo apiInfo = new ApiInfoBuilder() // 用于描述 API 文件的基础信息
            .title("Swagger2 文档") // 标题
            .description("Rest 风格接口") // 描述
            .version("1.0.0") // 版本号
            .build();

    // 要扫描哪些类上的 Swagger 注解以生成文档
    private static final Predicate<RequestHandler> apis = RequestHandlerSelectors
            .basePackage("com.example.springbootrestfulexample2.web");

    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo).select()
                .apis(apis) // 所有满足这个条件
                .paths(PathSelectors.any())
                .build();
    }
}

