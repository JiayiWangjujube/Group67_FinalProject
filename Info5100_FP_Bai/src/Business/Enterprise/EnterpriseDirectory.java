/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author yutingbai
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Marketing){
            enterprise=new MarketingEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type==Enterprise.EnterpriseType.Organizer) {
            enterprise=new OrganizerEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type==Enterprise.EnterpriseType.Venue) {
            enterprise=new VenueEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type==Enterprise.EnterpriseType.Ticketing) {
            enterprise=new TicketingEnterprise(name);
            enterpriseList.add(enterprise);
        } 
        return enterprise;
    }
}
