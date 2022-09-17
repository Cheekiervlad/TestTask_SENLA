package com.example.demo.service.serviceImpl;

import com.example.demo.repository.ProductsRepository;

@Service
public class ProductsServiceImpl {
    ProductsRepository  productsRepository;
    public void create(){
        productsRepository.createProduct();
    }
    public void edit(){
        productsRepository.editProduct();
    }
    public void delete(){
        productsRepository.deleteProduct();
    }
    public void all(){
        productsRepository.allProducts();
    }
}
