package io.java.isthesiteup.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Anything that access the DB
//Data Access
@Repository
public interface  CustomerRepository extends JpaRepository<Customer, Long>{
    
}
