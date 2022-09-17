package com.example.demo.model;

import java.util.List;

@Entity
@Table("order_items")
public class OrderItems extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne("")
    @Column()
    List<Integer> orderID;
    @ManyToOne("")
    @Column()
    List<Integer> poductId;
    @Column()
    int quantity;
}
