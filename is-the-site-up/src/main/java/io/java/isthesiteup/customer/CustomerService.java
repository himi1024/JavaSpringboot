package io.java.isthesiteup.customer;

import java.util.List;
import java.util.Optional;

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

    public void addNewCustomer(Customer customer) {
        
        // Validation Check by Email
        Optional<Customer> customerOptional = customerRepository.findCustomerByEmail(customer.getEmail());
        if(customerOptional.isPresent()){
            throw new IllegalStateException("email had been taken");
        }
        customerRepository.save(customer);
    }

}
