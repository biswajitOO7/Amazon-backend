package com.amazon.Amazon.service;

import com.amazon.Amazon.model.Cart;

import com.amazon.Amazon.repository.CartRepository;

import java.util.List;

public class CartService {
    private CartRepository cartRepository;
    public List<Cart> getAllCarts(){return cartRepository.findAll();}
}
