package com.basicCRUD.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="booksDB")
public class books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String author;

    public int getBookid()   
    {  
        return id;  
    }  
    public void setBookid(int id)   
    {  
        this.id = id;  
    }  
    public String getBookname()  
    {  
        return name;  
    }  
    public void setBookname(String name)   
    {  
        this.name = name;  
    }  
    public String getAuthor()   
    {  
        return author;  
    }  
    public void setAuthor(String author)   
    {  
        this.author = author;  
    }      
}
