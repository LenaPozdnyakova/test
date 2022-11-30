package com.example.test.services;
import com.example.test.enteties.Book;
import com.example.test.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> getAllByAuthorId(Long id){
        return bookRepository.findAllByAuthorId(id);
    }


    public Book add(Book book) {
        return bookRepository.save(book);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

}
