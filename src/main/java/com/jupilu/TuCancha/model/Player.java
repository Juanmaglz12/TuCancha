package com.jupilu.TuCancha.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String celNumber;

    @OneToMany(mappedBy = "player")
    private List<Reservation> reservations;

    public Player() {
    }


}
