package com.jupilu.TuCancha.Service;

import com.jupilu.TuCancha.model.Field;
import com.jupilu.TuCancha.model.Player;

public interface FieldI {

    Field findField(Long id);

    String saveField(Field fieldDto);

    boolean logicDelete(Long fieldNumber);
}
