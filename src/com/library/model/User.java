/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.model;

import java.time.LocalDateTime;

/**
 *
 * @author Hasa_qs81
 */
public class User {
    private int id;
    private String name;
    private String surname;
    private String login;
    private String password;
    private LocalDateTime lastLoginTime;

    public User() {
    }

    public User(int id, String name, String surname, String login, String password, LocalDateTime localDateTime) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.lastLoginTime = localDateTime;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastLoginTime(LocalDateTime toLocalDateTime) {
       this.lastLoginTime = lastLoginTime;
    }

    public LocalDateTime getLastLoginTime() {
       return lastLoginTime;
    }
    
    
}
