package com.example.post.book.controller;

import com.example.post.book.db.entity.BookEntity;
import com.example.post.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/book")
public class BookApiController {
    private final BookService bookService;

    @PostMapping ("")
    public BookEntity create(@RequestBody BookEntity bookEntity) {
        return bookService.create(bookEntity);
    }

    @GetMapping("/all")
    public List<BookEntity> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/id/{id}")
    public BookEntity findById(@PathVariable Long id) {
        var response = bookService.findById(id);
        return response.get();
    }

    @DeleteMapping("/id/{id}")
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }
}
