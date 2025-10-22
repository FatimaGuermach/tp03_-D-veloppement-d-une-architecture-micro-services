package org.example.inventoryservice;

import org.example.inventoryservice.entities.Product;
import org.example.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.example.inventoryservice.entities.Product;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;


@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
 @Bean
 CommandLineRunner commandLineRunner(ProductRepository productRepository) {
   return args -> {
       productRepository.save(Product.builder()
                       .id(UUID.randomUUID().toString())
                       .name("computer")
                       .prix(4000)
                       .quantity(11)

               .build());
       productRepository.save(Product.builder()
               .id(UUID.randomUUID().toString())
               .name("printer")
               .prix(2000)
               .quantity(17)

               .build());

       productRepository.save(Product.builder()
               .id(UUID.randomUUID().toString())
               .name("phone")
               .prix(7000)
               .quantity(10)

               .build());
       productRepository.findAll().forEach(p->{
           System.out.println(p.toString());
       });


   };

 }
}
