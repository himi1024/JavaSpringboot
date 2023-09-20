package io.java.isthesiteup.customer;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/customer")
public class customerController {
    @GetMapping
    public List<Customer> getCustomers(){
        return List.of(
			new Customer(1L, "Ken", 22, LocalDate.of(2000, 10, 1), "Ken@gmail.com")
		);
    }
}
