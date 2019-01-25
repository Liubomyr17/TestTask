package com.example.demo.Service;

import com.example.demo.Entity.Book;
import com.example.demo.Repository.BookRepository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("bookService")
@Repository
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    @Transactional(readOnly=true)
    public List<Book> findAll() {
        return Lists.newArrayList(bookRepository.findAll());
    }
    @Override
    @Transactional(readOnly=true)
    public Book findById(Long id) {
        return bookRepository.findOne(id);
    }
    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }
    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }
}
