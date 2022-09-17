package com.example.demo.model;
@Entity
@Table("orders")
public class Orders extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @oneToMany()
    Long id;
    @Column("");
    Integer userID;
    @Column("status");
    String status;
    @Column("");
    String createdAt;
}
