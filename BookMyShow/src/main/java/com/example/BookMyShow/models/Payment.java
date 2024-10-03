package com.example.BookMyShow.models;


import com.example.BookMyShow.models.constants.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

@Getter
@Setter
@Entity(name = "payment")
public class Payment extends BaseModel{

    private LocalDateTime ticketBookingTime;

    private double amount;

    private String referenceId;

    @ManyToOne
    private Ticket ticket;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private ParameterMode parameterMode;


}


/*

        Payment         Ticket
        1                  1
        M                  1
 */
