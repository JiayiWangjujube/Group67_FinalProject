/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Organization;

import Business.Role.OrganizerRole;
import Business.Role.RetailerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yutingbai
 */
public class MerchandiseRetailOrganization extends Organization{

    public MerchandiseRetailOrganization() {
        super(Organization.Type.MerchandiseRetail.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RetailerRole());
        return roles;
    }
     
}
