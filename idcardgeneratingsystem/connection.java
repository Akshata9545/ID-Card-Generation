/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idcardgeneratingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class connection {
    public Connection conn;
    public connection(){
        try{
			Class.forName("org.postgresql.Driver");
			
		}catch(ClassNotFoundException cnfe){
			System.out.println("could not connect to JDBC driver");
			System.exit(1);
		}
		String hostname="localhost:5432";
		String username="postgres";
		String password="123";
		String dbName="login";
		String connectonurl="jdbc:postgresql://" + hostname + "/" +dbName;
		 try{
			 conn=DriverManager.getConnection(connectonurl,username, password);
                         conn.setAutoCommit(false);
			 System.out.println("Connected Sucessfully");
		 }catch(SQLException sqle)
                 {
			 System.out.println("Connection Failed");
			System.out.println(sqle);
			System.exit(1);
                 }     
    }
}
