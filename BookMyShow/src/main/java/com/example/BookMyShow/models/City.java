package com.example.BookMyShow.models;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name = "City")
public class City extends BaseModel{
    private String cityName;

    @OneToMany
    private List<Theatre> theatres;

}
