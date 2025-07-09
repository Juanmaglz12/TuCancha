package com.jupilu.TuCancha.Service;

import com.jupilu.TuCancha.Repository.FieldRepository;
import com.jupilu.TuCancha.model.Field;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FieldImp implements FieldI {

    private final FieldRepository fieldRepository;

    @Override
    public String saveField(Field field) {
        fieldRepository.save(field);
        return "Cancha guardada";
    }

    @Override
    public Field findField(Long id) {
        Optional<Field> optionalField = fieldRepository.findById(id);
        return optionalField.orElse(null);
    }

    public boolean logicDelete(Long id) {
        Optional<Field> optionalField = fieldRepository.findById(id);
        if (optionalField.isPresent()) {
            Field field = optionalField.get();
            field.setActive(false);
            fieldRepository.save(field);
            return true;
        }
        return false;
    }

}
