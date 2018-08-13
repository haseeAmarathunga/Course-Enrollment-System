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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ClashHacker
 */
public class viewReport extends javax.swing.JFrame {

    /**
     * Creates new form viewReport
     */
    public viewReport() {
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
    
    public void getFac(){
        String fac=(String) faculty.getSelectedItem();
        courses.removeAllItems();
        if(fac.equals("School Of Computing")){
            courses.addItem("Computer Science");
            courses.addItem("Information System");
        }
        else if(fac.equals("School Of Business")){
            courses.addItem("Business Management");
            courses.addItem("Business Analysis");
        }
        else{
            courses.addItem("Civil Engineering");
            courses.addItem("Electronic Engineering");
        }
    }
    
    public void getStuId()
    {
        String ac="";
        if(years.getSelectedItem().equals("1st")){
            ac="2018";
        }
        if(years.getSelectedItem().equals("2nd")){
            ac="2017";
        }
        if(years.getSelectedItem().equals("3rd")){
            ac="2016";
        }
         String cou=(String) courses.getSelectedItem();
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
        else if (mark>=0) return "F";
        else return "AB";
    }
    public String Repeat(float mark){
        if (mark>=1.8) return "Passed";
        else return "Repeat";
    }
    
    public float getGPA(float mark)
    {
        if (mark>=90) return (float) 4.0;
        else if (mark>=80) return (float) 3.8;
        else if (mark>=75) return (float) 3.6;
        else if (mark>=70) return (float) 3.0;
        else if (mark>=65) return (float) 2.8;
        else if (mark>=60) return (float) 2.6;
        else if (mark>=55) return (float) 2.2;
        else if (mark>=50) return (float) 2.0;
        else if (mark>=45) return (float) 1.8;
        else if (mark>=40) return (float) 1.4;
        else if (mark>=35) return (float) 1.2;
        else return 0;
    }
    
    
    public void viewReport(){
        String Stu_id=stu_id.getText();
        String course =(String) courses.getSelectedItem();
        String year=(String) years.getSelectedItem();
        
        Connection con=getConnection();
        PreparedStatement ps=null;
        PreparedStatement ps2=null;
        ResultSet res=null;
        ResultSet res2=null;
        String sub1="",sub2="",sub3="",sub4="";
        if(!Stu_id.equals("")){
            
            try {
                
                ps2 = con.prepareStatement("Select Sub1,Sub2,Sub3,Sub4 from subjectssem1 WHERE Stu_id='"+Stu_id+"'");
                res2=ps2.executeQuery();
                
                while(res2.next()){
                    
                    sub1=res2.getString(1);
                    sub2=res2.getString(2);
                    sub3=res2.getString(3);
                    sub4=res2.getString(4);
                }
       
                res2.close();

            
            } catch (SQLException ex) {
                Logger.getLogger(ViewDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    
        //I developed that function only for 1st year CS Student.
        try {
            reportBox.setText("");
        
        //Set database names from Year and Sem
                String db="";
                if(years.getSelectedItem().equals("1st") && sem.getSelectedItem().equals("1st")){
                    db="11";
                }
                else if(years.getSelectedItem().equals("1st") && sem.getSelectedItem().equals("2nd")){
                    db="12";
                }
               
                else if(years.getSelectedItem().equals("2nd") && sem.getSelectedItem().equals("1st")){
                    db="21";
                }
                else if(years.getSelectedItem().equals("2nd") && sem.getSelectedItem().equals("2nd")){
                    db="22";
                }
               
                else if(years.getSelectedItem().equals("3rd") && sem.getSelectedItem().equals("1st")){
                    db="31";
                }
                else if(years.getSelectedItem().equals("3rd") && sem.getSelectedItem().equals("2nd")){
                    db="32";
                }
                //---end    
            
            
        if (course.equals("Computer Science")){
            ps = con.prepareStatement("SELECT Stu_id,"+sub1+","+sub2+","+sub3+","+sub4+" from markscs"+db+" where Stu_id='"+Stu_id+"'");
        }
        else if (course.equals("Information System") ){
            ps = con.prepareStatement("SELECT Stu_id,"+sub1+","+sub2+","+sub3+","+sub4+" from marksis"+db+" where Stu_id='"+Stu_id+"'");
        }
        else if (course.equals("Business Management") ){
            ps = con.prepareStatement("SELECT Stu_id,"+sub1+","+sub2+","+sub3+","+sub4+" from marksbm"+db+" where Stu_id='"+Stu_id+"'");
        }
        else if (course.equals("Business Analysis") ){
            ps = con.prepareStatement("SELECT Stu_id,"+sub1+","+sub2+","+sub3+","+sub4+" from marksba"+db+" where Stu_id='"+Stu_id+"'");
        }
        else if (course.equals("Civil Engineering") ){
            ps = con.prepareStatement("SELECT Stu_id,"+sub1+","+sub2+","+sub3+","+sub4+" from marksce"+db+" where Stu_id='"+Stu_id+"'");
        }
        else if (course.equals("Electronic Engineering") ){
            ps = con.prepareStatement("SELECT Stu_id,"+sub1+","+sub2+","+sub3+","+sub4+" from marksee"+db+" where Stu_id='"+Stu_id+"'");
        }
        
        
        
        
        try{
            res=ps.executeQuery(); 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Enter a Valid Stu_id.");
        }
            float GPA=0;
            while (res.next()){
                reportBox.append("Year Report :");
                reportBox.append("("+res.getString(1)+")\n\n\t\tGrade\tGPA\n");
                reportBox.append("\n "+sub1+" : ");
                float a=getGPA((float) Double.parseDouble(res.getString(2)));
                reportBox.append(res.getString(2)+"\t"+ getGrade((float) Double.parseDouble(res.getString(2)))+"\t"+a+"\t"+Repeat(a));
                reportBox.append("\n "+sub2+" : ");
                float b=getGPA((float) Double.parseDouble(res.getString(3)));
                reportBox.append(res.getString(3)+"\t"+ getGrade((float) Double.parseDouble(res.getString(3)))+"\t"+b+"\t"+Repeat(b));
                reportBox.append("\n "+sub3+" : ");
                float c=getGPA((float) Double.parseDouble(res.getString(4)));
                reportBox.append(res.getString(4)+"\t"+ getGrade((float) Double.parseDouble(res.getString(4)))+"\t"+c+"\t"+Repeat(c));
                reportBox.append("\n "+sub4+" : ");
                float d=getGPA((float) Double.parseDouble(res.getString(5)));
                reportBox.append(res.getString(5)+"\t"+ getGrade((float) Double.parseDouble(res.getString(5)))+"\t"+d+"\t"+Repeat(d));
                
                GPA=a+b+c+d;
                reportBox.append("\n\n\t\t     Semester GPA : "+GPA/4);
            
            
            }
        
        
        
        
            //resultSetToTableModel(res,Stu_table);
        } catch (SQLException ex) {
            Logger.getLogger(ViewDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        else{
            JOptionPane.showMessageDialog(null,"Please Enter the Stu_id.");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        adds = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        reportBox = new javax.swing.JTextArea();
        years = new javax.swing.JComboBox<>();
        repeat = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        faculty = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        generateReport = new javax.swing.JButton();
        yea = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        courses = new javax.swing.JComboBox<>();
        stu_id = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sem = new javax.swing.JComboBox<>();
        yea1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Generate Report");

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

        reportBox.setEditable(false);
        reportBox.setBackground(new java.awt.Color(255, 255, 210));
        reportBox.setColumns(20);
        reportBox.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        reportBox.setRows(5);
        reportBox.setBorder(null);
        jScrollPane3.setViewportView(reportBox);

        years.setBackground(new java.awt.Color(153, 153, 255));
        years.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        years.setForeground(new java.awt.Color(255, 255, 255));
        years.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd" }));
        years.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yearsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yearsMouseEntered(evt);
            }
        });
        years.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel20))
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

        generateReport.setBackground(new java.awt.Color(44, 62, 80));
        generateReport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        generateReport.setForeground(new java.awt.Color(255, 255, 255));
        generateReport.setText("Generate Report");
        generateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportActionPerformed(evt);
            }
        });

