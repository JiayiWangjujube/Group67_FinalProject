/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Organizer;

import Business.Enterprise.Enterprise;
import Business.Organization.ConcertPlanningOrganization;
import Business.Organization.Organization;
import Business.Role.OrganizerRole;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhangdi
 */
public class OrganizerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private OrganizerRole organizerRole;

    private JTable eventTable;
    private DefaultTableModel tableModel;
    
    
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public OrganizerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.organizerRole = organizerRole;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEventMgt = new javax.swing.JButton();
        btnTicketingTracking = new javax.swing.JButton();
        btnContractMgt = new javax.swing.JButton();
        btnRevenueSum = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnEventMgt.setText("Event Management");
        btnEventMgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventMgtActionPerformed(evt);
            }
        });

        btnTicketingTracking.setText("Ticket Tracking");

        btnContractMgt.setText("Contract Management");
        btnContractMgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContractMgtActionPerformed(evt);
            }
        });

        btnRevenueSum.setText("Revenue Summary");
        btnRevenueSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevenueSumActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel1.setText("Organizer Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRevenueSum)
                    .addComponent(btnContractMgt)
                    .addComponent(btnTicketingTracking)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEventMgt)
                        .addComponent(jLabel1)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(btnEventMgt)
                .addGap(42, 42, 42)
                .addComponent(btnContractMgt)
                .addGap(38, 38, 38)
                .addComponent(btnTicketingTracking)
                .addGap(44, 44, 44)
                .addComponent(btnRevenueSum)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEventMgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventMgtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnEventMgtActionPerformed

    private void btnContractMgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContractMgtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContractMgtActionPerformed

    private void btnRevenueSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevenueSumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRevenueSumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContractMgt;
    private javax.swing.JButton btnEventMgt;
    private javax.swing.JButton btnRevenueSum;
    private javax.swing.JButton btnTicketingTracking;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}