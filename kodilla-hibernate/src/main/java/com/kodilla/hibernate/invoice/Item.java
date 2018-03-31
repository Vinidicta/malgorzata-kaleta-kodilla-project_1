package com.kodilla.hibernate.invoice;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
@Data
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Product product;
    private BigDecimal price;
    private int quantity;

    public Item(Product product, BigDecimal price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }
}
