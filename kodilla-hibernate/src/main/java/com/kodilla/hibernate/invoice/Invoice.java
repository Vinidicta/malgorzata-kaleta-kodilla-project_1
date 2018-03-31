package com.kodilla.hibernate.invoice;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@ToString(exclude = "items")
public class Invoice {
    @Id
    @GeneratedValue
    private Long id;
    private String number;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> items;

    public Invoice(String number, List<Item> items) {
        this.number = number;
        this.items = items;
    }
}
