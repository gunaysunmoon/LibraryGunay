/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.dao;

import com.library.model.Admin;
import com.library.model.User;
import com.library.util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    

    @Override
    public User loginAsUser(String username, String password) {
       Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        String sql= "select * from user where login = ? and password = ?";
        
        try {
            con = Util.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            if (rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setSurname(rs.getString("surname"));
            user.setLogin(rs.getString("login"));
            user.setPassword(rs.getString("password"));
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        Util.close(con, ps, rs);
        
        }
        return user;
    }

    public List<User> getAllUser() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<User> list = new ArrayList<>();
        String sql = "select * from user;";
        
        try {
            con = Util.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
            User user = new User();
            user.setId(rs.getInt("Id"));
            user.setName(rs.getString("name"));
            user.setSurname(rs.getString("surname"));
            user.setLogin(rs.getString("login"));
            user.setPassword(rs.getString("password"));
            user.setLastLoginTime(rs.getTimestamp("last_login_time")==null ? null : rs.getTimestamp("last_login_time").toLocalDateTime() );
                     list.add(user);
                         
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        Util.close(con, ps, rs);
        
        }
        return list;
        
    
    }
    
    
}
