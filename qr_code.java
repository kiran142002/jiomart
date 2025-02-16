/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jeo_mart_billing_system;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;







/**
 *
 * @author kiran
 */
public class qr_code extends javax.swing.JFrame {

    /**
     * Creates new form qr_code
     */
    public qr_code() {
        initComponents();
    }
    
    private BufferedImage createQRImage(String text,int width, int height)throws WriterException{
        Map<EncodeHintType,ErrorCorrectionLevel> hints=new HashMap<>();
        hints.put(EncodeHintType.ERROR_CORRECTION,ErrorCorrectionLevel.H);
        
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix =qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height,hints);
        
        return MatrixToImageWriter.toBufferedImage(bitMatrix);
                
    }
    private BufferedImage qrImage;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text = new javax.swing.JTextField();
        textlb = new javax.swing.JLabel();
        qr_code = new javax.swing.JButton();
        close = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OR CODE PAGE");
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("QR CODE PAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 25, 144, 24));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("TEXT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 101, 43, -1));

        text.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 98, 154, -1));

        textlb.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(textlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 156, 176, 142));

        qr_code.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        qr_code.setText("QR CODE");
        qr_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qr_codeActionPerformed(evt);
            }
        });
        getContentPane().add(qr_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 412, 101, -1));

        close.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        close.setText("CLOSE");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 412, 83, -1));

        reset.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 412, 83, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jeo_mart_billing_system/yellow.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
         new qr_code().setVisible(true);
    }//GEN-LAST:event_resetActionPerformed

    private void qr_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qr_codeActionPerformed
        // TODO add your handling code here:
        String text1=text.getText();
        
        if(text1.isEmpty()){
             JOptionPane.showMessageDialog(this, "PLEASE ENTER TEXT TO GENERATE QR CODE");
             return;
        }
        try{
            qrImage =createQRImage(text1,300,300);
            textlb.setIcon(new ImageIcon(qrImage));
            
            
          } catch (Exception e) {
                 JOptionPane.showMessageDialog(this,e);

           }
        
        if(textlb !=null){
             JFileChooser fileChooser=new JFileChooser();
         int userSelection=fileChooser.showOpenDialog(this);
         
           if (userSelection ==JFileChooser.APPROVE_OPTION){
                 File fileToSave=fileChooser.getSelectedFile();
                   try{
                      ImageIO.write(qrImage,"png",fileToSave);
                       textlb.setIcon(new ImageIcon(qrImage));
            
              JOptionPane.showMessageDialog(this, "QR CODE SAVED SUCCESSFULLY!");
          } catch (Exception e) {
                 JOptionPane.showMessageDialog(this,e);
          }
           
               
           }
        }
        
    }//GEN-LAST:event_qr_codeActionPerformed

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
            java.util.logging.Logger.getLogger(qr_code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qr_code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qr_code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qr_code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qr_code().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton qr_code;
    private javax.swing.JButton reset;
    private javax.swing.JTextField text;
    private javax.swing.JLabel textlb;
    // End of variables declaration//GEN-END:variables
}
