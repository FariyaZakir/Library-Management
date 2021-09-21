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
public class TestIssueBookDao {
private Connection mockConn;
private DB mockDb;
private PreparedStatement mockPs;
private ResultSet mockRs;
private IssueBookDao issue;


    
    @Before
    public void setUp() throws Exception {
        mockConn = Mockito.mock(Connection.class);
        mockDb = Mockito.mock(DB.class);
        mockPs = Mockito.mock(PreparedStatement.class);
        mockRs = Mockito.mock(ResultSet.class);
        issue = Mockito.mock(IssueBookDao.class);
        
    }
    
    

    /**
     * Test of checkBook method, of class IssueBookDao.
     */
    @Test
    public void testCheckBook() throws Exception {
        System.out.println("checkBook");
        String bookcallno = "A@D";
        String query = "select * from books where callno=?";
        //when(mockDb.getConnection()).thenReturn(mockConn);
        //when(mockConn.prepareStatement(query).executeQuery()).thenReturn(mockRs);
        
        when(mockConn.prepareStatement(query)).thenReturn(mockPs);
        when(mockPs.executeQuery()).thenReturn(mockRs);
        when(mockRs.next()).thenReturn(true);
        boolean expResult = true;
        boolean result = issue.checkBook(bookcallno);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of save method, of class IssueBookDao.
     */
    @Test
    public void testSave() throws Exception{
        System.out.println("save");
        String bookcallno = "A@D";
        int studentid = 0;
        String studentname = "Hasan";
        String studentcontact = "112233";
        String query = "insert into issuebooks(bookcallno,studentid,studentname,studentcontact) values(?,?,?,?)";
        //when(mockDb.getConnection().prepareStatement(query).executeQuery()).thenReturn(mockRs);
        //when(IssueBookDao.updatebook(bookcallno)).thenReturn(1);
        when(mockConn.prepareStatement(query)).thenReturn(mockPs);
        when(mockPs.executeUpdate()).thenReturn(1);
        
        
        
        int result = issue.save(bookcallno, studentid, studentname, studentcontact);
        assertEquals(result>0,true);
        // TODO review the generated test code and remove the default call to fail.
        
    }

//    /**
//     * Test of updatebook method, of class IssueBookDao.
//     */
    @Test
    public void testUpdatebook()throws Exception {
        System.out.println("updatebook");
        String query  = "update books set quantity=?,issued=? where callno=?";
        String bookcallno = "A@D";
        
        //when(mockDb.getConnection()).thenReturn(mockConn);
        when(mockConn.prepareStatement(query)).thenReturn(mockPs);
        when(mockPs.executeUpdate()).thenReturn(1);
        int result = issue.updatebook(bookcallno);
        assertEquals(result>0, true);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
