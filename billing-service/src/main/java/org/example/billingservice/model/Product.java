package org.example.billingservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
public class Product {
    private String id;
    private String name;
    private  double prix;
    private int quantity;
}
