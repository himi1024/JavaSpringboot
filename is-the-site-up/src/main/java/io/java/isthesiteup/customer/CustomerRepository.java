package io.java.isthesiteup.customer;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// Anything that access the DB
//Data Access
@Repository
public interface  CustomerRepository extends JpaRepository<Customer, Long>{
    
    // SELECT * FROM customer WHERE email 
    @Query("SELECT c FROM Customer c WHERE c.email = ?1")
    Optional<Customer> findCustomerByEmail(String email);
        
}
