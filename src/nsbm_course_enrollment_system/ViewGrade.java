/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm_course_enrollment_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ClashHacker
 */
public class ViewGrade extends javax.swing.JFrame {

    /**
     * Creates new form ViewCSGrade
     */
    public ViewGrade() {
        initComponents();
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
    
    
    public void getStuId()
    {
        String ac="";
        if(year.getSelectedItem().equals("1st")){
            ac="2018";
        }
        if(year.getSelectedItem().equals("2nd")){
            ac="2017";
        }
        if(year.getSelectedItem().equals("3rd")){
            ac="2016";
        }
         String cou=(String) course.getSelectedItem();
        if(cou.equals("Computer Science")){
            stu_id.setText(ac+"/CS/");
        }
        else if(cou.equals("Information System")){
            stu_id.setText(ac+"/IS/");
        }
        else if(cou.equals("Business Management")){
            stu_id.setText(ac+"/BM/");
        }
        else if(cou.equals("Business Analysis")){
            stu_id.setText(ac+"/BA/");
        }
        else if(cou.equals("Civil Engineering")){
            stu_id.setText(ac+"/CE/");
        }
        else if(cou.equals("Electronic Engineering")){
            stu_id.setText(ac+"/EE/");
        }   
        
    }
    
    public void loadSub(){
        String stuId=stu_id.getText();
        Connection con=getConnection();
        PreparedStatement ps=null;
        ResultSet res=null;
        sub.removeAllItems();
        String yea=(String) year.getSelectedItem();
        String seme=(String) sem.getSelectedItem();
        if(!stuId.equals("")){
            
            try {
                
                ps = con.prepareStatement("Select Sub1,Sub2,Sub3,Sub4 from subjectssem1 WHERE Stu_id='"+stuId+"' AND Year='"+
                        yea+"' AND sem='"+seme+"'");
                res=ps.executeQuery();
             
                while(res.next()){
                    
                    sub.addItem(res.getString(1));
                    sub.addItem(res.getString(2));
                    sub.addItem(res.getString(3));
                    sub.addItem(res.getString(4));
                }
                res.close();

            
        } catch (SQLException ex) {
            Logger.getLogger(ViewDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
    public void ClickMarks(){
        String stuId=stu_id.getText();
        String Stmark=resultBtn.getText();
        //PreparedStatement ps=null;
        ResultSet rs=null;
        String subj=(String) sub.getSelectedItem();
        resultBtn.setText("");
        repeat.setText("");
       
            Connection con=getConnection();
            try {
                
                Statement st=con.createStatement();
                
                //Set database names from Year and Sem
                String db="";
                if(year.getSelectedItem().equals("1st") && sem.getSelectedItem().equals("1st")){
                    db="11";
                }
                else if(year.getSelectedItem().equals("1st") && sem.getSelectedItem().equals("2nd")){
                    db="12";
                }
               
                else if(year.getSelectedItem().equals("2nd") && sem.getSelectedItem().equals("1st")){
                    db="21";
                }
                else if(year.getSelectedItem().equals("2nd") && sem.getSelectedItem().equals("2nd")){
                    db="22";
                }
               
                else if(year.getSelectedItem().equals("3rd") && sem.getSelectedItem().equals("1st")){
                    db="31";
                }
                else if(year.getSelectedItem().equals("3rd") && sem.getSelectedItem().equals("2nd")){
                    db="32";
                }
                //---end
                
                
                if (course.getSelectedItem().equals("Computer Science")){
                    rs = st.executeQuery("SELECT "+subj+" FROM markscs"+db+" WHERE Stu_id='"+stuId+"'");
                }
                else if (course.getSelectedItem().equals("Information System")){
                     rs = st.executeQuery("SELECT "+subj+" FROM marksis"+db+" WHERE Stu_id='"+stuId+"'");
                }
                else if (course.getSelectedItem().equals("Business Management")){
                      rs = st.executeQuery("SELECT "+subj+" FROM marksbm"+db+" WHERE Stu_id='"+stuId+"'");
                }
                else if (course.getSelectedItem().equals("Business Analysis")){
                      rs = st.executeQuery("SELECT "+subj+" FROM marksba"+db+" WHERE Stu_id='"+stuId+"'");
                }
                else if (course.getSelectedItem().equals("Civil Engineering")){
                      rs = st.executeQuery("SELECT "+subj+" FROM marksce"+db+" WHERE Stu_id='"+stuId+"'");
                }
                else if (course.getSelectedItem().equals("Electronic Engineering")){
                     rs = st.executeQuery("SELECT "+subj+" FROM marksee"+db+" WHERE Stu_id='"+stuId+"'");
                }
                
                while (rs.next()){
                    //System.out.println(Sub_id);
                    float marks=rs.getInt(subj);
                    //System.out.println("Marks : "+mark);
                    String grade=getGrade(marks);
                    resultBtn.setText(grade);//set grade to show textpane
                    String pass=showPass(marks);
                    repeat.setText(pass);
                }
                st.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Something went wrong.");
            }
            
        
    }
    
    
    public String getGrade(float mark)
    {
        if (mark>=90) return "A+";
        else if (mark>=80) return "A";
        else if (mark>=75) return "A-";
        else if (mark>=70) return "B+";
        else if (mark>=65) return "B";
        else if (mark>=60) return "B-";
        else if (mark>=55) return "C+";
        else if (mark>=50) return "C";
        else if (mark>=45) return "C-";
        else if (mark>=40) return "D+";
        else if (mark>=35) return "D";
        else if (mark>0) return "F";
        else return "AB";
    }
    public String showPass(float mark){
        if (mark>=50){
            return "Passed";
        }
        else{
            return "Repeat";
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

        passBtn = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        yea = new javax.swing.JLabel();
        sub = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        course = new javax.swing.JComboBox<>();
        stu_id = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        adds = new javax.swing.JLabel();
        faculty = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        viewGrade = new javax.swing.JButton();
        resultBtn = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        subject = new javax.swing.JTextArea();
        year = new javax.swing.JComboBox<>();
        repeat = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        sem = new javax.swing.JComboBox<>();
        yea1 = new javax.swing.JLabel();

        passBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passBtn.setForeground(new java.awt.Color(255, 102, 102));
        passBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        yea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yea.setForeground(new java.awt.Color(102, 102, 102));
        yea.setText("Semester :");

        sub.setBackground(new java.awt.Color(153, 153, 255));
        sub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sub.setForeground(new java.awt.Color(255, 255, 255));
        sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subMouseEntered(evt);
            }
        });
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Course :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("SUB :");

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

        stu_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stu_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stu_idMouseClicked(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 51, 51));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Stu_ID :");

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Grade");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(adds, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Faculty :");

        viewGrade.setBackground(new java.awt.Color(44, 62, 80));
        viewGrade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewGrade.setForeground(new java.awt.Color(255, 255, 255));
        viewGrade.setText("View Grade");
        viewGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGradeActionPerformed(evt);
            }
        });

        resultBtn.setEditable(false);
        resultBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        resultBtn.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(44, 62, 80));
        jLabel13.setText("Grade :");

        subject.setEditable(false);
        subject.setBackground(new java.awt.Color(255, 255, 210));
        subject.setColumns(20);
        subject.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        subject.setRows(5);
        subject.setBorder(null);
        jScrollPane3.setViewportView(subject);

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

        repeat.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        repeat.setForeground(new java.awt.Color(255, 102, 102));

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
                .addGap(142, 142, 142)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
        );

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

        yea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yea1.setForeground(new java.awt.Color(102, 102, 102));
        yea1.setText("Year :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yea)
                            .addComponent(yea1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(viewGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(resultBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(repeat, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(stu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(110, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yea1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(year, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(stu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(repeat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(resultBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19)
                                .addComponent(viewGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseEntered
        // TODO add your handling code here
        loadSub();
        
    }//GEN-LAST:event_subMouseEntered

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subActionPerformed

    private void courseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_courseMouseClicked

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
        try{
            viewSub();
            resultBtn.setText("");
            repeat.setText("");
        }catch(Exception e){

        }
    }//GEN-LAST:event_courseActionPerformed

    private void stu_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stu_idMouseClicked
        // TODO add your handling code here:
        try{
            getStuId();
            //SelectedSub();
        }catch(Exception e){

        }
    }//GEN-LAST:event_stu_idMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        new Student().show();
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

    private void viewGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGradeActionPerformed
        // TODO add your handling code here:
        //System.out.println(checkInput
            try{
                ClickMarks();

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Something went wrong");
            }
    }//GEN-LAST:event_viewGradeActionPerformed

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

     public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(44,100,98));
        
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(44,62,80));
        
    }
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
            java.util.logging.Logger.getLogger(ViewGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewGrade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adds;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> faculty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel passBtn;
    private javax.swing.JLabel repeat;
    private javax.swing.JTextField resultBtn;
    private javax.swing.JComboBox<String> sem;
    private javax.swing.JTextField stu_id;
    private javax.swing.JComboBox<String> sub;
    private javax.swing.JTextArea subject;
    private javax.swing.JButton viewGrade;
    private javax.swing.JLabel yea;
    private javax.swing.JLabel yea1;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
