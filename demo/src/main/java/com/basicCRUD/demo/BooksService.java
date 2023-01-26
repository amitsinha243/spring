package com.basicCRUD.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class BooksService {
@Autowired  
booksRepository booksRepository;  
 
public List<books> getAllBooks()   
{  
    List<books> books = new ArrayList<books>();  
    booksRepository.findAll().forEach(books1 -> books.add(books1));  
    return books;  
}  

    public books getBooksById(int id)   
    {  
        return booksRepository.findById(id).get();  
    }  

    public void saveOrUpdate(books books)   
    {  
        booksRepository.save(books);  
    }

    public void delete(int id)   
    {  
        booksRepository.deleteById(id);  
    }  

    public void update(books books, int bookid)   
    {  
        booksRepository.save(books);  
    }  
}
