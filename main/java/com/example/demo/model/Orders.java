package com.example.demo.model;
@Entity
@Table("orders")
public class Orders extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;
    int userID;
    String status;
    String createdAt;
}
