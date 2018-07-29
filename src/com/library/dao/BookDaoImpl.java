/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.dao;

import com.library.model.Author;
import com.library.model.Book;
import com.library.model.User;
import com.library.util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author Hasa_qs81
 */
public class BookDaoImpl implements BookDao {

    @Override
    public List<Book> getAllBook() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List <Book>  list = new ArrayList();
        String sql= "select b.id as id_book, b.genre, b.title, a.id as id_author,a.full_name from books b inner join author a on b.id_author=a.id";
        
        try {         
            con = Util.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
            Book book = new Book();
            book.setId(rs.getInt("id_book"));
            book.setGenre(rs.getString("genre"));
            book.setTitle(rs.getString("title"));
            
            Author author = new Author();
            author.setId(rs.getInt("id_author"));
            author.setFullName(rs.getString("full_name"));
            book.setAuthor(author);
            list.add(book);
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        Util.close(con, ps, rs);
        
        }
        return list;
    }
        
    
    
}
