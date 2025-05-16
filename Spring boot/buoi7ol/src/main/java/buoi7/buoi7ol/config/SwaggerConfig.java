package buoi7.buoi7ol.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customerOpenAPI(){
        return new OpenAPI().info(new Info().title("Hotel API").version("1.0").description("Documentation Hotel API v1.0"));
    }
}
