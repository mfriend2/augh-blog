package com.codeup.aughblog.repositories;

import com.codeup.aughblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
