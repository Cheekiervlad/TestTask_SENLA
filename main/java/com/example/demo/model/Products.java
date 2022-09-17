package com.example.demo.model;

import java.util.Date;
@Entity
@Table("products")
public class Products extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY
    @one
    Long id;
    String name;
    int price;
    String status;
    Date createdAt;
}
