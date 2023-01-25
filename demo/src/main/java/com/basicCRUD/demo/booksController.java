package com.basicCRUD.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class booksController {
    @Autowired
    private booksRepository repo;
    @GetMapping("/book")
    public String showBook(books book){
        return "index";
    }
    
    @PostMapping("/addBook")
    public String addBook(Model model, books book, BindingResult result){
        if(result.hasErrors()){
            return "index";
        }
        repo.save(book);
        return "redirect:/index";
    }
    @GetMapping("/index")
    public String showBooks(Model model){
        model.addAttribute("books", repo.findAll());
        return "index";
    }
    
}
