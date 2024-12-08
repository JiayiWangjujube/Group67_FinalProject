/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Role;

/**
 *
 * @author yutingbai
 */
public class RetailerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CustomerServiceWorkAreaJPanel(userProcessContainer, account, (CustomerServiceOrganization)organization, enterprise);
    }
}
