/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mysql;

import java.sql.*;

/**
 *
 * @author lucian
 */
public class TestConnection {

    public static void main(String[] args) {
        
        Connection connection = new Connection;

        connection = Mysql.MysqlConnection.AccessDB();

        Statement s = connection.CreateStatement();
    }
}
