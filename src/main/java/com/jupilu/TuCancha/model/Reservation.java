package com.jupilu.TuCancha.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    private LocalDate date;
    @Setter
    @Getter
    private LocalTime initialHour;
    @Setter
    @Getter
    private LocalTime endHour;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "field_id")
    private Field field;

    public Reservation() {
    }


}
