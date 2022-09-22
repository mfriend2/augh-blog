package com.codeup.aughblog.repositories;

import com.codeup.aughblog.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
