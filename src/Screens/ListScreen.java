/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens;

import Methods.ReadTxtFile;
import java.io.FileNotFoundException;
import p_case.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Simon
 */
public class ListScreen extends javax.swing.JFrame {

    /**
     * Creates new form ListScreen
     */
    public ListScreen() {
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

        jLabelU_name = new javax.swing.JLabel();
        jButtonLogout = new javax.swing.JButton();
        jButtonNewListing = new javax.swing.JButton();
        jButtonChange_Delete = new javax.swing.JButton();
        jButtonTest = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaBenutzername = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaPasswort = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaDomain = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaNummer = new javax.swing.JTextArea();
        jLabelNummer = new javax.swing.JLabel();
        jLabelBenutzername = new javax.swing.JLabel();
        jLabelPasswort = new javax.swing.JLabel();
        jLabelDomain = new javax.swing.JLabel();
        jButtonHelp = new javax.swing.JButton();
        jToggleButtonTest = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelU_name.setText("//Username");

        jButtonLogout.setText("Logout");
        jButtonLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogoutMouseClicked(evt);
            }
        });

        jButtonNewListing.setText("Neuer Eintrag");
        jButtonNewListing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNewListingMouseClicked(evt);
            }
        });

        jButtonChange_Delete.setText("Bearbeiten / Löschen");
        jButtonChange_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonChange_DeleteMouseClicked(evt);
            }
        });

        jButtonTest.setText("Test");
        jButtonTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTestMouseClicked(evt);
            }
        });
        jButtonTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestActionPerformed(evt);
            }
        });

        jTextAreaBenutzername.setEditable(false);
        jTextAreaBenutzername.setColumns(20);
        jTextAreaBenutzername.setRows(5);
        jTextAreaBenutzername.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTextAreaBenutzername);

        jTextAreaPasswort.setEditable(false);
        jTextAreaPasswort.setColumns(20);
        jTextAreaPasswort.setRows(5);
        jScrollPane4.setViewportView(jTextAreaPasswort);

        jTextAreaDomain.setEditable(false);
        jTextAreaDomain.setColumns(20);
        jTextAreaDomain.setRows(5);
        jScrollPane5.setViewportView(jTextAreaDomain);

        jTextAreaNummer.setEditable(false);
        jTextAreaNummer.setColumns(20);
        jTextAreaNummer.setRows(5);
        jScrollPane6.setViewportView(jTextAreaNummer);

        jLabelNummer.setText("Nummer");

        jLabelBenutzername.setText("Benutzername");

        jLabelPasswort.setText("Passwort");

        jLabelDomain.setText("Domain");

        jButtonHelp.setText("?");
        jButtonHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonHelpMouseClicked(evt);
            }
        });

        jToggleButtonTest.setText("TestToggle");
        jToggleButtonTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButtonTestMouseClicked(evt);
            }
        });
        jToggleButtonTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNewListing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 676, Short.MAX_VALUE)
                        .addComponent(jButtonChange_Delete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonLogout)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNummer)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonTest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButtonTest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBenutzername))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPasswort))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelDomain)
                                        .addGap(8, 8, 8)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelU_name, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonHelp)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelU_name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHelp))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLogout)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNewListing)
                            .addComponent(jButtonChange_Delete))
                        .addGap(357, 357, 357)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTest)
                            .addComponent(jToggleButtonTest)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNummer)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelBenutzername)
                                .addComponent(jLabelPasswort)
                                .addComponent(jLabelDomain)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonChange_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonChange_DeleteMouseClicked
        
        new Edit().setVisible(true);
        
    }//GEN-LAST:event_jButtonChange_DeleteMouseClicked

    private void jButtonLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogoutMouseClicked
        dispose();
    }//GEN-LAST:event_jButtonLogoutMouseClicked

    private void jButtonNewListingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNewListingMouseClicked
        new NewListing().setVisible(true);
    }//GEN-LAST:event_jButtonNewListingMouseClicked

    private void jButtonTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTestActionPerformed

    private void jButtonTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTestMouseClicked

        
        ReadTxtFile abc = new ReadTxtFile();
        try {
            abc.FileReaderAdmin(jTextAreaNummer,jTextAreaBenutzername,jTextAreaPasswort);
        } catch (IOException ex) {
            Logger.getLogger(ListScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
               
    }//GEN-LAST:event_jButtonTestMouseClicked

    private void jButtonHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHelpMouseClicked
                ReadTxtFile readFAQ = new ReadTxtFile();
        try {
            readFAQ.FileReaderFAQ();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonHelpMouseClicked

    private void jToggleButtonTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonTestMouseClicked

        
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonTestMouseClicked

    private void jToggleButtonTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonTestActionPerformed
        
        if(jToggleButtonTest.isSelected()==true){
        ReadTxtFile abc = new ReadTxtFile();
        try {
            abc.FileReaderAdmin(jTextAreaNummer,jTextAreaBenutzername,jTextAreaPasswort);
        } catch (IOException ex) {
            Logger.getLogger(ListScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else{
            jTextAreaBenutzername.setText(null);
            jTextAreaDomain.setText(null);
            jTextAreaNummer.setText(null);
            jTextAreaPasswort.setText(null);
        }
        
    }//GEN-LAST:event_jToggleButtonTestActionPerformed

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
            java.util.logging.Logger.getLogger(ListScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChange_Delete;
    private javax.swing.JButton jButtonHelp;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonNewListing;
    private javax.swing.JButton jButtonTest;
    private javax.swing.JLabel jLabelBenutzername;
    private javax.swing.JLabel jLabelDomain;
    private javax.swing.JLabel jLabelNummer;
    private javax.swing.JLabel jLabelPasswort;
    private javax.swing.JLabel jLabelU_name;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextAreaBenutzername;
    private javax.swing.JTextArea jTextAreaDomain;
    private javax.swing.JTextArea jTextAreaNummer;
    private javax.swing.JTextArea jTextAreaPasswort;
    private javax.swing.JToggleButton jToggleButtonTest;
    // End of variables declaration//GEN-END:variables
}
