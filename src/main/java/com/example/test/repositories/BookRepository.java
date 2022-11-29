package com.example.test.repositories;

import com.example.test.enteties.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

        List<Book> findAllByAuthorId(Long id);

        @Override
        List<Book> findAll();
}
