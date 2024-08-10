/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idcardgeneratingsystem;

import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Validation {
    public void displayUsers(String f, String s) {
        try {
             connection cn = new connection();
            String sql = "SELECT username,password FROM login";
            ResultSet rs = Statement.executeQuery(sql);

            while (rs.next()) {
            String username = rs.getString("pbl");
            String password =  rs.getString("kitcoek");

               if ((f.equals(username)) && (s.equals(password))) {

                  JOptionPane.showMessageDialog(null, "Username and Password exist");  
            }else {

             //JOptionPane.showMessageDialog(null, "Please Check Username and Password ");
            }
            rs.close();
        } }catch (SQLException sql) {

            out.println(sql);
        }
    }
}
