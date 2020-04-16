package com.example.Trabajo1.time;

import com.example.Trabajo1.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Hora {

    private final Integer value;

    private Hora(Integer value) {
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value >= 0 && value <= 23);
        this.value = value;
    }

}
