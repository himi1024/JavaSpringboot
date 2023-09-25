package io.java.isthesiteup.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    // Return all the customer data
    public List<Customer> getCustomers(){
			return customerRepository.findAll();
    }

}
