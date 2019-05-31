package com.fwq.gitgithub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: Swagger2Configuration
 * @Author: fanweiqiang
 * @Date: 2019/5/31 11:39
 * @Description: Swagger2配置类 文档地址 http://localhost:8090/swagger-ui.html 由swagger-ui的包生成
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {
    @Bean
    public Docket buildDocket() {
        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())//调用下面apiInfo()方法
                .select()
                //Controller所在路径
                .apis(RequestHandlerSelectors.basePackage("com.fwq.gitgithub.controller"))
                .paths(PathSelectors.any())
                .build();

    }

    public ApiInfo apiInfo() {
        return  new ApiInfoBuilder()
                .title("springboot结合swagger2构建Restful API") //api文档的标题
                .description("这是一个swagger2小型demo")
                .termsOfServiceUrl("localhost:8090")
                .version("0.0.1")
                .build();

    }
}
