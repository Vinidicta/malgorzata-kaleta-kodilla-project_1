package com.kodilla.hibernate.invoice;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    private Long id;

    @Column(name = "NAME")
    private String name;

    public Product(String name) {
        this.name = name;
    }
}
