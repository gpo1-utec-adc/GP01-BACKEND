package pe.financieraoh.core.coreprodeuda.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("API REST services")
                        .description("Especificacion de REST API services")
                        .license(new License().name("Conciliacion").url("https://conciliacion"))
                        .version("1.0")
                );
    }

}
