package online.learning.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    Conn() {
    
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql:///onlinelearningmanagementsystem","root","march2020@juba");
        s = c.createStatement();
    }catch(Exception e){
        e.printStackTrace();
    }
}
    
}
