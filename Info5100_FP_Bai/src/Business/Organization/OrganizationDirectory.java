/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author yutingbai
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.ConcertPlanning.getValue())){
            organization = new ConcertPlanningOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.VenueOperations.getValue())) {
        organization = new VenueOperationsOrganization();
        organizationList.add(organization);
    } else if (type.getValue().equals(Organization.Type.SecurityServices.getValue())) {
        organization = new SecurityServicesOrganization();
        organizationList.add(organization);
    } else if (type.getValue().equals(Organization.Type.TicketingOperations.getValue())) {
        organization = new TicketingOperationsOrganization();
        organizationList.add(organization);
    } else if (type.getValue().equals(Organization.Type.CustomerService.getValue())) {
        organization = new CustomerServiceOrganization();
        organizationList.add(organization);
    } else if (type.getValue().equals(Organization.Type.MerchandiseRetail.getValue())) {
        organization = new MerchandiseRetailOrganization();
        organizationList.add(organization);
    } else if (type.getValue().equals(Organization.Type.CustomerOrganization.getValue())) {
        organization = new CustomerOrganization();
        organizationList.add(organization);
    }
    else {
        System.out.println("No matching organization type found for: " + type.getValue());
    }

        return organization;
    }
}