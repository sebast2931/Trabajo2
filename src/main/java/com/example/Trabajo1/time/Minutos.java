package com.example.Trabajo1.time;

import com.example.Trabajo1.common.Preconditions;
import com.example.Trabajo1.serialization.ValueSerializer;
import lombok.Value;

@Value(staticConstructor = "of")
public class Minutos implements ValueSerializer {

    private final Integer value;

    private Minutos(Integer value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value >= 0 && value <= 59);
        this.value = value;
    }

    @Override
    public Integer valueOf() {
        return value;
    }
}
