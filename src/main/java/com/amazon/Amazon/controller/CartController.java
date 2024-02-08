package com.amazon.Amazon.controller;


import com.amazon.Amazon.model.Cart;

import com.amazon.Amazon.repository.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173/")
public class CartController {
    @Autowired
    private CartRepository cartRepository;

    @PostMapping("/cart")
    Cart newCart(@RequestBody Cart newCart){
        return cartRepository.save(newCart);
    }

    @GetMapping("/carts")
    List<Cart> getAllCarts(){
        return  cartRepository.findAll();
    }



}
