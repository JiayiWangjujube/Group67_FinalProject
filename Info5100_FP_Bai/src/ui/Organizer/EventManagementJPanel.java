/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Organizer;

import Business.Enterprise.Enterprise;
import Business.Enterprise.OrganizerEnterprise;
import Business.Organization.ConcertPlanningOrganization;
import Business.Organization.Organization;
import Business.Organization.TicketingOperationsOrganization;
import Business.Role.OrganizerRole;
import Business.UserAccount.UserAccount;
import Model.Event;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.TicketingAgentRole.ManageTicketingJPanel;


/**
 *
 * @author zhangdi
 */
public class EventManagementJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private OrganizerRole organizerRole;
    private OrganizerEnterprise enterprise;
    private Organization organization;
    private UserAccount useraccount;
    private List<Event> eventList = new ArrayList<>();

    /**
     * Creates new form EventManagementJPanel
     */
    public EventManagementJPanel(JPanel upc, UserAccount ua, OrganizerEnterprise enterprise, Organization org) {
        initComponents(); 
        this.userProcessContainer = upc;
        this.useraccount=ua;
        this.enterprise = enterprise; 
        this.organization=org;
       
        
        if (enterprise == null) {
            System.out.println("Error: Enterprise is null before calling EventManagementJPanel.");
        } else {
            System.out.println("Enterprise is valid: " + enterprise.getClass().getName());
        }
        
        setTicketingAgentColumnEditor();

        refreshTable();
    }
    
     private void setTicketingAgentColumnEditor() {
        JComboBox<String> comboBox = new JComboBox<>();
        List<UserAccount> ticketingAgents = getTicketingAgents();
        for (UserAccount ua : ticketingAgents) {
            comboBox.addItem(ua.getUsername());
        }

        tblEvent.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(comboBox));
    }
     
     private List<UserAccount> getTicketingAgents() {
    List<UserAccount> ticketingAgents = new ArrayList<>();
    for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
        // 检查组织类型而不是名字
        if (org instanceof TicketingOperationsOrganization) {
            ticketingAgents.addAll(org.getUserAccountDirectory().getUserAccountList());
        }
    }
    return ticketingAgents;
}



    
    public void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) tblEvent.getModel();
        model.setRowCount(0);
        eventList.clear(); 
  

        if (useraccount.getRole() instanceof OrganizerRole organizerRole) {
        List<Event> eventCatalog = organizerRole.getEventCatalog();

        if (eventCatalog != null) {
            for (Event e : eventCatalog) {
                eventList.add(e);
                Object row[] = new Object[8];
                row[0] = e.getEventName();
                row[1] = e.getEventDate();
                row[2] = e.getEventTime();
                row[3] = e.getEventDescription();
                row[4] = "";
                row[5] = e.getVenue();
                row[6] = e.getStatus();
                row[7] = e.getTicketPrice();
                model.addRow(row);
            }
        } else {
            System.out.println("Error: Event catalog is null.");
        }
    } else {
        System.out.println("Error: UserAccount's role is not OrganizerRole.");
    }
  }
    
    // 新增方法：发送 WorkRequest
private void sendWorkRequest(int selectedRow, String selectedAgentUsername) {
    Event selectedEvent = eventList.get(selectedRow);
    if (selectedEvent == null) {
        JOptionPane.showMessageDialog(this, "Error: Unable to retrieve event details.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // 构建 WorkRequest 信息
    Object[] workRequest = new Object[7];
    workRequest[0] = selectedEvent.getEventName(); // Performance Name
    workRequest[1] = useraccount.getUsername();   // Sender
    workRequest[2] = selectedAgentUsername;       // Receiver
    workRequest[3] = "Pending";                   // Status
    workRequest[4] = "";                          // Remark
    workRequest[5] = selectedEvent.getTicketPrice(); // Suggested Price
    workRequest[6] = "";                          // Actual Price

    // 这里需要调用 TicketingAgent 的 UI 刷新方法，模拟将 WorkRequest 发送到对方的队列
    ManageTicketingJPanel.addWorkRequest(workRequest);
    JOptionPane.showMessageDialog(this, "Request sent to " + selectedAgentUsername, "Success", JOptionPane.INFORMATION_MESSAGE);
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
        jButton1 = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        tblEvent = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSearchEvent = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnRequestTicket = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel1.setText("Event Management");

        jButton1.setText("<<Back");

        tblEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Event Name", "Date", "Time", "Description", "Select Ticketing Agent", "Venue", "Status", "Suggested Price"
            }
        ));
        ScrollPane.setViewportView(tblEvent);

        btnCreate.setText("Create New Event");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnRequest.setText("Request Venue");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Event");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Search Event:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRequestTicket.setText("Request Ticket");
        btnRequestTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(42, 42, 42)
                        .addComponent(btnRequest)
                        .addGap(46, 46, 46)
                        .addComponent(btnDelete)
                        .addGap(33, 33, 33)
                        .addComponent(btnRequestTicket))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(324, 324, 324)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearchEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnRequest)
                    .addComponent(btnDelete)
                    .addComponent(btnRequestTicket))
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateNewEventJPanel cejp = new CreateNewEventJPanel(userProcessContainer, useraccount);
        userProcessContainer.add("CreateNewEventJPanel", cejp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow(); // 假设事件表格名为 tblEvent
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select an event to request a venue.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Event selectedEvent = (Event) tblEvent.getValueAt(selectedRow, 0); 
        Event selectedEvent = eventList.get(selectedRow);
        if (selectedEvent == null) {
            JOptionPane.showMessageDialog(this, "Error: Unable to retrieve event details.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 跳转到 RequestVenueJPanel，并传递选中的事件对象
        RequestVenueJPanel requestVenuePanel = new RequestVenueJPanel(userProcessContainer, useraccount, enterprise, selectedEvent);
        userProcessContainer.add("RequestVenueJPanel", requestVenuePanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String keyword = txtSearchEvent.getText();
        if (keyword == null || keyword.trim().isEmpty()) {
            refreshTable();
        } else {
            searchEvent(keyword);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRequestTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestTicketActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();

    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select an event.", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // 直接从 JTable 的 Model 获取选择的 Ticketing Agent
    String selectedAgentUsername = (String) tblEvent.getValueAt(selectedRow, 4);

    if (selectedAgentUsername == null || selectedAgentUsername.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a Ticketing Agent.", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // 发送 WorkRequest
    sendWorkRequest(selectedRow, selectedAgentUsername);
       
    }//GEN-LAST:event_btnRequestTicketActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnRequestTicket;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTable tblEvent;
    private javax.swing.JTextField txtSearchEvent;
    // End of variables declaration//GEN-END:variables
    private void searchEvent(String keyword) {
        DefaultTableModel model = (DefaultTableModel) tblEvent.getModel();
        model.setRowCount(0);

        if (useraccount.getRole() instanceof OrganizerRole organizerRole) {
            List<Event> eventCatalog = organizerRole.getEventCatalog();

            for (Event e : eventCatalog) {
                if (e.getEventName() != null && e.getEventName().toLowerCase().contains(keyword.toLowerCase())) {
                    Object row[] = new Object[8];
                    row[0] = e.getEventName();
                    row[1] = e.getEventDate();
                    row[2] = e.getEventTime();
                    row[3] = e.getEventDescription();
                    row[4] = "";
                    row[5] = e.getVenue();
                    row[6] = e.getStatus();
                    row[7] = e.getTicketPrice();

                    model.addRow(row);
                }
            }
        } else {
            System.out.println("OrganizerRole or Event catalog is null.");
        }
    }
}
