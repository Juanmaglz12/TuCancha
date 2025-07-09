package com.jupilu.TuCancha.Service;

import com.jupilu.TuCancha.Repository.ReservationRepository;
import com.jupilu.TuCancha.model.Field;
import com.jupilu.TuCancha.model.Reservation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface ReservationI {

    Reservation findReservation(Long fieldId, LocalDate date, LocalTime time);

    String saveReservation(Reservation reservationDto);

    List<Reservation> findAll();

}
