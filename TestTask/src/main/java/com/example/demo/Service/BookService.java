package com.example.demo.Service;

import com.example.demo.Entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Long id);
    Book save(Book book);
    void delete(Book book);
}
