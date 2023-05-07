package com.example.elicit.controllers;

import com.example.elicit.Entities.Products;
import com.example.elicit.services.UserService;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@NoArgsConstructor
public class ProductsController {

    private Logger logger = LoggerFactory.getLogger(ProductsController.class);

    @Autowired
    public UserService userService;


    @GetMapping
    public List<Products> getProducts(){
        try{
            return userService.getProducts();
        }catch(Exception e){
            logger.error("unable to fetch products", e);
        }
        return null;
    }
    @PostMapping
    public void saveProducts(@RequestBody Products product) {
        System.out.println("data recieve"+product.toString());
        try{
            userService.saveProduct(product);
        }catch(Exception e){
            logger.error("unable to save products", e.toString());
        }

    }
    @GetMapping("/{id}")
    public ResponseEntity<Products> getProductById(@PathVariable Long id) {
        logger.debug("attempting to fetch data");
        Products product = userService.getProductById(id);
        logger.debug("data recieved", product);
        return new ResponseEntity<Products>(product, HttpStatus.OK);
    }
}
