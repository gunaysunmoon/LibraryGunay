/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.model;

/**
 *
 * @author Hasa_qs81
 */
public class Book {
    private int id;
    private Book bookname;
    private Author author;

    public Book() {
    }

    public Book(int id, Book bookname, Author author) {
        this.id = id;
        this.bookname = bookname;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBookname() {
        return bookname;
    }

    public void setBookname(Book bookname) {
        this.bookname = bookname;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    

   
    
    
}
