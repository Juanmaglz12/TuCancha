package com.jupilu.TuCancha.Repository;

import com.jupilu.TuCancha.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;

@Repository
public interface ReservationRepository extends JpaRepository <Reservation, Long> {


    Reservation findByFieldIdAndDateAndInitialHour(Long fieldId, LocalDate date, LocalTime initialHour);

}
