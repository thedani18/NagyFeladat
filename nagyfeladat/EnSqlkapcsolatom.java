/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagyfeladat;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class EnSqlkapcsolatom {
    Connection conn=null;
    public static Connection ConnectDB()
    {
        String host = "jdbc:mysql://localhost:3306/komplex";
        String user = "root";
        String password = "0112Moafe";
        try
        {
           //Class.forName("com.mysql.jdbc.Driver"); 
           Class.forName("com.mysql.cj.jdbc.Driver"); 
           Connection conn=DriverManager.getConnection(host, user, password);
           //JOptionPane.showMessageDialog(null, "Adatbázishoz csatlakozott!");
           return conn;
        }
        catch(Exception error)
        {
            JOptionPane.showMessageDialog(null, error);
            return null;
        }
    }
}
