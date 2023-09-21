package io.java.isthesiteup.customer;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public List<Customer> getCustomers(){
        return List.of(
			new Customer(1L, "Ken", 22, LocalDate.of(2000, 10, 1), "Ken@gmail.com")
		);
    }

}
