package com.example.post.book.db.repository;

import com.example.post.book.db.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
