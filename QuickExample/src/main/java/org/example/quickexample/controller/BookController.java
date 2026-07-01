package org.example.quickexample.controller;

import org.example.quickexample.entity.Book;
import org.example.quickexample.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable int id) {
        return bookRepository.findById(id);
    }

    @GetMapping("/title/{title}")
    public List<Book> getByTitle(@PathVariable String title) {
        return bookRepository.findByTitle(title);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        bookRepository.deleteById(id);
        return "Book deleted";
    }
}