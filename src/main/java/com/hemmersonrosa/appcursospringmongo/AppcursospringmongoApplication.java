package com.hemmersonrosa.appcursospringmongo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Sistema Cursos API",
                version = "0.0.1"
        )
)
public class AppcursospringmongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppcursospringmongoApplication.class, args);
    }

    /**
     * Configura a especificação OpenAPI para gerar
     * URLs relativas para os endpoints da API.
     * Assim, funciona para sites HTTP (como em localhost) ou HTTPS.
     * @return
     */
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().addServersItem(new Server().url("/"));
    }
}
