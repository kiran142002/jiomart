/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jeo_mart_billing_system;
import db.JDBC;
import java.io.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author kiran
 */
public class buyer_add extends javax.swing.JFrame {

    /**
     * Creates new form buyer_add
     */
    public buyer_add() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setText("jLabel2");

        jTextField3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BUYER ADD PAGE");
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jeo_mart_billing_system/imaged.png"))); // NOI18N
        jLabel1.setText("BUYER ADD PAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 36, 327, 47));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 123, 110, -1));

        name.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 117, 168, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("NUMBER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 174, 110, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("E-MAIL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 279, 110, -1));

        email.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 276, 168, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("GENDER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 225, 110, -1));

        number.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 171, 168, -1));

        gender.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS" }));
        gender.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                genderComponentAdded(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 222, 168, -1));

        add.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 383, 83, -1));

        reset.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 383, 83, -1));

        close.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        close.setText("CLOSE");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 383, 83, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jeo_mart_billing_system/wall7.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void genderComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_genderComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComponentAdded

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
           this.setVisible(false);
           new buyer_add().setVisible(true);
           
           
    }//GEN-LAST:event_resetActionPerformed
         private boolean isNumberExists (String number){
             try(Connection con=JDBC.con();
            PreparedStatement ps= con.prepareStatement("SELECT COUNT(*) FROM buytbl  WHERE number= ?");){
          
            ps.setString(1, number);
           
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1)>0;
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);

        }
        return false;
        
   }
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String name1 = name.getText();
        String number1 = number.getText();
        String  email1= email.getText();
        String gender1 = (String) gender.getSelectedItem();
        
       
         if(!name1.isEmpty() && !number1.isEmpty() && !email1.isEmpty() && !gender1.isEmpty() ){

            if(!isNumberExists(number1)){
               JFileChooser fileChooser=new JFileChooser();
               int result=fileChooser.showOpenDialog(this);
             
             if (result ==JFileChooser.APPROVE_OPTION){
                 File selectedFile=fileChooser.getSelectedFile();
                 JOptionPane.showMessageDialog(this, "Uploading img: "+selectedFile.getName());
              
            
                 
             
         try(Connection con=JDBC.con();
            PreparedStatement ps= con.prepareStatement("sp_buyer_insert ?,?,?,?,?");){
             
             FileInputStream fis=new FileInputStream(selectedFile);
             
          
            ps.setString(1, name1);
            ps.setString(2, number1 );
            ps.setString(3, gender1 );
            ps.setString(4, email1 );
            ps.setBinaryStream(5, fis, (int) selectedFile.length());
            
            ps.executeUpdate();
            
           
                JOptionPane.showMessageDialog(null, "IMAGE UPLOADED");
                JOptionPane.showMessageDialog(null, "BUYER SATA INSERTED ");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);

        }
             } else{ JOptionPane.showMessageDialog(this, "IMAGE NOT UPLOADED");}

             }else{ JOptionPane.showMessageDialog(this, "SAME NUMBER");}

         } else{ JOptionPane.showMessageDialog(this, "Enter All the fields");}
        


        
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(buyer_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buyer_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buyer_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buyer_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buyer_add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton close;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
