package com.jupilu.TuCancha.Service;

import com.jupilu.TuCancha.Repository.FieldRepository;
import com.jupilu.TuCancha.Repository.ReservationRepository;
import com.jupilu.TuCancha.model.Player;
import com.jupilu.TuCancha.model.Reservation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@ApplicationScope
public class ReservationImp implements ReservationI {

    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private FieldRepository fieldRepository;

    @Override
    public String saveReservation(Reservation reservation) {
        if (reservation.getField() != null && reservation.getField().getId() != null) {
            Long fieldId = reservation.getField().getId();
            reservation.setField(fieldRepository.findById(fieldId)
                    .orElseThrow(() -> new RuntimeException("Field not found")));
        }
        reservationRepository.save(reservation);
        return "Reserva guardada";
    }

    @Override
    public Reservation findReservation(Long fieldId, LocalDate date, LocalTime time) {
        return reservationRepository.findByFieldIdAndDateAndInitialHour(fieldId, date, time);
    }

    @Override
    public List<Reservation> findAll(){
        return reservationRepository.findAll();
    }

}
