/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Organization;

import Business.Role.OrganizerRole;
import Business.Role.Role;
import Business.Role.VenueManagerRole;
import java.util.ArrayList;

/**
 *
 * @author yutingbai
 */
public class VenueOperationsOrganization extends Organization{

    public VenueOperationsOrganization() {
        super(Organization.Type.VenueOperations.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VenueManagerRole());
        return roles;
    }
     
}
