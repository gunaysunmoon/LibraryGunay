/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.model;

import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;

/**
 *
 * @author Hasa_qs81
 */
public class Rent {
    private int id;
    private Book book;
    private Student student;
    private LocalDate rent_date;
    private LocalDate return_date;

    public Rent() {
    }

    public Rent(int id, Book book, Student student, LocalDate rent_date, LocalDate return_date) {
        this.id = id;
        this.book = book;
        this.student = student;
        this.rent_date = rent_date;
        this.return_date = return_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDate getRent_date() {
        return rent_date;
    }

    public void setRent_date(LocalDate rent_date) {
        this.rent_date = rent_date;
    }

    public LocalDate getReturn_date() {
        return return_date;
    }

    public void setReturn_date(LocalDate return_date) {
        this.return_date = return_date;
    }

       
    
    
    
    
}
