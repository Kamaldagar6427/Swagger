package com.ui.swagger.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(title = "School Management System",
                                description = "This Application for Students Info",
                                summary = "Application Contains Summry Info",
                                termsOfService = "Term&Condition Apllied...",
                                contact = @Contact(name = "DevelopByKamlesh",
                                                   email = "kamlesh@gmail.com",
                                                   url = "8bitsystempri.limited.com"
                                		),
                                license = @License(name = "Approved By Google"),
                                version = "Api/V1"),
                                servers = {@Server(description = "Test",url = "http://localhost:8080"),
                                		@Server(description = "Dev",url = "http://localhost:8080")
                                },
security = @SecurityRequirement(name = "auth")
		)
@SecurityScheme(name = "auth",
in = SecuritySchemeIn.HEADER,
type = SecuritySchemeType.HTTP,
bearerFormat = "JWT",
scheme = "bearer",
description = "This is My Basic Security"
		)

public class SecurityConfig {

}
