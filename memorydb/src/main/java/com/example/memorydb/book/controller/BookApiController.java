package com.example.memorydb.book.controller;

import com.example.memorydb.book.model.BookEntity;
import com.example.memorydb.book.service.BookService;
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
