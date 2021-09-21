/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

/**
 *
 * @author Tech Land
 */
public class TestLibrarianDao {
    public LibrarianDao mockLibrarian;
    private Connection mockConn;
    private DB mockDb;
    private PreparedStatement mockPs;
    private ResultSet mockRs;
    
    @Before
    public void setUp() {
        mockLibrarian = Mockito.mock(LibrarianDao.class);
        mockConn = Mockito.mock(Connection.class);
        mockDb = Mockito.mock(DB.class);
        mockPs = Mockito.mock(PreparedStatement.class);
        mockRs = Mockito.mock(ResultSet.class);
    }
    

    /**
     * Test of save method, of class LibrarianDao.
     */
    @Test
    public void testSave()throws Exception {
        System.out.println("save");
        String query = "insert into librarian(name,password,email,address,city,contact) values(?,?,?,?,?,?)";
        String name = "Raf";
        String password = "rrrr";
        String email = "raf@gmail.com";
        String address = "1218/7";
        String city = "dacca";
        String contact = "016446";
        int expResult = 0;
        
        //when(mockDb.getConnection()).thenReturn(mockConn);
        when(mockConn.prepareStatement(query)).thenReturn(mockPs);
        int result = mockLibrarian.save(name, password, email, address, city, contact);
        assertEquals(result >0, true);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of delete method, of class LibrarianDao.
     */
    @Test
    public void testDelete()throws Exception {
        System.out.println("delete");
        String query= "delete from librarian where id=?";
        int id = 15;
        int expResult = 0;
        //when(mockDb.getConnection()).thenReturn(mockConn);
        when(mockConn.prepareStatement(query)).thenReturn(mockPs);
        when(mockPs.executeUpdate()).thenReturn(1);
        int result = mockLibrarian.delete(id);
        assertEquals(result>0 , true);
        
        
    }

    /**
     * Test of validate method, of class LibrarianDao.
     */
    @Test
    public void testValidate()throws Exception {
        System.out.println("validate");
        String query = "select * from librarian where name=? and password=?";
        String name = "Fahim";
        String password = "1234";
        boolean expResult = false;
        //when(mockDb.getConnection()).thenReturn(mockConn);
        when(mockConn.prepareStatement(query)).thenReturn(mockPs);
        when(mockPs.executeQuery()).thenReturn(mockRs);
        when(mockRs.next()).thenReturn(true);
        boolean result = mockLibrarian.validate(name, password);
        assertEquals(result,true);
        
    }
    
}
