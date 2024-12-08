/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Organization;

import Business.Role.OrganizerRole;
import Business.Role.Role;
import Business.Role.TicketingAgentRole;
import java.util.ArrayList;

/**
 *
 * @author yutingbai
 */
public class TicketingOperationsOrganization extends Organization{

    public TicketingOperationsOrganization() {
        super(Organization.Type.TicketingOperations.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TicketingAgentRole());
        return roles;
    }
     
}
