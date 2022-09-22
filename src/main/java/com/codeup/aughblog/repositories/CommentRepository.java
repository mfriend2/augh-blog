package com.codeup.aughblog.repositories;

import com.codeup.aughblog.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
