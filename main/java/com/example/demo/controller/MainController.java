package com.example.demo.controller;

import com.example.demo.service.serviceImpl.ProductsServiceImpl;

@Controller
@GetMapping("/")
public class MainController {
    ProductsServiceImpl  productsServiceImpl;
    @GetMapping("createProduct")
    void create(){
        productsServiceImpl.create();
    }
    @GetMapping("editProduct")
    void edit(){
        productsServiceImpl.edit();
    }
    @GetMapping("editProduct")
    void delete(){
        productsServiceImpl.delete();
    }
    @GetMapping("allProducts")
    void allProducts(){
        productsServiceImpl.all();
    }

}
