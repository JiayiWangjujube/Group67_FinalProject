/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Venue;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.Organizer.EventManagementJPanel;


/**
 *
 * @author zhangdi
 */
public class VenueWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;


    /**
     * Creates new form VenueWorkAreaJPanel
     */
    public VenueWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnVenueMgt = new javax.swing.JButton();
        btnVenueRequest = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel1.setText("Venue Manager Work Area");

        btnVenueMgt.setText("Venue Management");
        btnVenueMgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenueMgtActionPerformed(evt);
            }
        });

        btnVenueRequest.setText("Venue Request");
        btnVenueRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenueRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVenueRequest)
                            .addComponent(btnVenueMgt))))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(btnVenueMgt)
                .addGap(34, 34, 34)
                .addComponent(btnVenueRequest)
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenueRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenueRequestActionPerformed
        // TODO add your handling code here:
        VenueManagementJPanel vmjp = new VenueManagementJPanel(userProcessContainer, account, organization, enterprise);
        userProcessContainer.add("VenueManagementJPanel", vmjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnVenueRequestActionPerformed

    private void btnVenueMgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenueMgtActionPerformed
        // TODO add your handling code here:
        ManageVenuesJPanel mvjp = new ManageVenuesJPanel(userProcessContainer, account, organization, enterprise);
        userProcessContainer.add("ManageVenuesJPanel", mvjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnVenueMgtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVenueMgt;
    private javax.swing.JButton btnVenueRequest;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}