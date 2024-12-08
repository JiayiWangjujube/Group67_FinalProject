/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhangdi
 */
public class EventCatalog {
     private List<Event> eventCatalog;

    public EventCatalog() {
        eventCatalog = new ArrayList<Event>();
    }

    public List<Event> getEventcatalog() {
        return eventCatalog;
    }

    public Event addEvent() {
        Event e = new Event();
        eventCatalog.add(e);
        return e;
    }

    public void removeEvent(Event e) {
        eventCatalog.remove(e);
    }

    public Event addEvent(String eventName, String eventDate, String eventTime, String eventDescription, double ticketPrice, String venue, String status) {
        Event event = new Event(eventName, eventDate, eventTime, eventDescription, ticketPrice, venue, status);
        eventCatalog.add(event);
        return event;
    }


    // 根据 ID 搜索事件
    public Event searchEvent(int id) {
        for (Event event : eventCatalog) {
            if (event.getId() == id) {
                return event;
            }
        }
        return null; // 未找到事件时返回 null
    }

    // 更新事件的状态
    public boolean updateEventStatus(int id, String newStatus) {
        Event event = searchEvent(id);
        if (event != null) {
            event.setStatus(newStatus);
            return true;
        }
        return false; // 未找到事件，更新失败
    }

    // 获取所有正在进行中的事件
    public List<Event> getOngoingEvents() {
        List<Event> ongoingEvents = new ArrayList<>();
        for (Event event : eventCatalog) {
            if ("Ongoing".equalsIgnoreCase(event.getStatus())) {
                ongoingEvents.add(event);
            }
        }
        return ongoingEvents;
    }
}
