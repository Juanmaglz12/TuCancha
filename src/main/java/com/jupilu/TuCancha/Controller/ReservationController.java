package com.jupilu.TuCancha.Controller;


import com.jupilu.TuCancha.Service.ReservationImp;
import com.jupilu.TuCancha.model.Reservation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationImp reservationImp;

    @GetMapping("/getAllReservations")
    public ResponseEntity<List<Reservation>> findAll() {
        List<Reservation> reservations = reservationImp.findAll();
        return ResponseEntity.ok(reservations);
    }

    @GetMapping("/findReservation")
    public ResponseEntity<Reservation> findReservation(
            @RequestParam Long fieldId,
            @RequestParam LocalDate date,
            @RequestParam LocalTime time
    ) {
        Reservation reservation = reservationImp.findReservation(fieldId, date, time);
        if (reservation != null) {
            return new ResponseEntity<>(reservation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/saveReservations")
    public ResponseEntity<String> saveReservations(@RequestBody List<Reservation> reservations) {
        reservations.forEach(reservationImp::saveReservation);
        return ResponseEntity.status(HttpStatus.CREATED).body("Reservas creadas");
    }

}
