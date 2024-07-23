package com.example.memorydb.book.db.repository;

import com.example.memorydb.book.model.BookEntity;
import com.example.memorydb.db.SimpleDataRepository;
import org.springframework.stereotype.Service;

@Service
public class BookRepository extends SimpleDataRepository<BookEntity, Long> {

}
