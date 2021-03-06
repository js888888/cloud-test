package com.ky.gateway.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description: swagger 配置类
 * @Author: Mr.Jing
 */

@Configuration
@EnableSwagger2
// @ComponentScan(basePackages = {"com.ysk360.yunb2b.modules.activity.controller"})
// 这里需要注意的是如果加上这个标签会扫描所有的 controller， 并且不能点击
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.ky.gateway.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("服务网关","","");
        return new ApiInfoBuilder()
                .title("服务网关接口")
                .description("接口文档")
                .contact(contact)
                .version("1.0")
                .build();
    }
}
