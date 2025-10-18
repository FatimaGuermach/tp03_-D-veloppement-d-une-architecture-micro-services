package org.example.customerservice.repository;

import org.example.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource // par spring data rest  pour acceder a toute les method dans cette interface
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
