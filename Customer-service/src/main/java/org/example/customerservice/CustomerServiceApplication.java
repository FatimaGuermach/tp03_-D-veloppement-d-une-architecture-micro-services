package org.example.customerservice;

import org.example.customerservice.entities.Customer;
import org.example.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {

   customerRepository.save(Customer.builder()
                   .nom("fatima").email("fatima@gmail.com")
           .build());
            customerRepository.save(Customer.builder()
                    .nom("mohamed").email("moh@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .nom("hiba").email("hiba@gmail.com")
                    .build());

            customerRepository.findAll().forEach(c->{

                System.out.println("----------------------------");
                System.out.println(c.getId());
                System.out.println(c.getNom());
                System.out.println(c.getEmail());
            });
        };

    }




}
