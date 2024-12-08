/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.OrganizerEnterprise;
import Business.Organization.ConcertPlanningOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Model.Event;
import Model.TestData;
import java.util.List;
import javax.swing.JPanel;
import ui.Organizer.OrganizerWorkAreaJPanel;

/**
 *
 * @author yutingbai
 */

public class OrganizerRole extends Role {
     private List<Event> eventCatalog; // 当前 Organizer 管理的所有事件
    private UserAccount currentUser; 

    public OrganizerRole() {
        this.type = RoleType.Organizer;
        this.eventCatalog = TestData.generateTestEvents();
    }

    public List<Event> getEventCatalog() {
        return eventCatalog;
    }

    public UserAccount getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(UserAccount currentUser) {
        this.currentUser = currentUser;
    }

    public Event createEvent(String eventName, String eventDate, String eventTime, String eventDescription, double ticketPrice, String venue, String status) {
        Event event = new Event(eventName, eventDate, eventTime, eventDescription, ticketPrice, venue, status);
        eventCatalog.add(event); // 添加到事件目录
        return event;
    }

    // 删除事件
    public void deleteEvent(Event event) {
        eventCatalog.remove(event);
    }

    // 查找事件（通过 ID）
    public Event findEventById(int eventId) {
        for (Event event : eventCatalog) {
            if (event.getId() == eventId) {
                return event;
            }
        }
        return null;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        this.type = RoleType.Organizer;
        return new OrganizerWorkAreaJPanel(userProcessContainer, account, (ConcertPlanningOrganization) organization, (OrganizerEnterprise) enterprise, business);
    }
    
}