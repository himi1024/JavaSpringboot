package io.java.isthesiteup;

import java.time.LocalDate;
import java.util.List;

// import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.java.isthesiteup.customer.Customer;

@SpringBootApplication
@RestController
public class IsTheSiteUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsTheSiteUpApplication.class, args);
	}

	@GetMapping
    public List<Customer> hello(){
        return List.of(
			new Customer(1L, "Ken", 22, LocalDate.of(2000, 10, 1), "Ken@gmail.com")
		);
    }

}
