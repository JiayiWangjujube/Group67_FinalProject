/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 粥嘚嘚
 */
public class TicketCatalog {

    private List<Ticket> ticketCatalog;

    public TicketCatalog() {
        ticketCatalog = new ArrayList<Ticket>();
    }

    public List<Ticket> getTicketCatalog() {
        return ticketCatalog;
    }

    public Ticket addTicket() {
        Ticket t = new Ticket();
        ticketCatalog.add(t);
        return t;
    }

    public void removeTicket(Ticket t) {
        ticketCatalog.remove(t);
    }

   
}
