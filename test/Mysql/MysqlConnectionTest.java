/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mysql;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucian
 */
public class MysqlConnectionTest {
    
    public MysqlConnectionTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of AccessDB method, of class MysqlConnection.
     */
    @Test
    public void testAccessDB() {
        System.out.println("AccessDB");
        MysqlConnection.AccessDB();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
