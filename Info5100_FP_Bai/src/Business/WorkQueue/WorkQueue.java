/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public List<VenueWorkRequest> getVenueWorkRequestList() {
        List<VenueWorkRequest> venueWorkRequests = new ArrayList<>();
        for (WorkRequest workRequest : workRequestList) {
            if (workRequest instanceof VenueWorkRequest venueWorkRequest) {
                venueWorkRequests.add(venueWorkRequest);
            }
        }
        return venueWorkRequests;
    }
}