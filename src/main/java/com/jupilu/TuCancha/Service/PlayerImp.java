package com.jupilu.TuCancha.Service;

import com.jupilu.TuCancha.Repository.PlayerRepository;
import com.jupilu.TuCancha.model.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
public class PlayerImp implements PlayerI {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public String savePlayer(Player player) {
        playerRepository.save(player);
        return "Jugador guardado";
    }

    @Override
    public Player findPlayerByCelNumber(String celNumber) {
        return playerRepository.findPlayerByCelNumber(celNumber);
    }
}
