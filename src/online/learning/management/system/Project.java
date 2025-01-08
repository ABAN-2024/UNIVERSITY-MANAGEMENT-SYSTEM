package online.learning.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
    
    Project(){
        
        setSize(1540,850);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        
        //New Information
        JMenu newinformation = new JMenu("New Information");
        mb.add(newinformation);
        
        JMenuItem faculty_info = new JMenuItem("New Faculty Information");
        faculty_info.setForeground(Color.blue);
        faculty_info.addActionListener(this);
        newinformation.add(faculty_info);
        
        JMenuItem student_info = new JMenuItem("New Student Information");
        student_info.setForeground(Color.blue);
        student_info.addActionListener(this);
        newinformation.add(student_info);
        
        //Details
        JMenu details = new JMenu("View Details");
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setForeground(Color.blue);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setForeground(Color.blue);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        //Apply Leave
        JMenu leave = new JMenu("Apply Leave");
        mb.add(leave);
        
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setForeground(Color.blue);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setForeground(Color.blue);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        //Leave Details
        JMenu leavedetails = new JMenu("Leave Details");
        mb.add(leavedetails);
        
        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setForeground(Color.blue);
        facultyleavedetails.addActionListener(this);
        leavedetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setForeground(Color.blue);
        studentleavedetails.addActionListener(this);
        leavedetails.add(studentleavedetails);
        
        //Exam
        JMenu exam = new JMenu("Examination");
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setForeground(Color.blue);
        examinationdetails.addActionListener(this); 
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setForeground(Color.blue);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        //Update Info
        JMenu updateInfo = new JMenu("Update Details");
        mb.add(updateInfo);
        
        JMenuItem updatefacultydetails = new JMenuItem("Update Faculty Details");
        updatefacultydetails.setForeground(Color.blue);
        updatefacultydetails.addActionListener(this);
        updateInfo.add(updatefacultydetails);
        
        JMenuItem updatestudentdetails = new JMenuItem("Update Student Details");
        updatestudentdetails.setForeground(Color.blue);
        updatestudentdetails.addActionListener(this);
        updateInfo.add(updatestudentdetails);
        
        //fee
        JMenu fee = new JMenu("Fee Details");
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setForeground(Color.blue);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setForeground(Color.blue);
        fee.add(feeform);
        
        //Utility
        JMenu utility = new JMenu("Utility");
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setForeground(Color.blue);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setForeground(Color.blue);
        calc.addActionListener(this);
        utility.add(calc);
        
        //About
        JMenu about = new JMenu("About");
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setForeground(Color.blue);
        ab.addActionListener(this);
        about.add(ab);
        
        //Exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.red);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setForeground(Color.red);
        ex.addActionListener(this);
        exit.add(ex);
        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       String msg = ae.getActionCommand();
       
       if(msg.equals("Exit")){
           setVisible(false);
       }else if (msg.equals("Calculator")){
           try{
               Runtime.getRuntime().exec("calc.exe");
           }catch(Exception e){
               
           }
       }else if (msg.equals("Notepad")){
           try{
               Runtime.getRuntime().exec("notepad.exe");
           }catch(Exception e){
               
           }
        } else if(msg.equals("New Faculty Information")) {
           new AddTeacher();
        } else if(msg.equals("New Student Information")) {
           new AddStudent();
        } else if(msg.equals("View Faculty Details")) {
           new TeacherDetails();  
        } else if(msg.equals("View Student Details")) {
           new StudentDetails();
        } else if(msg.equals("Faculty Leave")) {
           new TeacherLeave();
        } else if(msg.equals("Student Leave")) {
           new StudentLeave();
        } else if(msg.equals("Faculty Leave Details")) {
           new TeacherLeaveDetails();
        } else if(msg.equals("Student Leave Details")) {
           new StudentLeaveDetails();
        } else if(msg.equals("Update Faculty Details")) {
           new UpdateTeacher();
        } else if(msg.equals("Update Student Details")) {
           new UpdateStudent();
        } else if(msg.equals("Enter Marks")) {
           new EnterMarks();  
        } else if(msg.equals("Examination Results")) {
           new ExaminationDetails();
        } else if(msg.equals("Fee Structure")) {
           new FeeStructure();
        }
    }  
    
    public static void main(String args[]){
        new Project();
    }
}
