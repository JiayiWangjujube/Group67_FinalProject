/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yutingbai
 */
public class TicketingEnterprise extends Enterprise {

    public TicketingEnterprise(String name){
        super(name,EnterpriseType.Ticketing);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
