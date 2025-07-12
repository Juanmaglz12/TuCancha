package com.jupilu.TuCancha.Service;

import com.jupilu.TuCancha.model.Player;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
public interface PlayerI {

    Player findPlayerByCelNumber(String celNumber);

    String savePlayer(Player playerDto);
}
