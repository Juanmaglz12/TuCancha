package com.jupilu.TuCancha.Service;

import com.jupilu.TuCancha.model.Field;
import com.jupilu.TuCancha.model.Player;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
public interface FieldI {

    Field findField(Long id);

    String saveField(Field fieldDto);

    boolean logicDelete(Long fieldNumber);
}
