/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.TicketingAgentRole;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author 粥嘚嘚
 */
public class ProcessTicketCheckJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private int selectedRow;
     private List<Object[]> tableData;

    /**
     * Creates new form ProcessTicketCheckJPanel
     */
    public ProcessTicketCheckJPanel(JPanel userProcessContainer, int selectedRow, List<Object[]> tableData) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.selectedRow = selectedRow;
        this.tableData = tableData;

        setupComponents(); 
    }
    
      private void setupComponents() {
       
        cbCheckResult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approve", "Reject" }));
        cbRemark.setEnabled(false); 

       
        cbCheckResult.addActionListener(evt -> {
            String result = (String) cbCheckResult.getSelectedItem();
            cbRemark.setEnabled("Reject".equals(result));
        });

        
        cbRemark.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
            "Venue capacity exceeded", 
            "Schedule conflict", 
            "Incomplete documentation", 
            "Insufficient security arrangements"
        }));
        
        cbcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
              "Concert",       
              "Live House",   
              "Movie",         
              "Dance Show"     
        }));;
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsubmit = new javax.swing.JButton();
        lbCheckResult = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        cbCheckResult = new javax.swing.JComboBox<>();
        cbRemark = new javax.swing.JComboBox<>();
        lbRemark = new javax.swing.JLabel();
        lbActualPrice = new javax.swing.JLabel();
        txtActualPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbcategory = new javax.swing.JComboBox<>();

        btnsubmit.setText("Submit Result");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        lbCheckResult.setText("Check Result");

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        cbCheckResult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCheckResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCheckResultActionPerformed(evt);
            }
        });

        cbRemark.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbRemark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRemarkActionPerformed(evt);
            }
        });

        lbRemark.setText("Remark");

        lbActualPrice.setText("Actual Price");

        txtActualPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualPriceActionPerformed(evt);
            }
        });

        jLabel2.setText("Category");

        cbcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCheckResult)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbActualPrice)
                                .addComponent(lbRemark)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(60, 60, 60))
                                .addComponent(jLabel2)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbRemark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCheckResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtActualPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(btnsubmit)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCheckResult)
                    .addComponent(cbCheckResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRemark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRemark))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbActualPrice)
                    .addComponent(txtActualPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsubmit)
                    .addComponent(btnback))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        String result = (String) cbCheckResult.getSelectedItem();
        String remark = "Reject".equals(result) ? (String) cbRemark.getSelectedItem() : "";
        String actualPriceText = txtActualPrice.getText();
        String category = (String) cbcategory.getSelectedItem();
        
        if (actualPriceText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Actual Price cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }
        
         double actualPrice;
         try {
             actualPrice = Double.parseDouble(actualPriceText);
         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(this, "Please enter a valid number for Actual Price.", "Warning", JOptionPane.WARNING_MESSAGE);
             return;
    }
        
        Object[] row = tableData.get(selectedRow);
    if (row.length < 8) {
        Object[] newRow = new Object[8];
        System.arraycopy(row, 0, newRow, 0, row.length);
        row = newRow;
        tableData.set(selectedRow, newRow); // 更新回 tableData
    }

    row[3] = result; 
    row[4] = remark; 
    row[6] = actualPrice;
    row[7] = category;

    System.out.println("Updated row: " + java.util.Arrays.toString(row)); // 调试输出

    // 返回到 ManageTicketingJPanel
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.show(userProcessContainer, "ManageTicketingJPanel");

    // 刷新表格
    JPanel previousPanel = (JPanel) userProcessContainer.getComponent(userProcessContainer.getComponentCount() - 1);
    if (previousPanel instanceof ManageTicketingJPanel) {
        ((ManageTicketingJPanel) previousPanel).refreshTable();
    }

    JOptionPane.showMessageDialog(this, "Result submitted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed

       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.show(userProcessContainer, "ManageTicketingJPanel");
    }//GEN-LAST:event_btnbackActionPerformed

    private void cbCheckResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCheckResultActionPerformed
        // TODO add your handling code here:
        String result = (String) cbCheckResult.getSelectedItem();

   
       cbRemark.setEnabled("Reject".equals(result));
    }//GEN-LAST:event_cbCheckResultActionPerformed

    private void txtActualPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualPriceActionPerformed

    private void cbcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbcategoryActionPerformed

    private void cbRemarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRemarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRemarkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> cbCheckResult;
    private javax.swing.JComboBox<String> cbRemark;
    private javax.swing.JComboBox<String> cbcategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbActualPrice;
    private javax.swing.JLabel lbCheckResult;
    private javax.swing.JLabel lbRemark;
    private javax.swing.JTextField txtActualPrice;
    // End of variables declaration//GEN-END:variables
}
