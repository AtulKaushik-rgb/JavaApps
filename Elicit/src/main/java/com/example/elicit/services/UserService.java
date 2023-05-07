package com.example.elicit.services;

import com.example.elicit.Entities.Customer;
import com.example.elicit.Entities.Order;
import com.example.elicit.Entities.Products;
import com.example.elicit.repositories.CustomerRepository;
import com.example.elicit.repositories.OrderRepository;
import com.example.elicit.repositories.ProductsRepository;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;


@Service
@NoArgsConstructor
public class UserService {

//    @Autowired
//    CustomerRepository customerRepository;
//
//    @Autowired
//    OrderRepository orderRepository;
    @Resource
    private ProductsRepository productsRepository;

    // Products
    public List<Products> getProducts() {
        return (List)productsRepository.findAll();
    }
    public Products getProductById(Long id){
        return productsRepository.findById(id).get();
    }

    public void saveProduct(Products products){
        productsRepository.save(products);
    }
//    // Customer
//    public List <Customer> getCustomer() {
//        return customerRepository.findAll();
//    }
//    public Customer getCustomerById(Long id){
//        return customerRepository.getById(id);
//    }
//    // Order
//    List <Order> getOrders() {
//        return orderRepository.findAll();
//    }
//    Order getOrderById(Long id){
//        return orderRepository.getById(id);
//    }
}
