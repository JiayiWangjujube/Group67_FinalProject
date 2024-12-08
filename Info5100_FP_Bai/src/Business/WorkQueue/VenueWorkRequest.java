/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author zhangdi
 */
public class VenueWorkRequest extends WorkRequest {
    private String eventName;       // 事件名称
    private String eventDate;       // 事件日期
    private String eventTime;       // 事件时间
    private int maxcap;             // 最大容量
    private String venue;           // 场地
    private String specialRequest;  // 特殊请求

    // 默认构造方法
    public VenueWorkRequest() {
    }

    // 带参数的构造方法
    public VenueWorkRequest(String eventName, String eventDate, String eventTime, int maxcap, String venue, String specialRequest) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.maxcap = maxcap;
        this.venue = venue;
        this.specialRequest = specialRequest;
    }

    // Getter 和 Setter 方法
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

    public int getMaxcap() {
        return maxcap;
    }

    public void setMaxcap(int maxcap) {
        this.maxcap = maxcap;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    @Override
    public String toString() {
        return eventName; // 表示对象时返回事件名称
    }
}