package com.jupilu.TuCancha.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Field {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    private String fieldName;

    @Setter
    @Getter
    @Column(nullable = false)
    private boolean active;

    @OneToMany(mappedBy = "field")
    private List<Reservation> reservations;

    public Field() {
    }


}
