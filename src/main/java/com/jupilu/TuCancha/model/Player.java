package com.jupilu.TuCancha.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    @Column(unique = true)
    private String celNumber;

    @OneToMany(mappedBy = "player")
    private List<Reservation> reservations;

    public Player() {
    }


}
