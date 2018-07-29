/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.dao;

import com.library.model.User;
import java.util.List;

/**
 *
 * @author Hasa_qs81
 */
public interface UserDao {
    User loginAsUser (String username, String password); 
    List <User>  getAllUser();
    
       
}
