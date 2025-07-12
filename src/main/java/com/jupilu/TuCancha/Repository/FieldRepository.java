package com.jupilu.TuCancha.Repository;

import com.jupilu.TuCancha.model.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends JpaRepository <Field, Long> {



}