        yea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yea.setForeground(new java.awt.Color(102, 102, 102));
        yea.setText("Semester :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Course :");

        courses.setBackground(new java.awt.Color(153, 153, 255));
        courses.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courses.setForeground(new java.awt.Color(255, 255, 255));
        courses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business Management", "Business Analysis" }));
        courses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursesMouseClicked(evt);
            }
        });
        courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Stu_ID :");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(yea)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4)
                            .addComponent(yea1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(repeat, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(courses, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(generateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 13, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(147, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yea1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courses, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(repeat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(generateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 23, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void yearsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsMouseClicked

    private void yearsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsMouseEntered

    private void yearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsActionPerformed

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
        courses.removeAllItems();
        if(fac.equals("School Of Computing")){
            courses.addItem("Computer Science");
            courses.addItem("Information System");
        }
        else if(fac.equals("School Of Business")){
            courses.addItem("Business Management");
            courses.addItem("Business Analysis");
        }
        else{
            courses.addItem("Civil Engineering");
            courses.addItem("Electronic Engineering");
        }
    }//GEN-LAST:event_facultyActionPerformed

    private void generateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportActionPerformed
        // TODO add your handling code here:
        //System.out.println(checkInput
            try{
                viewReport();

            }catch(Exception e){
                
            }
    }//GEN-LAST:event_generateReportActionPerformed

    private void coursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_coursesMouseClicked

    private void coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_coursesActionPerformed

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
            java.util.logging.Logger.getLogger(viewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adds;
    private javax.swing.JComboBox<String> courses;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> faculty;
    private javax.swing.JButton generateReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel repeat;
    private javax.swing.JTextArea reportBox;
    private javax.swing.JComboBox<String> sem;
    private javax.swing.JTextField stu_id;
    private javax.swing.JLabel yea;
    private javax.swing.JLabel yea1;
    private javax.swing.JComboBox<String> years;
    // End of variables declaration//GEN-END:variables
}
