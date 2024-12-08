/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CustomerOrganization;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Customer.CustomerWorkAreaJPanel;

/**
 *
 * @author yutingbai
 */
public class CustomerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//    if (enterprise == null) {
//        enterprise = business.getCustomerEnterprise(); // 获取默认的 GeneralCustomerEnterprise
//    }
    return new CustomerWorkAreaJPanel(userProcessContainer, enterprise, account, (CustomerOrganization) organization);
}
    
    
}
