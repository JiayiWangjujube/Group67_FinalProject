/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 粥嘚嘚
 */
public class Ticket {

    private String ticketName;
    private double price;
    private int modelNumber;
    private int avail;

    private static int count = 0;

    @Override
    public String toString() {
        return ticketName; //To change body of generated methods, choose Tools | Templates.
    }

    public Ticket() {
        count++;
        modelNumber = count;
    }

    public Ticket(String prodName, int modelNumber, double price, int avail) {
        this.ticketName = prodName;
        this.modelNumber = modelNumber;
        this.price = price;
        this.avail = avail;
    }
    
    public String getProdName() {
        return ticketName;
    }

    public void setProdName(String prodName) {
        this.ticketName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    
    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

}
