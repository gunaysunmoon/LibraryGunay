/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.dao;

import com.library.model.Admin;
import com.library.util.Util;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static java.util.Collections.list;



public class AdminDaoImpl implements AdminDao { 

    @Override
    public Admin loginAsAdmin(String username, String password) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Admin admin = null;
        String sql= "select * from admin where login = ? and password = ?";
        
        try {
            con = Util.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            if (rs.next()){
            admin = new Admin();
            admin.setId(rs.getInt("id"));
            admin.setName(rs.getString("name"));
            admin.setSurname(rs.getString("surname"));
            admin.setLogin(rs.getString("login"));
            admin.setPassword(rs.getString("password"));
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        Util.close(con, ps, rs);
        
        }
        return admin;
               
        
    }
    
    
    
    
    
    
}
