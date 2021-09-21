package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.PreparedStatement;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;


/**
 *
 * @author Tech Land
 */
public class TestBookDao {
    private DB db;
    private PreparedStatement ps;
    private Connection conn;
    public BookDao bookdao;
    
    
    @Before
    public void setUp() throws Exception{
      db = Mockito.mock(DB.class);
      conn  = Mockito.mock(Connection.class);
      ps = Mockito.mock(PreparedStatement.class);
      bookdao = Mockito.mock(BookDao.class);
     
      }
    

    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        String query = "insert into books(callno,name,author,publisher,quantity,issued) values(?,?,?,?,?,?)";
        // THESE ARE PARAMETERS
        String callno = "C@L";
        String name = "A Book which can change your life";
        String author = "Shahriar";
        String publisher = "my publisher";
        int quantity = 4;
        int issued = 1;
        //when(DB.getConnection()).thenReturn(conn);
             
        when(conn.prepareStatement(query)).thenReturn(ps);
              
        when(ps.executeUpdate()).thenReturn(1);
        int result = bookdao.save(callno, name, author, publisher, quantity, issued);
              
        assertEquals(result, 1);
        
    }
    
}
