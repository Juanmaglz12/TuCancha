package com.jupilu.TuCancha.Repository;

import com.jupilu.TuCancha.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;

public interface ReservationRepository extends JpaRepository <Reservation, Long> {


    Reservation findByFieldIdAndDateAndInitialHour(Long fieldId, LocalDate date, LocalTime initialHour);

}
