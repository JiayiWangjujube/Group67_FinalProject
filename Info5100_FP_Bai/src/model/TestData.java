/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author zhangdi
 */
public class TestData {
    public static List<Event> generateTestEvents() {
        List<Event> events = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");


        // 添加测试事件
        events.add(new Event(
            "Music Concert",
            dateFormat.format(new Date()),// 当前日期
            "18:00",
            "A live music concert featuring famous bands.",
            50.0,
            "Stadium A",
            "Pending"
        ));

        events.add(new Event(
            "Art Exhibition",
            dateFormat.format(new Date()),
            "10:00",
            "An exhibition of modern art collections.",
            20.0,
            "Art Gallery B",
            "Pending"
        ));

        events.add(new Event(
            "Tech Conference",
            dateFormat.format(new Date()),
            "09:00",
            "A conference discussing the latest tech trends.",
            100.0,
            "Convention Center C",
            "Pending"
        ));

        return events;
    }
    
    
      public static List<Venue> generateTestVenues() {
        List<Venue> venues = new ArrayList<>();

        // 添加测试数据
        venues.add(new Venue(
            "Grand Concert Hall", // Name
            500,                  // Capacity
            "Available",          // Status
            "Yes",                // Availability
            10                    // Used Times
        ));

        venues.add(new Venue(
            "Stadium A",
            1000,
            "Booked",
            "No",
            25
        ));

        venues.add(new Venue(
            "Community Theater",
            300,
            "Under Maintenance",
            "No",
            5
        ));

        venues.add(new Venue(
            "Open Air Arena",
            800,
            "Available",
            "Yes",
            15
        ));

        return venues;
    }

}
