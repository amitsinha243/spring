package com.basicCRUD.demo;

import org.springframework.data.repository.CrudRepository;

public interface booksRepository extends CrudRepository<books, Integer>{
    
}
