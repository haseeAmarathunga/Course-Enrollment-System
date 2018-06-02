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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ClashHacker
 */
public class ViewDetails extends javax.swing.JFrame {

    /**
     * Creates new form ViewDetails
     */
    public ViewDetails() {
        initComponents();
    }

    
    public Connection getConnection()
    {
        Connection con =null;
        PreparedStatement ps=null;
        ResultSet res=null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/nsbm_db","root","");
            //JOptionPane.showMessageDialog(null,"Congratulation. Register Successful.");
            return con;
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(AddStuDetails.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Not Connected");
            return null;
        }
    }
    
    public void search_name(){
        String stuName=(String) StuName.getText();
       
        Connection con=getConnection();
        PreparedStatement ps=null;
        ResultSet res=null;
        try {
            ps = con.prepareStatement("SELECT * from students where FirstName LIKE '%"+stuName+"%' OR LastName LIKE'%"+stuName+"%'");
            
            res=ps.executeQuery(); 
            
            resultSetToTableModel(res,Stu_table);
        } catch (SQLException ex) {
            Logger.getLogger(ViewDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void show_details()
    {
        String courseType=(String) selectType.getSelectedItem();
        String Fac =(String) selectFac.getSelectedItem();
        Connection con=getConnection();
        PreparedStatement ps=null;
        ResultSet res=null;
        try {
            if (courseType.equals("Bachelor")){
                if (Fac.equals("All")){
                    ps = con.prepareStatement("SELECT * from students where CourseType='Bachelor'");
                }
                else{
                    ps = con.prepareStatement("SELECT * from students where CourseType='Bachelor' AND Faculty='"+Fac+"'");
                }
            }
            else if (courseType.equals("Master")){
                if (Fac.equals("All")){
                    ps = con.prepareStatement("SELECT * from students where CourseType='Master'");
                }
                else{
                    ps = con.prepareStatement("SELECT * from students where CourseType='Master' AND Faculty='"+Fac+"'");
                }
            }
            else{
                if(Fac.equals("All")){
                    ps = con.prepareStatement("SELECT * from students");
                }
                else{
                    ps = con.prepareStatement("SELECT * from students where Faculty='"+Fac+"'");
                }
            }
            
            res=ps.executeQuery(); 
            
            resultSetToTableModel(res,Stu_table);
        } catch (SQLException ex) {
            Logger.getLogger(ViewDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public void delete_details()
    {
        String Stu_id=(String) Stu_idBtn.getText();
        Connection con=getConnection();
        PreparedStatement ps=null;
        try {
            //ResultSet res=null;
            ps = con.prepareStatement("DELETE from students where Stu_id='"+Stu_id+"'");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, Stu_id+" Deleted.");
            show_details();
            
        } catch (SQLException ex) {
            Logger.getLogger(ViewDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            //resultSetToTableModel(res,Stu_table);
        
    }
    
    
    public void resultSetToTableModel(ResultSet rs,JTable table) throws SQLException
    {
        //create new tableModel.
        DefaultTableModel tableModel=new DefaultTableModel();
        
        //retrieve meta data from resultset
        ResultSetMetaData metaData = rs.getMetaData();
        
        //get no of column from metadata
        int columnCount =metaData.getColumnCount();
        
        //get all column namesfrom metadata and add column to table model. 
        for (int column=1 ; column<=columnCount;column++){
            tableModel.addColumn(metaData.getColumnLabel(column));
        }
        
        //create array of object withsize of column count from meta data.
        Object[] row=new Object[columnCount];
        
        //scroll through result set
        while (rs.next()){
            //get object from column with specific index of result set to array of objects.
            for (int columnIndex=0 ;columnIndex <columnCount ;columnIndex++){
                row[columnIndex]=rs.getObject(columnIndex+1);
            }
            //add that row to tablemodel as an argument with that array of objects.
            tableModel.addRow(row);
        }
        //add that table model to our table.
        table.setModel(tableModel);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Stu_table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        selectType = new javax.swing.JComboBox<>();
        fac = new javax.swing.JLabel();
        selectFac = new javax.swing.JComboBox<>();
        StuName = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        View = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        Stu_idBtn = new javax.swing.JTextField();
        DeleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIEW STUDENTS Details");

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

        adds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm_course_enrollment_system/Images/icons8-search-64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(adds, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 550, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(adds, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
            .addGap(0, 12, Short.MAX_VALUE)
        );

        Stu_table.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Stu_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stu_id", "FirstName", "LastName", "BirthDay", "Address", "MobileNo", "Email", "Gender", "Faculty", "Course_type", "Semester"
            }
        ));
        Stu_table.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(Stu_table);
        Stu_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Course Type");

        selectType.setForeground(new java.awt.Color(102, 102, 102));
        selectType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Master", "Bachelor" }));
        selectType.setSelectedItem(View);

        fac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fac.setForeground(new java.awt.Color(102, 102, 102));
        fac.setText("Faculty");

        selectFac.setForeground(new java.awt.Color(102, 102, 102));
        selectFac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "School Of Business", "School Of Computing", "School Of Engineering" }));

        StuName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StuName.setForeground(new java.awt.Color(51, 51, 51));
        StuName.setToolTipText("Enter Name");

        exit.setBackground(new java.awt.Color(255, 51, 51));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        View.setBackground(new java.awt.Color(44, 62, 80));
        View.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        View.setForeground(new java.awt.Color(255, 255, 255));
        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        Search.setBackground(new java.awt.Color(102, 102, 102));
        Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Stu_idBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Stu_idBtn.setForeground(new java.awt.Color(51, 51, 51));
        Stu_idBtn.setToolTipText("Enter Stu_id");
        Stu_idBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stu_idBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fac)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StuName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stu_idBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(selectType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fac)
                            .addComponent(selectFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 26, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Stu_idBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StuName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
        show_details();
    }//GEN-LAST:event_ViewActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        search_name();
    }//GEN-LAST:event_SearchActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        delete_details();
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void Stu_idBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stu_idBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Stu_idBtnActionPerformed

    
      public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(44,28,47));
        
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
            java.util.logging.Logger.getLogger(ViewDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton Search;
    private javax.swing.JTextField StuName;
    private javax.swing.JTextField Stu_idBtn;
    private javax.swing.JTable Stu_table;
    private javax.swing.JButton View;
    private javax.swing.JLabel adds;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> selectFac;
    private javax.swing.JComboBox<String> selectType;
    // End of variables declaration//GEN-END:variables

}
