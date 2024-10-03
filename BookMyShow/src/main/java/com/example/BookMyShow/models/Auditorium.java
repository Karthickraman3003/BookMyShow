package com.example.BookMyShow.models;

import java.util.*;

import com.example.BookMyShow.models.constants.AuditoriumFeature;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter; 

@Getter
@Setter
@Entity(name = "auditorium")
public class Auditorium extends BaseModel{

    private String name;

    @OneToMany
    private List<Show> shows;

    private int capacity;

     @OneToMany
     private List<Seat> seats;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeature> auditoriumFeatures;



    
}
