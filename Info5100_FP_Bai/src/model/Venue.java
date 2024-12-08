/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author zhangdi
 */
public class Venue {
    private String name;
    private int capacity;
    private String status;
    private String availability;
    private int usedTimes;

    public Venue(String name, int capacity, String status, String availability, int usedTimes) {
        this.name = name;
        this.capacity = capacity;
        this.status = status;
        this.availability = availability;
        this.usedTimes = usedTimes;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", status='" + status + '\'' +
                ", availability='" + availability + '\'' +
                ", usedTimes=" + usedTimes +
                '}';
    }
}