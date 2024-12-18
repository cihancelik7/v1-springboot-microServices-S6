package com.cihancelik.accounts;

import com.cihancelik.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*
@ComponensScans({@ComponensScan("com.cihancelik.accounts.controller")})
@EnableJpaRepositories("com.cihancelik.accounts.repository")
@EntityScan("com.cihancelik.accounts.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
 */
@EnableConfigurationProperties(value = AccountsContactInfoDto.class)
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts Microservice REST API Documentation",
                description = "MazeBank Accounts Microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Cihan Celik",
                        email = "cihan.celik7@gmail.com",
                        url = "https://github.com/cihancelik7"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://github.com/cihancelik7"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "MazeBank Accounts Microservice REST API Documentation",
                url = "https://github.com/cihancelik7"
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);

    }
}