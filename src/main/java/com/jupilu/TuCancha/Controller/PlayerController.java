package com.jupilu.TuCancha.Controller;

import com.jupilu.TuCancha.Service.PlayerI;
import com.jupilu.TuCancha.Service.PlayerImp;
import com.jupilu.TuCancha.model.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerController {

    private PlayerI playerI;

    @GetMapping("/findPlayerByCelNumber/{celNumber}")
    public ResponseEntity<Player> findPlayerByCelNumber(@PathVariable String celNumber){
        Player player = playerI.findPlayerByCelNumber(celNumber);
        if (player != null){
            return new ResponseEntity<>(player, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/savePlayer")
    public ResponseEntity<String> savePlayer(@RequestBody Player player){
        String mensaje = playerI.savePlayer(player);
        return new ResponseEntity<>(mensaje, HttpStatus.CREATED);
    }

}
