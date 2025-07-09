package com.jupilu.TuCancha.Service;

import com.jupilu.TuCancha.model.Player;

public interface PlayerI {

    Player findPlayerByCelNumber(String celNumber);

    String savePlayer(Player playerDto);
}
