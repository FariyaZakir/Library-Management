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

/**
 *
 * @author Tech Land
 */
public class TestDB {
    
    
    
    @Before
    public void setUp() {
    }

    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        
        Connection result = DB.getConnection();
        assertEquals(result != null , true);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}