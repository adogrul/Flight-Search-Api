package Authentication;
import io.swagger.v3.*;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.stereotype.Service;

@OpenAPIDefinition(
        info = @Info(
                description = "Open Api Documentation for Spring Security",
                title = "OpenApi specification - Arda D."

        ),
        servers = @Server(
                description = "Local Environment",
                url = "http://localhost:8080"
        )
)
@SecurityScheme(
        name = "Auth",
        description = "JWT auth description",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {

}
