package com.restserver.restserver.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.restserver.restserver.Model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{
    
}
