package com.amazon.Amazon.repository;

import com.amazon.Amazon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
