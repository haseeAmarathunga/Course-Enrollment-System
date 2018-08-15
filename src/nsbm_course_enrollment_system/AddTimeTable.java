/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm_course_enrollment_system;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ClashHacker
 */
public class AddTimeTable extends javax.swing.JFrame {

    /**
     * Creates new form AddTimeTable
     */
    public AddTimeTable() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
    }

    public Connection getConnection()
    {
        Connection con =null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/nsbm","root","");
            return con;
        } catch (SQLException ex) {
            //Logger.getLogger(AddStuDetails.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Not Connected");
            return null;
        }
    }
    
    //After clicked faculty get Course
    public void getFac(){
        String fac=(String) faculty.getSelectedItem();
        course.removeAllItems();
        if(fac.equals("School Of Computing")){
            course.addItem("Computer Science");
            course.addItem("Information System");
        }
        else if(fac.equals("School Of Business")){
            course.addItem("Business Management");
            course.addItem("Business Analysis");
        }
        else{
            course.addItem("Civil Engineering");
            course.addItem("Electronic Engineering");
        }
    }
    
    
    public void SelectedSubMonday(){
        String cou=(String) course.getSelectedItem();
        Monday.removeAllItems();
        Monday.addItem("None");

        String yea="";
        if (year.getSelectedItem().equals("1st")){
            yea="1";
        }
        else if (year.getSelectedItem().equals("2nd")){
            yea="2";
        }
        else if (year.getSelectedItem().equals("3rd")){
            yea="3";
        }
     if(sem.getSelectedItem().equals("1st")){   
        if (cou.equals("Computer Science")){
           Monday.addItem("CS"+yea+"001");
           Monday.addItem("CS"+yea+"002");
      
           
           Monday.addItem("CS"+yea+"003");
           Monday.addItem("CS"+yea+"004");
           Monday.addItem("CS"+yea+"005");;
           //sub1

           Monday.addItem("CS"+yea+"006");
           Monday.addItem("CS"+yea+"007");
           
           
        }
        else if (cou.equals("Information System")){
           Monday.addItem("IS"+yea+"001");

           Monday.addItem("IS"+yea+"002");
   
           
           Monday.addItem("IS"+yea+"003");
           Monday.addItem("IS"+yea+"004");
           Monday.addItem("IS"+yea+"005");;
           //sub1

           Monday.addItem("IS"+yea+"006");
           Monday.addItem("IS"+yea+"007");
        }
        else if (cou.equals("Business Management")){
           Monday.addItem("BM"+yea+"001");
          
           Monday.addItem("BM"+yea+"002");
         
           
           Monday.addItem("BM"+yea+"003");
           Monday.addItem("BM"+yea+"004");
           Monday.addItem("BM"+yea+"005");;
           //sub1

           Monday.addItem("BM"+yea+"006");
           Monday.addItem("BM"+yea+"007");
        }
        else if (cou.equals("Business Analysis")){
           Monday.addItem("BA"+yea+"001");
           //
           Monday.addItem("BA"+yea+"002");
           //
           
           Monday.addItem("BA"+yea+"003");
           Monday.addItem("BA"+yea+"004");
           Monday.addItem("BA"+yea+"005");;
           //sub1

           Monday.addItem("BA"+yea+"006");
           Monday.addItem("BA"+yea+"007");
        }
        else if (cou.equals("Civil Engineering")){
           Monday.addItem("CE"+yea+"001");
           //
           Monday.addItem("CE"+yea+"002");
           
           
           Monday.addItem("CE"+yea+"003");
           Monday.addItem("CE"+yea+"004");
           Monday.addItem("CE"+yea+"005");;
           //sub1

           Monday.addItem("CE"+yea+"006");
           Monday.addItem("CE"+yea+"007");
        }
        else if (cou.equals("Electronic Engineering")){
        Monday.addItem("EE"+yea+"001");
           
           Monday.addItem("EE"+yea+"002");
           
           
           Monday.addItem("EE"+yea+"003");
           Monday.addItem("EE"+yea+"004");
           Monday.addItem("EE"+yea+"005");;
           //sub1

           Monday.addItem("EE"+yea+"006");
           Monday.addItem("EE"+yea+"007");
        }
     } 
     
     else if(sem.getSelectedItem().equals("2nd")){   
        if (cou.equals("Computer Science")){
           Monday.addItem("CS"+yea+"008");
           
           Monday.addItem("CS"+yea+"009");
           
           
           Monday.addItem("CS"+yea+"010");
           Monday.addItem("CS"+yea+"011");
           Monday.addItem("CS"+yea+"012");;
           //sub1

           Monday.addItem("CS"+yea+"013");
           Monday.addItem("CS"+yea+"014");
           
           
        }
        else if (cou.equals("Information System")){
           Monday.addItem("IS"+yea+"008");
           
           Monday.addItem("IS"+yea+"009");
           
           
           Monday.addItem("IS"+yea+"010");
           Monday.addItem("IS"+yea+"011");
           Monday.addItem("IS"+yea+"012");;
           //sub1

           Monday.addItem("IS"+yea+"013");
           Monday.addItem("IS"+yea+"014");
        }
        else if (cou.equals("Business Management")){
           Monday.addItem("BM"+yea+"008");
           
           Monday.addItem("BM"+yea+"009");
           
           
           Monday.addItem("BM"+yea+"010");
           Monday.addItem("BM"+yea+"011");
           Monday.addItem("BM"+yea+"012");;
           //sub1

           Monday.addItem("BM"+yea+"013");
           Monday.addItem("BM"+yea+"014");
        }
        else if (cou.equals("Business Analysis")){
           Monday.addItem("BA"+yea+"008");
           
           Monday.addItem("BA"+yea+"009");
           
           
           Monday.addItem("BA"+yea+"010");
           Monday.addItem("BA"+yea+"011");
           Monday.addItem("BA"+yea+"012");;
           //sub1

           Monday.addItem("BA"+yea+"013");
           Monday.addItem("BA"+yea+"014");
        }
        else if (cou.equals("Civil Engineering")){
           Monday.addItem("CE"+yea+"008");
           
           Monday.addItem("CE"+yea+"009");
           
           
           Monday.addItem("CE"+yea+"010");
           Monday.addItem("CE"+yea+"011");
           Monday.addItem("CE"+yea+"012");;
           //sub1

           Monday.addItem("CE"+yea+"013");
           Monday.addItem("CE"+yea+"014");
        }
        else if (cou.equals("Electronic Engineering")){
        Monday.addItem("EE"+yea+"008");
           
           Monday.addItem("EE"+yea+"009");
           
           
           Monday.addItem("EE"+yea+"010");
           Monday.addItem("EE"+yea+"011");
           Monday.addItem("EE"+yea+"012");;
           //sub1

           Monday.addItem("EE"+yea+"013");
           Monday.addItem("EE"+yea+"014");
        }
     }
    
    }
    
    public void SelectedSubTuesday(){
        String cou=(String) course.getSelectedItem();
        Tuesday.removeAllItems();
        Tuesday.addItem("None");

        String yea="";
        if (year.getSelectedItem().equals("1st")){
            yea="1";
        }
        else if (year.getSelectedItem().equals("2nd")){
            yea="2";
        }
        else if (year.getSelectedItem().equals("3rd")){
            yea="3";
        }
     if(sem.getSelectedItem().equals("1st")){   
        if (cou.equals("Computer Science")){
           Tuesday.addItem("CS"+yea+"001");
           Tuesday.addItem("CS"+yea+"002");
      
           
           Tuesday.addItem("CS"+yea+"003");
           Tuesday.addItem("CS"+yea+"004");
           Tuesday.addItem("CS"+yea+"005");;
           //sub1

           Tuesday.addItem("CS"+yea+"006");
           Tuesday.addItem("CS"+yea+"007");
           
           
        }
        else if (cou.equals("Information System")){
           Tuesday.addItem("IS"+yea+"001");

           Tuesday.addItem("IS"+yea+"002");
   
           
           Tuesday.addItem("IS"+yea+"003");
           Tuesday.addItem("IS"+yea+"004");
           Tuesday.addItem("IS"+yea+"005");;
           //sub1

           Tuesday.addItem("IS"+yea+"006");
           Tuesday.addItem("IS"+yea+"007");
        }
        else if (cou.equals("Business Management")){
           Tuesday.addItem("BM"+yea+"001");
          
           Tuesday.addItem("BM"+yea+"002");
         
           
           Tuesday.addItem("BM"+yea+"003");
           Tuesday.addItem("BM"+yea+"004");
           Tuesday.addItem("BM"+yea+"005");;
           //sub1

           Tuesday.addItem("BM"+yea+"006");
           Tuesday.addItem("BM"+yea+"007");
        }
        else if (cou.equals("Business Analysis")){
           Tuesday.addItem("BA"+yea+"001");
           //
           Tuesday.addItem("BA"+yea+"002");
           //
           
           Tuesday.addItem("BA"+yea+"003");
           Tuesday.addItem("BA"+yea+"004");
           Tuesday.addItem("BA"+yea+"005");;
           //sub1

           Tuesday.addItem("BA"+yea+"006");
           Tuesday.addItem("BA"+yea+"007");
        }
        else if (cou.equals("Civil Engineering")){
           Tuesday.addItem("CE"+yea+"001");
           //
           Tuesday.addItem("CE"+yea+"002");
           
           
           Tuesday.addItem("CE"+yea+"003");
           Tuesday.addItem("CE"+yea+"004");
           Tuesday.addItem("CE"+yea+"005");;
           //sub1

           Tuesday.addItem("CE"+yea+"006");
           Tuesday.addItem("CE"+yea+"007");
        }
        else if (cou.equals("Electronic Engineering")){
        Tuesday.addItem("EE"+yea+"001");
           
           Tuesday.addItem("EE"+yea+"002");
           
           
           Tuesday.addItem("EE"+yea+"003");
           Tuesday.addItem("EE"+yea+"004");
           Tuesday.addItem("EE"+yea+"005");;
           //sub1

           Tuesday.addItem("EE"+yea+"006");
           Tuesday.addItem("EE"+yea+"007");
        }
     } 
     
     else if(sem.getSelectedItem().equals("2nd")){   
        if (cou.equals("Computer Science")){
           Tuesday.addItem("CS"+yea+"008");
           
           Tuesday.addItem("CS"+yea+"009");
           
           
           Tuesday.addItem("CS"+yea+"010");
           Tuesday.addItem("CS"+yea+"011");
           Tuesday.addItem("CS"+yea+"012");;
           //sub1

           Tuesday.addItem("CS"+yea+"013");
           Tuesday.addItem("CS"+yea+"014");
           
           
        }
        else if (cou.equals("Information System")){
           Tuesday.addItem("IS"+yea+"008");
           
           Tuesday.addItem("IS"+yea+"009");
           
           
           Tuesday.addItem("IS"+yea+"010");
           Tuesday.addItem("IS"+yea+"011");
           Tuesday.addItem("IS"+yea+"012");;
           //sub1

           Tuesday.addItem("IS"+yea+"013");
           Tuesday.addItem("IS"+yea+"014");
        }
        else if (cou.equals("Business Management")){
           Tuesday.addItem("BM"+yea+"008");
           
           Tuesday.addItem("BM"+yea+"009");
           
           
           Tuesday.addItem("BM"+yea+"010");
           Tuesday.addItem("BM"+yea+"011");
           Tuesday.addItem("BM"+yea+"012");;
           //sub1

           Tuesday.addItem("BM"+yea+"013");
           Tuesday.addItem("BM"+yea+"014");
        }
        else if (cou.equals("Business Analysis")){
           Tuesday.addItem("BA"+yea+"008");
           
           Tuesday.addItem("BA"+yea+"009");
           
           
           Tuesday.addItem("BA"+yea+"010");
           Tuesday.addItem("BA"+yea+"011");
           Tuesday.addItem("BA"+yea+"012");;
           //sub1

           Tuesday.addItem("BA"+yea+"013");
           Tuesday.addItem("BA"+yea+"014");
        }
        else if (cou.equals("Civil Engineering")){
           Tuesday.addItem("CE"+yea+"008");
           
           Tuesday.addItem("CE"+yea+"009");
           
           
           Tuesday.addItem("CE"+yea+"010");
           Tuesday.addItem("CE"+yea+"011");
           Tuesday.addItem("CE"+yea+"012");;
           //sub1

           Tuesday.addItem("CE"+yea+"013");
           Tuesday.addItem("CE"+yea+"014");
        }
        else if (cou.equals("Electronic Engineering")){
        Tuesday.addItem("EE"+yea+"008");
           
           Tuesday.addItem("EE"+yea+"009");
           
           
           Tuesday.addItem("EE"+yea+"010");
           Tuesday.addItem("EE"+yea+"011");
           Tuesday.addItem("EE"+yea+"012");;
           //sub1

           Tuesday.addItem("EE"+yea+"013");
           Tuesday.addItem("EE"+yea+"014");
        }
     }
    
    }
    
    public void SelectedSubWednesday(){
        String cou=(String) course.getSelectedItem();
        Wednesday.removeAllItems();
        Wednesday.addItem("None");

        String yea="";
        if (year.getSelectedItem().equals("1st")){
            yea="1";
        }
        else if (year.getSelectedItem().equals("2nd")){
            yea="2";
        }
        else if (year.getSelectedItem().equals("3rd")){
            yea="3";
        }
     if(sem.getSelectedItem().equals("1st")){   
        if (cou.equals("Computer Science")){
           Wednesday.addItem("CS"+yea+"001");
           Wednesday.addItem("CS"+yea+"002");
      
           
           Wednesday.addItem("CS"+yea+"003");
           Wednesday.addItem("CS"+yea+"004");
           Wednesday.addItem("CS"+yea+"005");;
           //sub1

           Wednesday.addItem("CS"+yea+"006");
           Wednesday.addItem("CS"+yea+"007");
           
           
        }
        else if (cou.equals("Information System")){
           Wednesday.addItem("IS"+yea+"001");

           Wednesday.addItem("IS"+yea+"002");
   
           
           Wednesday.addItem("IS"+yea+"003");
           Wednesday.addItem("IS"+yea+"004");
           Wednesday.addItem("IS"+yea+"005");;
           //sub1

           Wednesday.addItem("IS"+yea+"006");
           Wednesday.addItem("IS"+yea+"007");
        }
        else if (cou.equals("Business Management")){
           Wednesday.addItem("BM"+yea+"001");
          
           Wednesday.addItem("BM"+yea+"002");
         
           
           Wednesday.addItem("BM"+yea+"003");
           Wednesday.addItem("BM"+yea+"004");
           Wednesday.addItem("BM"+yea+"005");;
           //sub1

           Wednesday.addItem("BM"+yea+"006");
           Wednesday.addItem("BM"+yea+"007");
        }
        else if (cou.equals("Business Analysis")){
           Wednesday.addItem("BA"+yea+"001");
           //
           Wednesday.addItem("BA"+yea+"002");
           //
           
           Wednesday.addItem("BA"+yea+"003");
           Wednesday.addItem("BA"+yea+"004");
           Wednesday.addItem("BA"+yea+"005");;
           //sub1

           Wednesday.addItem("BA"+yea+"006");
           Wednesday.addItem("BA"+yea+"007");
        }
        else if (cou.equals("Civil Engineering")){
           Wednesday.addItem("CE"+yea+"001");
           //
           Wednesday.addItem("CE"+yea+"002");
           
           
           Wednesday.addItem("CE"+yea+"003");
           Wednesday.addItem("CE"+yea+"004");
           Wednesday.addItem("CE"+yea+"005");;
           //sub1

           Wednesday.addItem("CE"+yea+"006");
           Wednesday.addItem("CE"+yea+"007");
        }
        else if (cou.equals("Electronic Engineering")){
        Wednesday.addItem("EE"+yea+"001");
           
           Wednesday.addItem("EE"+yea+"002");
           
           
           Wednesday.addItem("EE"+yea+"003");
           Wednesday.addItem("EE"+yea+"004");
           Wednesday.addItem("EE"+yea+"005");;
           //sub1

           Wednesday.addItem("EE"+yea+"006");
           Wednesday.addItem("EE"+yea+"007");
        }
     } 
     
     else if(sem.getSelectedItem().equals("2nd")){   
        if (cou.equals("Computer Science")){
           Wednesday.addItem("CS"+yea+"008");
           
           Wednesday.addItem("CS"+yea+"009");
           
           
           Wednesday.addItem("CS"+yea+"010");
           Wednesday.addItem("CS"+yea+"011");
           Wednesday.addItem("CS"+yea+"012");;
           //sub1

           Wednesday.addItem("CS"+yea+"013");
           Wednesday.addItem("CS"+yea+"014");
           
           
        }
        else if (cou.equals("Information System")){
           Wednesday.addItem("IS"+yea+"008");
           
           Wednesday.addItem("IS"+yea+"009");
           
           
           Wednesday.addItem("IS"+yea+"010");
           Wednesday.addItem("IS"+yea+"011");
           Wednesday.addItem("IS"+yea+"012");;
           //sub1

           Wednesday.addItem("IS"+yea+"013");
           Wednesday.addItem("IS"+yea+"014");
        }
        else if (cou.equals("Business Management")){
           Wednesday.addItem("BM"+yea+"008");
           
           Wednesday.addItem("BM"+yea+"009");
           
           
           Wednesday.addItem("BM"+yea+"010");
           Wednesday.addItem("BM"+yea+"011");
           Wednesday.addItem("BM"+yea+"012");;
           //sub1

           Wednesday.addItem("BM"+yea+"013");
           Wednesday.addItem("BM"+yea+"014");
        }
        else if (cou.equals("Business Analysis")){
           Wednesday.addItem("BA"+yea+"008");
           
           Wednesday.addItem("BA"+yea+"009");
           
           
           Wednesday.addItem("BA"+yea+"010");
           Wednesday.addItem("BA"+yea+"011");
           Wednesday.addItem("BA"+yea+"012");;
           //sub1

           Wednesday.addItem("BA"+yea+"013");
           Wednesday.addItem("BA"+yea+"014");
        }
        else if (cou.equals("Civil Engineering")){
           Wednesday.addItem("CE"+yea+"008");
           
           Wednesday.addItem("CE"+yea+"009");
           
           
           Wednesday.addItem("CE"+yea+"010");
           Wednesday.addItem("CE"+yea+"011");
           Wednesday.addItem("CE"+yea+"012");;
           //sub1

           Wednesday.addItem("CE"+yea+"013");
           Wednesday.addItem("CE"+yea+"014");
        }
        else if (cou.equals("Electronic Engineering")){
        Wednesday.addItem("EE"+yea+"008");
           
           Wednesday.addItem("EE"+yea+"009");
           
           
           Wednesday.addItem("EE"+yea+"010");
           Wednesday.addItem("EE"+yea+"011");
           Wednesday.addItem("EE"+yea+"012");;
           //sub1

           Wednesday.addItem("EE"+yea+"013");
           Wednesday.addItem("EE"+yea+"014");
        }
     }
    
    }
    
    public void SelectedSubThursday(){
        String cou=(String) course.getSelectedItem();
        Thursday.removeAllItems();
        Thursday.addItem("None");

        String yea="";
        if (year.getSelectedItem().equals("1st")){
            yea="1";
        }
        else if (year.getSelectedItem().equals("2nd")){
            yea="2";
        }
        else if (year.getSelectedItem().equals("3rd")){
            yea="3";
        }
     if(sem.getSelectedItem().equals("1st")){   
        if (cou.equals("Computer Science")){
           Thursday.addItem("CS"+yea+"001");
           Thursday.addItem("CS"+yea+"002");
      
           
           Thursday.addItem("CS"+yea+"003");
           Thursday.addItem("CS"+yea+"004");
           Thursday.addItem("CS"+yea+"005");;
           //sub1

           Thursday.addItem("CS"+yea+"006");
           Thursday.addItem("CS"+yea+"007");
           
           
        }
        else if (cou.equals("Information System")){
           Thursday.addItem("IS"+yea+"001");

           Thursday.addItem("IS"+yea+"002");
   
           
           Thursday.addItem("IS"+yea+"003");
           Thursday.addItem("IS"+yea+"004");
           Thursday.addItem("IS"+yea+"005");;
           //sub1

           Thursday.addItem("IS"+yea+"006");
           Thursday.addItem("IS"+yea+"007");
        }
        else if (cou.equals("Business Management")){
           Thursday.addItem("BM"+yea+"001");
          
           Thursday.addItem("BM"+yea+"002");
         
           
           Thursday.addItem("BM"+yea+"003");
           Thursday.addItem("BM"+yea+"004");
           Thursday.addItem("BM"+yea+"005");;
           //sub1

           Thursday.addItem("BM"+yea+"006");
           Thursday.addItem("BM"+yea+"007");
        }
        else if (cou.equals("Business Analysis")){
           Thursday.addItem("BA"+yea+"001");
           //
           Thursday.addItem("BA"+yea+"002");
           //
           
           Thursday.addItem("BA"+yea+"003");
           Thursday.addItem("BA"+yea+"004");
           Thursday.addItem("BA"+yea+"005");;
           //sub1

           Thursday.addItem("BA"+yea+"006");
           Thursday.addItem("BA"+yea+"007");
        }
        else if (cou.equals("Civil Engineering")){
           Thursday.addItem("CE"+yea+"001");
           //
           Thursday.addItem("CE"+yea+"002");
           
           
           Thursday.addItem("CE"+yea+"003");
           Thursday.addItem("CE"+yea+"004");
           Thursday.addItem("CE"+yea+"005");;
           //sub1

           Thursday.addItem("CE"+yea+"006");
           Thursday.addItem("CE"+yea+"007");
        }
        else if (cou.equals("Electronic Engineering")){
        Thursday.addItem("EE"+yea+"001");
           
           Thursday.addItem("EE"+yea+"002");
           
           
           Thursday.addItem("EE"+yea+"003");
           Thursday.addItem("EE"+yea+"004");
           Thursday.addItem("EE"+yea+"005");;
           //sub1

           Thursday.addItem("EE"+yea+"006");
           Thursday.addItem("EE"+yea+"007");
        }
     } 
     
     else if(sem.getSelectedItem().equals("2nd")){   
        if (cou.equals("Computer Science")){
           Thursday.addItem("CS"+yea+"008");
           
           Thursday.addItem("CS"+yea+"009");
           
           
           Thursday.addItem("CS"+yea+"010");
           Thursday.addItem("CS"+yea+"011");
           Thursday.addItem("CS"+yea+"012");;
           //sub1

           Thursday.addItem("CS"+yea+"013");
           Thursday.addItem("CS"+yea+"014");
           
           
        }
        else if (cou.equals("Information System")){
           Thursday.addItem("IS"+yea+"008");
           
           Thursday.addItem("IS"+yea+"009");
           
           
           Thursday.addItem("IS"+yea+"010");
           Thursday.addItem("IS"+yea+"011");
           Thursday.addItem("IS"+yea+"012");;
           //sub1

           Thursday.addItem("IS"+yea+"013");
           Thursday.addItem("IS"+yea+"014");
        }
        else if (cou.equals("Business Management")){
           Thursday.addItem("BM"+yea+"008");
           
           Thursday.addItem("BM"+yea+"009");
           
           
           Thursday.addItem("BM"+yea+"010");
           Thursday.addItem("BM"+yea+"011");
           Thursday.addItem("BM"+yea+"012");;
           //sub1

           Thursday.addItem("BM"+yea+"013");
           Thursday.addItem("BM"+yea+"014");
        }
        else if (cou.equals("Business Analysis")){
           Thursday.addItem("BA"+yea+"008");
           
           Thursday.addItem("BA"+yea+"009");
           
           
           Thursday.addItem("BA"+yea+"010");
           Thursday.addItem("BA"+yea+"011");
           Thursday.addItem("BA"+yea+"012");;
           //sub1

           Thursday.addItem("BA"+yea+"013");
           Thursday.addItem("BA"+yea+"014");
        }
        else if (cou.equals("Civil Engineering")){
           Thursday.addItem("CE"+yea+"008");
           
           Thursday.addItem("CE"+yea+"009");
           
           
           Thursday.addItem("CE"+yea+"010");
           Thursday.addItem("CE"+yea+"011");
           Thursday.addItem("CE"+yea+"012");;
           //sub1

           Thursday.addItem("CE"+yea+"013");
           Thursday.addItem("CE"+yea+"014");
        }
        else if (cou.equals("Electronic Engineering")){
        Thursday.addItem("EE"+yea+"008");
           
           Thursday.addItem("EE"+yea+"009");
           
           
           Thursday.addItem("EE"+yea+"010");
           Thursday.addItem("EE"+yea+"011");
           Thursday.addItem("EE"+yea+"012");;
           //sub1

           Thursday.addItem("EE"+yea+"013");
           Thursday.addItem("EE"+yea+"014");
        }
     }
    
    }
    
    public void SelectedSubFriday(){
        String cou=(String) course.getSelectedItem();
        Friday.removeAllItems();
        Friday.addItem("None");

        String yea="";
        if (year.getSelectedItem().equals("1st")){
            yea="1";
        }
        else if (year.getSelectedItem().equals("2nd")){
            yea="2";
        }
        else if (year.getSelectedItem().equals("3rd")){
            yea="3";
        }
     if(sem.getSelectedItem().equals("1st")){   
        if (cou.equals("Computer Science")){
           Friday.addItem("CS"+yea+"001");
           Friday.addItem("CS"+yea+"002");
      
           
           Friday.addItem("CS"+yea+"003");
           Friday.addItem("CS"+yea+"004");
           Friday.addItem("CS"+yea+"005");;
           //sub1

           Friday.addItem("CS"+yea+"006");
           Friday.addItem("CS"+yea+"007");
           
           
        }
        else if (cou.equals("Information System")){
           Friday.addItem("IS"+yea+"001");

           Friday.addItem("IS"+yea+"002");
   
           
           Friday.addItem("IS"+yea+"003");
           Friday.addItem("IS"+yea+"004");
           Friday.addItem("IS"+yea+"005");;
           //sub1

           Friday.addItem("IS"+yea+"006");
           Friday.addItem("IS"+yea+"007");
        }
        else if (cou.equals("Business Management")){
           Friday.addItem("BM"+yea+"001");
          
           Friday.addItem("BM"+yea+"002");
         
           
           Friday.addItem("BM"+yea+"003");
           Friday.addItem("BM"+yea+"004");
           Friday.addItem("BM"+yea+"005");;
           //sub1

           Friday.addItem("BM"+yea+"006");
           Friday.addItem("BM"+yea+"007");
        }
        else if (cou.equals("Business Analysis")){
           Friday.addItem("BA"+yea+"001");
           //
           Friday.addItem("BA"+yea+"002");
           //
           
           Friday.addItem("BA"+yea+"003");
           Friday.addItem("BA"+yea+"004");
           Friday.addItem("BA"+yea+"005");;
           //sub1

           Friday.addItem("BA"+yea+"006");
           Friday.addItem("BA"+yea+"007");
        }
        else if (cou.equals("Civil Engineering")){
           Friday.addItem("CE"+yea+"001");
           //
           Friday.addItem("CE"+yea+"002");
           
           
           Friday.addItem("CE"+yea+"003");
           Friday.addItem("CE"+yea+"004");
           Friday.addItem("CE"+yea+"005");;
           //sub1

           Friday.addItem("CE"+yea+"006");
           Friday.addItem("CE"+yea+"007");
        }
        else if (cou.equals("Electronic Engineering")){
        Friday.addItem("EE"+yea+"001");
           
           Friday.addItem("EE"+yea+"002");
           
           
           Friday.addItem("EE"+yea+"003");
           Friday.addItem("EE"+yea+"004");
           Friday.addItem("EE"+yea+"005");;
           //sub1

           Friday.addItem("EE"+yea+"006");
           Friday.addItem("EE"+yea+"007");
        }
     } 
     
     else if(sem.getSelectedItem().equals("2nd")){   
        if (cou.equals("Computer Science")){
           Friday.addItem("CS"+yea+"008");
           
           Friday.addItem("CS"+yea+"009");
           
           
           Friday.addItem("CS"+yea+"010");
           Friday.addItem("CS"+yea+"011");
           Friday.addItem("CS"+yea+"012");;
           //sub1

           Friday.addItem("CS"+yea+"013");
           Friday.addItem("CS"+yea+"014");
           
           
        }
        else if (cou.equals("Information System")){
           Friday.addItem("IS"+yea+"008");
           
           Friday.addItem("IS"+yea+"009");
           
           
           Friday.addItem("IS"+yea+"010");
           Friday.addItem("IS"+yea+"011");
           Friday.addItem("IS"+yea+"012");;
           //sub1

           Friday.addItem("IS"+yea+"013");
           Friday.addItem("IS"+yea+"014");
        }
        else if (cou.equals("Business Management")){
           Friday.addItem("BM"+yea+"008");
           
           Friday.addItem("BM"+yea+"009");
           
           
           Friday.addItem("BM"+yea+"010");
           Friday.addItem("BM"+yea+"011");
           Friday.addItem("BM"+yea+"012");;
           //sub1

           Friday.addItem("BM"+yea+"013");
           Friday.addItem("BM"+yea+"014");
        }
        else if (cou.equals("Business Analysis")){
           Friday.addItem("BA"+yea+"008");
           
           Friday.addItem("BA"+yea+"009");
           
           
           Friday.addItem("BA"+yea+"010");
           Friday.addItem("BA"+yea+"011");
           Friday.addItem("BA"+yea+"012");;
           //sub1

           Friday.addItem("BA"+yea+"013");
           Friday.addItem("BA"+yea+"014");
        }
        else if (cou.equals("Civil Engineering")){
           Friday.addItem("CE"+yea+"008");
           
           Friday.addItem("CE"+yea+"009");
           
           
           Friday.addItem("CE"+yea+"010");
           Friday.addItem("CE"+yea+"011");
           Friday.addItem("CE"+yea+"012");;
           //sub1

           Friday.addItem("CE"+yea+"013");
           Friday.addItem("CE"+yea+"014");
        }
        else if (cou.equals("Electronic Engineering")){
        Friday.addItem("EE"+yea+"008");
           
           Friday.addItem("EE"+yea+"009");
           
           
           Friday.addItem("EE"+yea+"010");
           Friday.addItem("EE"+yea+"011");
           Friday.addItem("EE"+yea+"012");;
           //sub1

           Friday.addItem("EE"+yea+"013");
           Friday.addItem("EE"+yea+"014");
        }
     }
    
    }
    
    
    
    
    
    
    public void viewSub(){
        subject.setText("");
        String cou=(String) course.getSelectedItem();
if(sem.getSelectedItem().equals("1st")){
    if(year.getSelectedItem().equals("1st")){    
        if (cou.equals("Computer Science")){
            subject.setText("\tSubjects\n\n"
                    + " CS1001 - Data Structures & Algorithm"
                    + "\n CS1002 - Programming"
                    + "\n CS1003 - Database"
                    + "\n CS1004 - Networking"
                    + "\n CS1005 - Labouratory"
                    + "\n CS1006 - Computer System"
                    + "\n CS1007 - Software Engineering");
        }
        else if (cou.equals("Information System")){
            subject.setText("\tSubjects\n\n"
                    + " IS1001 - Programming"
                    + "\n IS1002 - System Analysis"
                    + "\n IS1003 - Database"
                    + "\n IS1004 - Business Studies"
                    + "\n IS1005 - Labouratory"
                    + "\n IS1006 - Computer System"
                    + "\n IS1007 - Software Engineering");
        }
        
        else if (cou.equals("Business Management")){
        subject.setText("\tSubjects\n\n" +
                    " BM1001 - Business Studies\n" +
                    " BM1002 - System Analysis\n" +
                    " BM1003 - Computer System\n" +
                    " BM1004 - Programming Concept\n" +
                    " BM1005 - Presentation Studies\n" +
                    " BM1006 - Networking\n" +
                    " BM1007 - Web Analysing");
        }
        else if (cou.equals("Business Analysis")){
        subject.setText("\tSubjects\n\n" +
                    " BA1001 - Business Concepts\n" +
                    " BA1002 - System Analysis\n" +
                    " BA1003 - Computer System\n" +
                    " BA1004 - Programming Concept\n" +
                    " BA1005 - Presentation Studies\n" +
                    " BA1006 - Problem Solving\n" +
                    " BA1007 - Web Analysing");
        }
        else if (cou.equals("Civil Engineering")){
        subject.setText("\tSubjects\n\n" +
                    " CE1001 - Statistics\n" +
                    " CE1002 - Matrix\n" +
                    " CE1003 - Computer Science\n" +
                    " CE1004 - Physics\n" +
                    " CE1005 - Mathematical Equations\n" +
                    " CE1006 - Relative Maths\n" +
                    " CE1007 - Calculus");
        }
        else if (cou.equals("Electronic Engineering")){
        subject.setText("\tSubjects\n\n" +
                    " EE1001 - Statistics\n" +
                    " EE1002 - Matrix\n" +
                    " EE1003 - Computer Science\n" +
                    " EE1004 - Arduino\n" +
                    " EE1005 - Programming\n" +
                    " EE1006 - Networking\n" +
                    " EE1007 - Robotics");
        }
    }
    
    else if(year.getSelectedItem().equals("2nd")){    
        if (cou.equals("Computer Science")){
            subject.setText("\tSubjects\n\n"
                    + " CS2001 - Data Structures & Algorithm II"
                    + "\n CS2002 - Programming II"
                    + "\n CS2003 - FCS I"
                    + "\n CS2004 - Networking II"
                    + "\n CS2005 - Enhancement I"
                    + "\n CS2006 - Computer System II"
                    + "\n CS2007 - Software Engineering II");
        }
        else if (cou.equals("Information System")){
            subject.setText("\tSubjects\n\n"
                    + " IS2001 - Business Studies II"
                    + "\n IS2002 - System Analysis II"
                    + "\n IS2003 - Database II"
                    + "\n IS2004 - Enhancement I"
                    + "\n IS2005 - Presentation Studies"
                    + "\n IS2006 - Computer System II"
                    + "\n IS2007 - Software Engineering II");
        }
        
        else if (cou.equals("Business Management")){
        subject.setText("\tSubjects\n\n" +
                    " BM2001 - Business Studies II\n" +
                    " BM2002 - System Analysis II\n" +
                    " BM2003 - Charted Acounting\n" +
                    " BM2004 - Economics\n" +
                    " BM2005 - Mathematical methods\n" +
                    " BM2006 - Statics\n" +
                    " BM2007 - Web Analysing II");
        }
        else if (cou.equals("Business Analysis")){
        subject.setText("\tSubjects\n\n" +
                    " BA2001 - Business Concepts II\n" +
                    " BA2002 - System Analysis II\n" +
                    " BA2003 - Computer System II\n" +
                    " BA2004 - Programming II\n" +
                    " BA2005 - Statics\n" +
                    " BA2006 - Mathematical Methods\n" +
                    " BA2007 - Web Analysing II");
        }
        else if (cou.equals("Civil Engineering")){
        subject.setText("\tSubjects\n\n" +
                    " CE2001 - Relative Velocity\n" +
                    " CE2002 - Robotics\n" +
                    " CE2003 - Computer Science II\n" +
                    " CE2004 - Chemical\n" +
                    " CE2005 - Mathematical Equations II\n" +
                    " CE2006 - Matrix II\n" +
                    " CE2007 - Calculus II");
        }
        else if (cou.equals("Electronic Engineering")){
        subject.setText("\tSubjects\n\n" +
                    " EE2001 - Statistics II\n" +
                    " EE2002 - Matrix II\n" +
                    " EE2003 - Computer Science II\n" +
                    " EE2004 - Arduino Circuits\n" +
                    " EE2005 - Programming\n" +
                    " EE2006 - Networking II\n" +
                    " EE2007 - Robotics II");
        }
    }
    else if(year.getSelectedItem().equals("3rd")){    
        if (cou.equals("Computer Science")){
            subject.setText("\tSubjects\n\n"
                    + " CS3001 - Data Structures & Algorithm III"
                    + "\n CS3002 - Programming III"
                    + "\n CS3003 - FCS II"
                    + "\n CS3004 - Networking III"
                    + "\n CS3005 - Enhancement II"
                    + "\n CS3006 - Game Development"
                    + "\n CS3007 - Software Engineering III");
        }
        else if (cou.equals("Information System")){
            subject.setText("\tSubjects\n\n"
                    + " IS3001 - Business Studies III"
                    + "\n IS3002 - System Analysis III"
                    + "\n IS3003 - Database III"
                    + "\n IS3004 - Enhancement II"
                    + "\n IS3005 - SAD"
                    + "\n IS3006 - Computer System III"
                    + "\n IS3007 - Software Engineering III");
        }
        
        else if (cou.equals("Business Management")){
        subject.setText("\tSubjects\n\n" +
                    " BM3001 - Business Studies III\n" +
                    " BM3002 - System Analysis III\n" +
                    " BM3003 - Charted Acounting II\n" +
                    " BM3004 - Economics II\n" +
                    " BM3005 - Mathematical methods II\n" +
                    " BM3006 - Statics II\n" +
                    " BM3007 - Web Analysing III");
        }
        else if (cou.equals("Business Analysis")){
        subject.setText("\tSubjects\n\n" +
                    " BA3001 - Business Concepts III\n" +
                    " BA3002 - System Analysis III\n" +
                    " BA3003 - Computer System III\n" +
                    " BA3004 - Programming III\n" +
                    " BA3005 - Statics II\n" +
                    " BA3006 - Mathematical Methods II\n" +
                    " BA3007 - Web Analysing III");
        }
        else if (cou.equals("Civil Engineering")){
        subject.setText("\tSubjects\n\n" +
                    " CE3001 - Relative Velocity II\n" +
                    " CE3002 - Robotics II\n" +
                    " CE3003 - Computer Science III\n" +
                    " CE3004 - Chemical II\n" +
                    " CE3005 - Mathematical Equations III\n" +
                    " CE3006 - Matrix III\n" +
                    " CE3007 - Differentation");
        }
        else if (cou.equals("Electronic Engineering")){
        subject.setText("\tSubjects\n\n" +
                    " EE3001 - Statistics III\n" +
                    " EE3002 - Matrix III\n" +
                    " EE3003 - Computer Science III\n" +
                    " EE3004 - Arduino Circuits II\n" +
                    " EE3005 - Programming II\n" +
                    " EE3006 - Electrone\n" +
                    " EE3007 - Differentation");
        }
    }
}    
else if(sem.getSelectedItem().equals("2nd")){
    if(year.getSelectedItem().equals("1st")){    
        if (cou.equals("Computer Science")){
            subject.setText("\tSubjects\n\n"
                    + " CS1008 - Data Structures & Algorithm II"
                    + "\n CS1009 - Programming II"
                    + "\n CS1010 - Database II"
                    + "\n CS1011 - Networking II"
                    + "\n CS1012 - Labouratory II"
                    + "\n CS1013 - Computer System II"
                    + "\n CS1001 - Software Engineering II");
        }
        else if (cou.equals("Information System")){
            subject.setText("\tSubjects\n\n"
                    + " IS1008 - Programming II"
                    + "\n IS1009 - System Analysis II"
                    + "\n IS1010 - Database II"
                    + "\n IS1011 - Business Studies II"
                    + "\n IS1012 - Labouratory II"
                    + "\n IS1013 - Computer System II"
                    + "\n IS1014 - Software Engineering II");
        }
        
        else if (cou.equals("Business Management")){
        subject.setText("\tSubjects\n\n" +
                    " BM1008 - Business Studies II\n" +
                    " BM1009 - System Analysis II\n" +
                    " BM1010 - Computer System II\n" +
                    " BM1011 - Programming Concept II\n" +
                    " BM1012 - Presentation Studies II\n" +
                    " BM1013 - Networking II\n" +
                    " BM1014 - Web Analysing II");
        }
        else if (cou.equals("Business Analysis")){
        subject.setText("\tSubjects\n\n" +
                    " BA1008 - Business Concepts II\n" +
                    " BA1009 - System Analysis II\n" +
                    " BA1010 - Computer System II\n" +
                    " BA1011 - Programming Concept II\n" +
                    " BA1012 - Presentation Studies II\n" +
                    " BA1013 - Problem Solving II\n" +
                    " BA1014 - Web Analysing II");
        }
        else if (cou.equals("Civil Engineering")){
        subject.setText("\tSubjects\n\n" +
                    " CE1008 - Statistics II\n" +
                    " CE1009 - Matrix II\n" +
                    " CE1010 - Computer Science II\n" +
                    " CE1011 - Physics II\n" +
                    " CE1012 - Mathematical Equations II\n" +
                    " CE1013 - Relative Maths II\n" +
                    " CE1014 - Calculus II");
        }
        else if (cou.equals("Electronic Engineering")){
        subject.setText("\tSubjects\n\n" +
                    " EE1009 - Statistics II\n" +
                    " EE1010 - Matrix II\n" +
                    " EE1011 - Computer Science II\n" +
                    " EE1012 - Arduino II\n" +
                    " EE1013 - Programming II\n" +
                    " EE1014 - Networking II\n" +
                    " EE1015 - Robotics II");
        }
    }
    
    else if(year.getSelectedItem().equals("2nd")){    
        if (cou.equals("Computer Science")){
            subject.setText("\tSubjects\n\n"
                    + " CS2008 - Data Structures & Algorithm III"
                    + "\n CS2009 - Programming III"
                    + "\n CS2010 - FCS II"
                    + "\n CS2011 - Networking III"
                    + "\n CS2012 - Enhancement II"
                    + "\n CS2013 - Computer System III"
                    + "\n CS2014 - Software Engineering III");
        }
        else if (cou.equals("Information System")){
            subject.setText("\tSubjects\n\n"
                    + " IS2001 - Business Studies III"
                    + "\n IS2009 - System Analysis III"
                    + "\n IS2010 - Database III"
                    + "\n IS2011 - Enhancement II"
                    + "\n IS2012 - Presentation Studies"
                    + "\n IS2013 - Computer System III"
                    + "\n IS2014 - Software Engineering III");
        }
        
        else if (cou.equals("Business Management")){
        subject.setText("\tSubjects\n\n" +
                    " BM2008 - Business Studies III\n" +
                    " BM2009 - System Analysis III\n" +
                    " BM2010 - Charted Acounting II\n" +
                    " BM2011 - Economics II\n" +
                    " BM2012 - Mathematical methods II\n" +
                    " BM2013 - Statics II\n" +
                    " BM2014 - Web Analysing III");
        }
        else if (cou.equals("Business Analysis")){
        subject.setText("\tSubjects\n\n" +
                    " BA2008 - Business Concepts III\n" +
                    " BA2009 - System Analysis III\n" +
                    " BA2010 - Computer System III\n" +
                    " BA2011 - Programming III\n" +
                    " BA2012 - Statics II\n" +
                    " BA2013 - Mathematical Methods II\n" +
                    " BA2014 - Web Analysing III");
        }
        else if (cou.equals("Civil Engineering")){
        subject.setText("\tSubjects\n\n" +
                    " CE2008 - Relative Velocity II\n" +
                    " CE2009 - Robotics II\n" +
                    " CE2010 - Computer Science III\n" +
                    " CE2011 - Chemical II\n" +
                    " CE2012 - Mathematical Equations III\n" +
                    " CE2013 - Matrix III\n" +
                    " CE2014 - Calculus III");
        }
        else if (cou.equals("Electronic Engineering")){
        subject.setText("\tSubjects\n\n" +
                    " EE2009 - Statistics III\n" +
                    " EE2010 - Matrix III\n" +
                    " EE2011 - Computer Science III\n" +
                    " EE2012 - Arduino Circuits II\n" +
                    " EE2013 - Programming II\n" +
                    " EE2014 - Networking III\n" +
                    " EE2015 - Robotics III");
        }
    }
    else if(year.getSelectedItem().equals("3rd")){    
        if (cou.equals("Computer Science")){
            subject.setText("\tSubjects\n\n"
                    + " CS3008 - Data Structures & Algorithm IV"
                    + "\n CS3009 - Programming IV"
                    + "\n CS3010 - FCS III"
                    + "\n CS3011 - Networking IV"
                    + "\n CS3012 - Enhancement III"
                    + "\n CS3013 - Game Development II"
                    + "\n CS3014 - Software Engineering IV");
        }
        else if (cou.equals("Information System")){
            subject.setText("\tSubjects\n\n"
                    + " IS3008 - Business Studies IV"
                    + "\n IS3009 - System Analysis IV"
                    + "\n IS3010 - Database IV"
                    + "\n IS3011 - Enhancement III"
                    + "\n IS3012 - SAD II"
                    + "\n IS3013 - Computer System IV"
                    + "\n IS3014 - Software Engineering IV");
        }
        
        else if (cou.equals("Business Management")){
        subject.setText("\tSubjects\n\n" +
                    " BM3008 - Business Studies IV\n" +
                    " BM3009 - System Analysis IV\n" +
                    " BM3010 - Charted Acounting III\n" +
                    " BM3011 - Economics III\n" +
                    " BM3012 - Mathematical methods III\n" +
                    " BM3013 - Statics III\n" +
                    " BM3014 - Web Analysing IV");
        }
        else if (cou.equals("Business Analysis")){
        subject.setText("\tSubjects\n\n" +
                    " BA3008 - Business Concepts IV\n" +
                    " BA3009 - System Analysis IV\n" +
                    " BA3010 - Computer System IV\n" +
                    " BA3011 - Programming IV\n" +
                    " BA3012 - Statics III\n" +
                    " BA3013 - Mathematical Methods III\n" +
                    " BA3014 - Web Analysing IV");
        }
        else if (cou.equals("Civil Engineering")){
        subject.setText("\tSubjects\n\n" +
                    " CE3008 - Relative Velocity III\n" +
                    " CE3009 - Robotics III\n" +
                    " CE3010 - Computer Science IV\n" +
                    " CE3011 - Chemical III\n" +
                    " CE3012 - Mathematical Equations IV\n" +
                    " CE3013 - Matrix IV\n" +
                    " CE3014 - Differentation");
        }
        else if (cou.equals("Electronic Engineering")){
        subject.setText("\tSubjects\n\n" +
                    " EE3008 - Statistics IV\n" +
                    " EE3009 - Matrix IV\n" +
                    " EE3010 - Computer Science IV\n" +
                    " EE3011 - Arduino Circuits III\n" +
                    " EE3012 - Programming III\n" +
                    " EE3013 - Electrone II\n" +
                    " EE3014 - Differentation II");
        }
    }
}      

    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        subject = new javax.swing.JTextArea();
        yea1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        adds = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        Monday = new javax.swing.JComboBox<>();
        sem = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        yea = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        course = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        faculty = new javax.swing.JComboBox<>();
        addField = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        Time = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        h1 = new javax.swing.JComboBox<>();
        h2 = new javax.swing.JComboBox<>();
        Tuesday = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        h3 = new javax.swing.JComboBox<>();
        h4 = new javax.swing.JComboBox<>();
        Wednesday = new javax.swing.JComboBox<>();
        Thursday = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        h5 = new javax.swing.JComboBox<>();
        Friday = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        subject.setEditable(false);
        subject.setBackground(new java.awt.Color(255, 255, 210));
        subject.setColumns(20);
        subject.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        subject.setRows(5);
        subject.setBorder(null);
        jScrollPane3.setViewportView(subject);

        yea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yea1.setForeground(new java.awt.Color(102, 102, 102));
        yea1.setText("Semester :");

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD Subject to Time Table");

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("< BACK");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        adds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm_course_enrollment_system/Images/add marks.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(adds, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adds, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        year.setBackground(new java.awt.Color(153, 153, 255));
        year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd" }));
        year.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yearMouseEntered(evt);
            }
        });
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        Monday.setBackground(new java.awt.Color(153, 153, 255));
        Monday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Monday.setForeground(new java.awt.Color(255, 255, 255));
        Monday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MondayFocusGained(evt);
            }
        });

        sem.setBackground(new java.awt.Color(153, 153, 255));
        sem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sem.setForeground(new java.awt.Color(255, 255, 255));
        sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd" }));
        sem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                semMouseEntered(evt);
            }
        });
        sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(44, 62, 80));
        jLabel12.setText("Monday :");

        yea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yea.setForeground(new java.awt.Color(102, 102, 102));
        yea.setText("Year :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Course :");

        course.setBackground(new java.awt.Color(153, 153, 255));
        course.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        course.setForeground(new java.awt.Color(255, 255, 255));
        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business Management", "Business Analysis" }));
        course.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseMouseClicked(evt);
            }
        });
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 210));
        jPanel3.setToolTipText("");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm_course_enrollment_system/Images/nsbmla.png"))); // NOI18N

        jLabel20.setText("© 2018 Hasitha Amarathunga");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        faculty.setBackground(new java.awt.Color(153, 153, 255));
        faculty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        faculty.setForeground(new java.awt.Color(255, 255, 255));
        faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School Of Business", "School Of Computing", "School Of Engineering" }));
        faculty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facultyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facultyMouseEntered(evt);
            }
        });
        faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyActionPerformed(evt);
            }
        });

        addField.setBackground(new java.awt.Color(44, 62, 80));
        addField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addField.setForeground(new java.awt.Color(255, 255, 255));
        addField.setText("Add");
        addField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Faculty :");

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        exit.setBackground(new java.awt.Color(255, 51, 51));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        Time.setBackground(new java.awt.Color(153, 153, 255));
        Time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Time.setForeground(new java.awt.Color(255, 255, 255));
        Time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8-10", "10-12", "1-3", "3-5" }));
        Time.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimeMouseClicked(evt);
            }
        });
        Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Time :");

        h1.setBackground(new java.awt.Color(153, 153, 255));
        h1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        h1.setForeground(new java.awt.Color(255, 255, 255));
        h1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "w001", "w002", "A01", "MiniAudi", "DD5", "F4", "LAB A", "LAB B", "LAB C" }));
        h1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h1MouseClicked(evt);
            }
        });
        h1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h1ActionPerformed(evt);
            }
        });

        h2.setBackground(new java.awt.Color(153, 153, 255));
        h2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        h2.setForeground(new java.awt.Color(255, 255, 255));
        h2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "w001", "w002", "A01", "MiniAudi", "DD5", "F4", "LAB A", "LAB B", "LAB C" }));
        h2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h2MouseClicked(evt);
            }
        });
        h2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h2ActionPerformed(evt);
            }
        });

        Tuesday.setBackground(new java.awt.Color(153, 153, 255));
        Tuesday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tuesday.setForeground(new java.awt.Color(255, 255, 255));
        Tuesday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TuesdayFocusGained(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(44, 62, 80));
        jLabel17.setText("Tuesday :");

        h3.setBackground(new java.awt.Color(153, 153, 255));
        h3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        h3.setForeground(new java.awt.Color(255, 255, 255));
        h3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "w001", "w002", "A01", "MiniAudi", "DD5", "F4", "LAB A", "LAB B", "LAB C" }));
        h3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h3MouseClicked(evt);
            }
        });
        h3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h3ActionPerformed(evt);
            }
        });

        h4.setBackground(new java.awt.Color(153, 153, 255));
        h4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        h4.setForeground(new java.awt.Color(255, 255, 255));
        h4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "w001", "w002", "A01", "MiniAudi", "DD5", "F4", "LAB A", "LAB B", "LAB C" }));
        h4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h4MouseClicked(evt);
            }
        });
        h4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h4ActionPerformed(evt);
            }
        });

        Wednesday.setBackground(new java.awt.Color(153, 153, 255));
        Wednesday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Wednesday.setForeground(new java.awt.Color(255, 255, 255));
        Wednesday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                WednesdayFocusGained(evt);
            }
        });

        Thursday.setBackground(new java.awt.Color(153, 153, 255));
        Thursday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Thursday.setForeground(new java.awt.Color(255, 255, 255));
        Thursday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ThursdayFocusGained(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(44, 62, 80));
        jLabel18.setText("Thursday :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(44, 62, 80));
        jLabel13.setText("WednesDay :");

        h5.setBackground(new java.awt.Color(153, 153, 255));
        h5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        h5.setForeground(new java.awt.Color(255, 255, 255));
        h5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "w001", "w002", "A01", "MiniAudi", "DD5", "F4", "LAB A", "LAB B", "LAB C" }));
        h5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h5MouseClicked(evt);
            }
        });
        h5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h5ActionPerformed(evt);
            }
        });

        Friday.setBackground(new java.awt.Color(153, 153, 255));
        Friday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Friday.setForeground(new java.awt.Color(255, 255, 255));
        Friday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FridayFocusGained(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(44, 62, 80));
        jLabel19.setText("Friday :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(yea))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addComponent(yea1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel12)
                            .addComponent(jLabel17))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Monday, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Tuesday, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Wednesday, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(h3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Thursday, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(h4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(39, 39, 39)
                        .addComponent(Friday, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(h5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(addField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(yea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)
                                                .addComponent(yea1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Monday, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Tuesday, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Wednesday, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(h3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Thursday, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(h4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Friday, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(h5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        new TimeTable().show();
        this.setVisible(false);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        setColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        resetColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseExited

    private void yearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_yearMouseClicked

    private void yearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_yearMouseEntered

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void semMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_semMouseClicked

    private void semMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_semMouseEntered

    private void semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semActionPerformed

    private void courseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_courseMouseClicked

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
        try{
            viewSub();
        }catch(Exception e){

        }
    }//GEN-LAST:event_courseActionPerformed

    private void facultyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultyMouseClicked
        // TODO add your handling code here:

        try{
            getFac();
        }catch(Exception e){

        }
    }//GEN-LAST:event_facultyMouseClicked

    private void facultyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyMouseEntered

    private void facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyActionPerformed
        // TODO add your handling code here:
        String fac=(String) faculty.getSelectedItem();
        course.removeAllItems();
        if(fac.equals("School Of Computing")){
            course.addItem("Computer Science");
            course.addItem("Information System");
        }
        else if(fac.equals("School Of Business")){
            course.addItem("Business Management");
            course.addItem("Business Analysis");
        }
        else{
            course.addItem("Civil Engineering");
            course.addItem("Electronic Engineering");
        }
    }//GEN-LAST:event_facultyActionPerformed

    private void addFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFieldActionPerformed
        
        String cou=(String) course.getSelectedItem();
        String yea=(String) year.getSelectedItem();
        String sems=(String) sem.getSelectedItem();
        String time=(String) Time.getSelectedItem();
        String monday=(String) Monday.getSelectedItem();
        String tuesday=(String) Tuesday.getSelectedItem();
        String wednesday=(String) Wednesday.getSelectedItem();
        String thursday=(String) Thursday.getSelectedItem();
        String friday=(String) Friday.getSelectedItem();
        String det1=monday+" ("+h1.getSelectedItem()+" Hall)";
        String det2=tuesday+" ("+h2.getSelectedItem()+" Hall)";
        String det3=wednesday+" ("+h3.getSelectedItem()+" Hall)";
        String det4=thursday+" ("+h4.getSelectedItem()+" Hall)";
        String det5=friday+" ("+h5.getSelectedItem()+" Hall)";
        //System.out.println(hall);
        System.out.println(monday+tuesday+wednesday+thursday+friday);
        if(!monday.equals("") || !tuesday.equals("") || !wednesday.equals("") || !thursday.equals("") || !friday.equals(""))
        {
            Connection con=getConnection();
            PreparedStatement ps=null;
            
            try {
                
              
                ps = con.prepareStatement("INSERT INTO timetableug "
                            + " VALUES(?,?,?,?,?,?,?,?,?)" );
                
                ps.setString(1,cou);
                ps.setString(2,yea);
                ps.setString(3,sems);
                ps.setString(4,time);
                ps.setString(5,det1);
                ps.setString(6,det2);
                ps.setString(7,det3);
                ps.setString(8,det4);
                ps.setString(9,det5);
 
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,cou+" "+yea+" Year "+sems+" sem Time Table Update Succesfull." );
                new TimeTable().show();
                this.setVisible(false);
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Sorry..This is Already Added.");
                //System.out.println(e);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Please Select the Subject!");
        }
        
        
        
        
        
        
    }//GEN-LAST:event_addFieldActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void TimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeMouseClicked

    private void TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeActionPerformed

    private void h1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_h1MouseClicked

    private void h1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h1ActionPerformed

    private void h2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_h2MouseClicked

    private void h2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h2ActionPerformed

    private void h3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_h3MouseClicked

    private void h3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h3ActionPerformed

    private void h4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_h4MouseClicked

    private void h4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h4ActionPerformed

    private void h5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_h5MouseClicked

    private void h5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h5ActionPerformed

    private void TuesdayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TuesdayFocusGained
        // TODO add your handling code here:
        SelectedSubTuesday();
    }//GEN-LAST:event_TuesdayFocusGained

    private void MondayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MondayFocusGained
        // TODO add your handling code here:
         SelectedSubMonday();
    }//GEN-LAST:event_MondayFocusGained

    private void WednesdayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WednesdayFocusGained
        // TODO add your handling code here:
        SelectedSubWednesday();
    }//GEN-LAST:event_WednesdayFocusGained

    private void ThursdayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ThursdayFocusGained
        // TODO add your handling code here:
        SelectedSubThursday();
    }//GEN-LAST:event_ThursdayFocusGained

    private void FridayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FridayFocusGained
        // TODO add your handling code here:
        SelectedSubFriday();
    }//GEN-LAST:event_FridayFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTimeTable().setVisible(true);
            }
        });
    }
     public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(44,100,98));
        
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(44,62,80));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Friday;
    private javax.swing.JComboBox<String> Monday;
    private javax.swing.JComboBox<String> Thursday;
    private javax.swing.JComboBox<String> Time;
    private javax.swing.JComboBox<String> Tuesday;
    private javax.swing.JComboBox<String> Wednesday;
    private javax.swing.JButton addField;
    private javax.swing.JLabel adds;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> faculty;
    private javax.swing.JComboBox<String> h1;
    private javax.swing.JComboBox<String> h2;
    private javax.swing.JComboBox<String> h3;
    private javax.swing.JComboBox<String> h4;
    private javax.swing.JComboBox<String> h5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> sem;
    private javax.swing.JTextArea subject;
    private javax.swing.JLabel yea;
    private javax.swing.JLabel yea1;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
