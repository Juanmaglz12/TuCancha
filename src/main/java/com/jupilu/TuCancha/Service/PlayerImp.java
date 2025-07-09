package com.jupilu.TuCancha.Service;

import com.jupilu.TuCancha.Repository.PlayerRepository;
import com.jupilu.TuCancha.model.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerImp implements PlayerI {

    private final PlayerRepository playerRepository;

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
