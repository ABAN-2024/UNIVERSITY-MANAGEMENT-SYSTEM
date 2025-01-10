
package online.learning.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    
    About(){
        
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.white);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>Online Learning<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);
        
        JLabel name = new JLabel("Developed By: Team AAAA");
        name.setBounds(70, 220, 500, 50);
        name.setFont(new Font("Tahoma",Font.BOLD,30));
        add(name);
        
        JLabel contact = new JLabel("Contact: teamaaaa@gmail.com");
        contact.setBounds(70, 340, 500, 50);
        contact.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
    
}
