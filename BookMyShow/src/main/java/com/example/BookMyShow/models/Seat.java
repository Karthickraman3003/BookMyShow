package com.example.BookMyShow.models;


import com.example.BookMyShow.models.constants.SeatStatus;
import com.example.BookMyShow.models.constants.SeatType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="seat")
public class Seat extends BaseModel{

    private int row_num;
    private int col_num;

    private String seatNumber;


    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
