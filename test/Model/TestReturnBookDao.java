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
public class TestReturnBookDao {
    private ReturnBookDao mockReturn;
    private DB mockDb;
    private Connection mockConn;
    private PreparedStatement mockPs;
    private ResultSet mockRs;
    public TestReturnBookDao() {
    }
    

    
    @Before
    public void setUp() {
        mockReturn = Mockito.mock(ReturnBookDao.class);
        mockDb = Mockito.mock(DB.class);
        mockConn = Mockito.mock(Connection.class);
        mockPs = Mockito.mock(PreparedStatement.class);
        mockRs = Mockito.mock(ResultSet.class);
    }
    

    /**
     * Test of delete method, of class ReturnBookDao.
     */
    @Test
    public void testDelete()throws Exception {
        System.out.println("delete");
        String query = "delete from issuebooks where bookcallno=? and studentid=?";
        String bookcallno = "A@D";
        int studentid = 0;
        //when(mockDb.getConnection()).thenReturn(mockConn);
        //when(mockReturn.updatebook(bookcallno)).thenReturn(1);
        when(mockConn.prepareStatement(query)).thenReturn(mockPs);
        when(mockPs.executeUpdate()).thenReturn(1);
        
        int result = mockReturn.delete(bookcallno, studentid);
        assertEquals(true, result>0);
        
    }

    /**
     * Test of updatebook method, of class ReturnBookDao.
     */
    @Test
    public void testUpdatebook()throws Exception {
        System.out.println("updatebook");
        String query = "update books set quantity=?,issued=? where callno=?";
        String bookcallno = "A@D";
        //when(mockReturn.updatebook(bookcallno)).thenReturn(1);
        when(mockConn.prepareStatement(query)).thenReturn(mockPs);
        when(mockPs.executeQuery()).thenReturn(mockRs);
        when(mockPs.executeUpdate()).thenReturn(1);
        int result = ReturnBookDao.updatebook(bookcallno);
        assertEquals(result>0, true);
        
    }
    
}
