
package online.learning.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class FeeStructure extends JFrame{
    
    JTable table;
    
    FeeStructure(){
        
        setSize(1000,600);
        setLocation(250,50);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        JLabel heading = new JLabel("Fee Structure");
        heading.setBounds(50, 10, 400, 30);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);
        
        table = new JTable();
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from fee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane();
        jsp.setBounds(0, 60, 1000, 600);
        add(jsp);
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        new FeeStructure();
    }
}
