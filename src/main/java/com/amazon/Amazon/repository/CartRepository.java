package com.amazon.Amazon.repository;

import com.amazon.Amazon.model.Cart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
