package com.example.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.time.*;
import java.util.*;

@Getter
@Setter
@Entity
public class Show extends BaseModel{

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // @ManyToOne
    // private Movie movie;

    @ManyToOne
    private Auditorium auditorium;

    // private List<ShowSeats> showseats;


    
}
/*

        show        Movie
        1             1
        M             1  
        M-->1

        show        Auditorium
          1             1
          M             1
        M-->1
 * 
 * 
 */