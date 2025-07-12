package com.jupilu.TuCancha.Controller;

import com.jupilu.TuCancha.Service.FieldI;
import com.jupilu.TuCancha.Service.FieldImp;
import com.jupilu.TuCancha.model.Field;
import com.jupilu.TuCancha.model.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/field")
public class FieldController {

    FieldI fieldI;

    @GetMapping("/findField/{id}")
    public ResponseEntity<Field> findFieldByFieldNumber(@PathVariable Long id){
        Field field = fieldI.findField(id);
        if (field != null){
            return new ResponseEntity<>(field, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/saveField")
    public ResponseEntity<String> saveField(@RequestBody Field field){
        String mensaje = fieldI.saveField(field);
        return new ResponseEntity<>(mensaje, HttpStatus.CREATED);
    }

    @DeleteMapping("/deactivateField/{id}")
    public ResponseEntity<String> deactivateField(@PathVariable Long id) {
        boolean success = fieldI.logicDelete(id);
        if (success) {
            return ResponseEntity.ok("Cancha eliminada exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("La cancha " + id + " no existe");
        }
    }
}
