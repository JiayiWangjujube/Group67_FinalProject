/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Organization;

import Business.Role.OrganizerRole;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author yutingbai
 */
public class VenueOperationsOrganization extends Organization{
    private WorkQueue workQueue;

    public VenueOperationsOrganization() {
        super("Venue Manager Organization");
        this.workQueue = new WorkQueue();
    }

    @Override
    public WorkQueue getWorkQueue() {
        return workQueue;
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OrganizerRole());
        return roles;
    }
     
}
