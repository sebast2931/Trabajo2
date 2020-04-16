package com.example.Trabajo1.time;

import com.example.Trabajo1.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Minutos {

    private final Integer value;

    private Minutos(Integer value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value >= 0 && value <= 59);
        this.value = value;
    }
}
