/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Organization;

import Business.Role.CustomerServiceRole;
import Business.Role.OrganizerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yutingbai
 */
public class CustomerServiceOrganization extends Organization{

    public CustomerServiceOrganization() {
        super(Organization.Type.CustomerService.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CustomerServiceRole());
        return roles;
    }
     
}
