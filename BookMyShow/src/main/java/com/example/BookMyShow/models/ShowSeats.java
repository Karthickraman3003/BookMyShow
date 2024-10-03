package com.example.BookMyShow.models.constants;

import com.example.BookMyShow.models.BaseModel;
import com.example.BookMyShow.models.Seat;
import com.example.BookMyShow.models.Show;
import com.example.BookMyShow.models.constants.ShowSeatStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class ShowSeats extends BaseModel {

    private int price;

    @ManyToOne
    private Seat seat;
    @ManyToOne
    private Show show;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;









}
