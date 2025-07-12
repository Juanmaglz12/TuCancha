package com.jupilu.TuCancha.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Field {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fieldName;

    @Column(nullable = false)
    private boolean active;

    @OneToMany(mappedBy = "field")
    private List<Reservation> reservations;

    public Field() {
    }


}
