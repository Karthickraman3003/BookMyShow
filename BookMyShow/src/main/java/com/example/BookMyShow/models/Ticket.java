package com.example.BookMyShow.models;


import com.example.BookMyShow.models.constants.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity(name = "ticket")
public class Ticket extends BaseModel {

    private LocalDateTime timeOfBooking;

    private double totalAmount;

    @ManyToOne
    private Show show;

    @OneToMany
    private List<ShowSeats> showSeats;


    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

}

/*

    Ticket      Show
     1          1
     M           1

     Ticket     ShowSeats

     1              M
     1               1
 */
