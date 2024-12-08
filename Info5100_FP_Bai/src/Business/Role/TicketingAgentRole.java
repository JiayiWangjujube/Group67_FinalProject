/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TicketingOperationsOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.TicketingAgentRole.TicketingWorkAreaJPanel;

/**
 *
 * @author yutingbai
 */
public class TicketingAgentRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TicketingWorkAreaJPanel(userProcessContainer, account, (TicketingOperationsOrganization)organization, enterprise);
    }
}

