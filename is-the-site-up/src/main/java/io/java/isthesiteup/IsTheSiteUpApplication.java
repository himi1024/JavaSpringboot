package io.java.isthesiteup;

// import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IsTheSiteUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsTheSiteUpApplication.class, args);
		// SpringApplication app = new SpringApplication(IsTheSiteUpApplication.class);
		// app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
		// app.run(args);
	}

}
