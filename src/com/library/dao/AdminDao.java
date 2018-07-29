/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.dao;

import com.library.model.Admin;

/**
 *
 * @author Hasa_qs81
 */
public interface AdminDao {
    Admin loginAsAdmin (String username, String password);
    
    
    
}
