package com.jupilu.TuCancha.Repository;

import com.jupilu.TuCancha.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository <Player, Long> {

    Player findPlayerByCelNumber(String celNumber);

}
