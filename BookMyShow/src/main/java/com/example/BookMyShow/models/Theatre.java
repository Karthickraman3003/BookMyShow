package com.example.BookMyShow.models;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "theatre")
public class Theatre extends BaseModel{
    
    private String name;
    private String address;

    @OneToMany
    private List<Auditorium> auditoriums;
}
