package com.example.BookMyShow.models;

import java.util.*;

import org.hibernate.mapping.List;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{

    private String name;

    private List<Show> shows;

    private int capacity;

    private List<Seat> seats;

    private List<AuditoriumFeature> auditoriumFeatures;



    
}
