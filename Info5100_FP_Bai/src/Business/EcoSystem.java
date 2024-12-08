/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business;

import Business.Enterprise.CustomerEnterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author yutingbai
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    //private CustomerEnterprise customerEnterprise;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
//    public CustomerEnterprise getCustomerEnterprise() {
//        return customerEnterprise;
//    }
//
//    public void setCustomerEnterprise(CustomerEnterprise customerEnterprise) {
//        this.customerEnterprise = customerEnterprise;
//    }
//    
//    
//    private void initializeCustomerEnterprise() {
//        customerEnterprise = new CustomerEnterprise("Default Customer Enterprise");
//
//        
//        CustomerOrganization customerOrganization = new CustomerOrganization();
//        customerEnterprise.getOrganizationDirectory().getOrganizationList().add(customerOrganization);
//
//    }
//    
}
