package com.codeup.aughblog.repositories;

import com.codeup.aughblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
