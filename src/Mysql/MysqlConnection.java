/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mysql;

/**
 *
 * @author lucian
 */

import java.sql.* ;


public class MysqlConnection {
    
    
    
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static String DB_URL = "jdbc:mysql://localhost:3306/LuCaAir";
    private static String DB_USER = "root";
    private static String DB_PASSWORD = "lucian1";
    public static Connection connection;
    
    public static void AccessDB() {
        
        
			try {
				Class.forName(DB_DRIVER);
				connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			} catch (ClassNotFoundException e) {
				// TODO: make user friendly error reporting
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
                        
                       
		}
		
    }
    
    

