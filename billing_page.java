/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jeo_mart_billing_system;
import com.itextpdf.text.DocumentException;
import db.JDBC;
import java.sql.*;
import javax.swing.*;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatterBuilder;

/**
 *
 * @author kiran
 */
public class billing_page extends javax.swing.JFrame {

    /**
     * Creates new form billing_page
     */
    public billing_page() {
        initComponents();
        SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy");
        Date date1=new Date();
        date.setText(sdf.format(date1));
        
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime ldf=LocalDateTime.now();
        time.setText(dtf.format(ldf));
        
        
        
    }
      public static String decrypt (String encryptedData,String secretKey) throws Exception{
        Cipher cipher=Cipher.getInstance("AES");
        SecretKeySpec secretKeySpec=new SecretKeySpec(secretKey.getBytes(),"AES");
        cipher.init(Cipher.DECRYPT_MODE,secretKeySpec );
        byte[] decodedBytes=Base64.getDecoder().decode(encryptedData);
        byte[] decryptedBytes=cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
        
    }
    private final String SECRET_KEY="1234567890123456";
    

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
        date = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cell = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        product = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        rate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        save = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        paid = new javax.swing.JTextField();
        balance = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BILLING PAGE");
        setMinimumSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BILLING.png"))); // NOI18N
        jLabel1.setText("BILLING PAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 15, 131, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("DATE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 23, 43, -1));

        date.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 23, 137, 15));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("TIME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 23, 43, -1));

        time.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 23, 145, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 809, 6));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 136, 809, 17));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 229, 809, 12));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT", "RATE", "QUANTITY", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 259, -1, 273));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("BUYER DETAILS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 70, 105, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("PRODUCT DETAILS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 157, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("NAME");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 100, 43, -1));

        name.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 97, 105, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("CELL");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 43, -1));

        cell.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellActionPerformed(evt);
            }
        });
        getContentPane().add(cell, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 97, 105, -1));

        email.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 97, 105, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("E-MAIL");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("ID");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 193, 33, -1));

        id.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 190, 70, -1));

        product.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 190, 79, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("PRODUCT");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 193, 62, -1));

        rate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 190, 90, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("RATE");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 193, 43, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("QUANTITY");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 193, 80, -1));

        quantity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 190, 90, -1));

        add.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 190, 83, -1));

        delete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 310, 83, -1));

        save.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 349, 83, -1));

        reset.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 388, 83, -1));

        close.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        close.setText("CLOSE");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 427, 83, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("AMOUNT DETAILS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 288, 148, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("TOTAL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 334, 86, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("PAID");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 378, 51, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("BALANCE");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 444, 68, -1));
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 326, 104, -1));

        paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidActionPerformed(evt);
            }
        });
        getContentPane().add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 370, 104, -1));
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 436, 104, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/waterfal.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 550));

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
          new billing_page().setVisible(true);
    }//GEN-LAST:event_resetActionPerformed

    private void cellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellActionPerformed
        // TODO add your handling code here:
        String c =cell.getText();
             
     
        
         try(Connection con=JDBC.con();
            PreparedStatement ps= con.prepareStatement("select * from buytbl where number=?");){
          
            ps.setString(1, c);
            
          
           
            ResultSet rs=ps.executeQuery();
            
            if(rs.next())
            {
             
            name.setText(rs.getString("name"));
            email.setText(rs.getString("email"));
            JOptionPane.showMessageDialog(this, "BUYER DETAILS ADDED");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);

        
        }     
    }//GEN-LAST:event_cellActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
          String pid =id.getText();
             
     
        
         try(Connection con=JDBC.con();
            PreparedStatement ps= con.prepareStatement(" select * from pdtbl where pid=?");){
          
            ps.setString(1, pid);
        
            ResultSet rs=ps.executeQuery();
            
            if(rs.next())
            {
             
            product.setText(rs.getString("pname"));
            rate.setText(decrypt(rs.getString("prate"),SECRET_KEY));
            quantity.setText("1");
            JOptionPane.showMessageDialog(this, "PRODUCT DETAILS ADDED");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);

        
        }     
    }//GEN-LAST:event_idActionPerformed
        double finaltotal=0;
        double rat=0;
        int quan=1;
        double tot=0;
        
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        rat=Double.parseDouble(rate.getText());
        quan=Integer.parseInt(quantity.getText());
        tot=rat*quan;
        finaltotal=finaltotal+tot;
        
        DefaultTableModel dtm= (DefaultTableModel)table.getModel();
        dtm.addRow(new Object[]{product.getText(),rat,quan,tot});
        String Total=String.valueOf(finaltotal);
        total.setText(Total);
        
        
        
    }//GEN-LAST:event_addActionPerformed

    private void paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidActionPerformed
        // TODO add your handling code here:
        String pamt=paid.getText();
        int PAMT=Integer.parseInt(pamt);
        finaltotal=PAMT-finaltotal;
        String ramt=String.valueOf(finaltotal);
        balance.setText(ramt);
        balance.setEditable(false);
        
        
    }//GEN-LAST:event_paidActionPerformed

    int row=0;
    double tot1=-1;
    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         DefaultTableModel dtm= (DefaultTableModel)table.getModel();
         if(table.getSelectedRowCount()==1){
             dtm.removeRow(table.getSelectedRow());
             
             finaltotal=finaltotal-tot;
             
             String Total=String.valueOf(finaltotal);
             total.setText(Total);
             
         }
    }//GEN-LAST:event_deleteActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        row=table.rowAtPoint(evt.getPoint());
        tot1=(double) table.getValueAt(row, 3);
    }//GEN-LAST:event_tableMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String path="C:\\Users\\kiran\\Downloads\\";
        com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(path+" "+date.getText()+".pdf"));
            doc.open();
            
            Paragraph p1=new Paragraph("                     BILL COPY                                                   ");
            doc.add(p1);
            Paragraph p2=new Paragraph("Date&Time"+date.getText()+"  "+time.getText()+ "\n\n");
            doc.add(p2);
            Paragraph p3=new Paragraph("Name: "+name.getText()+"\nNumber: "+cell.getText()+"\nE-MAIL: "+email.getText()+"\n\n");
            doc.add(p3);
            
            PdfPTable pt=new PdfPTable(4);
            pt.addCell("Name");
            pt.addCell("Rate");
            pt.addCell("Quantity");
            pt.addCell("Total");
            
            for(int i=0;i<table.getRowCount();i++){
                String n=table.getValueAt(i, 0).toString();
                String r=table.getValueAt(i, 1).toString();
                String q=table.getValueAt(i, 2).toString();
                String t=table.getValueAt(i, 3).toString();
                  
                pt.addCell(n);   
                pt.addCell(r);
                pt.addCell(q);
                pt.addCell(t);
            }
            doc.add(pt);
             Paragraph p4=new Paragraph("\n\nTotal Amount: "+total.getText()+"\nCasg paid: "+paid.getText()+"\nCash returned: "+balance.getText()+"\n\n THANKS COME AGAIN");
            doc.add(p4);
           JOptionPane.showMessageDialog(this, "BILL GENERATED");
           doc.close();
        }
        catch(Exception e){
              JOptionPane.showMessageDialog(this, e);

            
        }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(billing_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField balance;
    private javax.swing.JTextField cell;
    private javax.swing.JButton close;
    private javax.swing.JLabel date;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField product;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField rate;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JTable table;
    private javax.swing.JLabel time;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
