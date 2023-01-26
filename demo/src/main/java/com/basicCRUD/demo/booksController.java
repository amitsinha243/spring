package com.basicCRUD.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class booksController {
    @Autowired  
    BooksService booksService;  

    @GetMapping("/book")  
    private List<books> getAllBooks()   
    {  
        return booksService.getAllBooks();  
    }  
    
    @GetMapping("/book/{bookid}")  
    private books getBooks(@PathVariable("bookid") int bookid)   
    {  
        return booksService.getBooksById(bookid);  
    }  
    
    @DeleteMapping("/book/{bookid}")  
    private void deleteBook(@PathVariable("bookid") int bookid)   
    {  
        booksService.delete(bookid);  
    }  
      
    @PostMapping("/books")  
    private int saveBook(@RequestBody books books)   
    {  
        booksService.saveOrUpdate(books);  
        return books.getBookid();  
    }  
      
    @PutMapping("/books")  
    private books update(@RequestBody books books)   
    {  
        booksService.saveOrUpdate(books);  
        return books;  
    }  
}
