package com.example.demo.repository;

public interface ProductsRepository extends JpaRepository{
 @Query("Update products set id = " + id + "name =" + name + "price =" + price + "status =" + status + "createdAp =" + createdAp)
 void createProduct();
 @Query("Update products where id = " + id + " set name =" + name + "price =" + price + "status =" + status + "createdAp =" + createdAp);
 void editProduct();
 @Query("Delete products where id = " + id + " and  status = IN_STOCK OR status = RUNNING_LOW")
 void deleteProduct();
 @Query ("Select Products.name, Products.price, OrderItems.quantity  from Products inner join OrderItems on Products.id  = OrderItems.id where Products.id = " + id + " ORDER BY OrderItems.quantity DESC")
 void allProducts();
}
