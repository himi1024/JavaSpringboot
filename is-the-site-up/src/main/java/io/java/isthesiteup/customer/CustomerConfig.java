package io.java.isthesiteup.customer;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    
    @Bean
    CommandLineRunner CommandLineRunner(CustomerRepository repository){
        return args -> {
            Customer ken = new Customer("Ken", 22, LocalDate.of(2000, 10, 1), "Ken@gmail.com");
            Customer alex = new Customer("Alex", 20, LocalDate.of(1999, 10, 1), "Alex@gmail.com");
            
            repository.saveAll(List.of(ken, alex));
        };
    }
}
