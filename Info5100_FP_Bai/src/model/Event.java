/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

/**
 *
 * @author zhangdi
 */
public class Event {
    private static int idCounter = 1; // 静态计数器，用于生成唯一 ID
    private int id; 
    private String eventName;
    private String eventDate;
    private String eventTime;
    private String eventDescription;
    private double ticketPrice;
    private String venue;
    private String status;
    
    public Event(){
         this.id = idCounter++; // 每次创建新事件时，自动生成唯一 ID
    }
    
    
    public Event(String eventName, String eventDate, String eventTime, String eventDescription, double ticketPrice, String venue, String status) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventDescription = eventDescription;
        this.ticketPrice = ticketPrice;
        this.venue = venue;
        this.status = status;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    // hashCode 方法
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // toString 方法：返回事件的简要信息
    @Override
    public String toString() {
        return String.format("%s (%s, %s)", eventName, eventDate, eventTime);
    }

}
