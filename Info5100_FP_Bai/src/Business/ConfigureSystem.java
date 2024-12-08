/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business;

import Business.Employee.Employee;
import Business.Enterprise.CustomerEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.Role.CustomerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author yutingbai
 */
public class ConfigureSystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        Network concertSystem = new Network();
        concertSystem.setName("Concert System Network");
        system.getNetworkList().add(concertSystem);
        
//        // Organizer Enterprise
//        Enterprise organizerEnterprise = concertSystem.getEnterpriseDirectory().createAndAddEnterprise("Organizer Enterprise", Enterprise.EnterpriseType.Organizer);
//        organizerEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.ConcertPlanning);
//
//        // Venue Enterprise
//        Enterprise venueEnterprise = concertSystem.getEnterpriseDirectory().createAndAddEnterprise("Venue Enterprise", Enterprise.EnterpriseType.Venue);
//        venueEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.VenueOperations);
//        venueEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.SecurityServices);
//
//        // Ticketing Enterprise
//        Enterprise ticketingEnterprise = concertSystem.getEnterpriseDirectory().createAndAddEnterprise("Ticketing Enterprise", Enterprise.EnterpriseType.Ticketing);
//        ticketingEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.TicketingOperations);
//        ticketingEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.CustomerService);
//
//        // Marketing Enterprise
//        Enterprise marketingEnterprise = concertSystem.getEnterpriseDirectory().createAndAddEnterprise("Marketing Enterprise", Enterprise.EnterpriseType.Marketing);
//        marketingEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.MerchandiseRetail);
        

        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("1", "1", employee, new SystemAdminRole());
        UserAccount customer = system.getUserAccountDirectory().createUserAccount("c", "c", employee, new CustomerRole());

        CustomerEnterprise customerEnterprise = new CustomerEnterprise("Customer Enterprise");
        system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().add(customerEnterprise);
        
        // 创建 CustomerServiceOrganization 并添加到 CustomerEnterprise
        CustomerOrganization customerOrganization = new CustomerOrganization();
        customerEnterprise.getOrganizationDirectory().getOrganizationList().add(customerOrganization);
        
        // 创建 Customer 用户并添加到 CustomerServiceOrganization
        Employee customerEmployee = system.getEmployeeDirectory().createEmployee("Customer");
        customerOrganization.getUserAccountDirectory().createUserAccount("c", "c", customerEmployee, new CustomerRole());

        return system;
    }
    
}
