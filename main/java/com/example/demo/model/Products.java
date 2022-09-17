package com.example.demo.model;

import java.util.Date;
@Entity
@Table("products")
public class Products extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY
    @oneToMany()
    Long id;
    @Column("");
    String name;
    @Column("");
    Integer price;
    @Column("");
    String status;
    @Column("");
    Date createdAt;
}
