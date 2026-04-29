package com.mascOlav.demo.repository;

import com.mascOlav.demo.model.User;
import com.mascOlav.demo.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
