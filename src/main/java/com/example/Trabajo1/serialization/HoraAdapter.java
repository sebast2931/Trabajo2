package com.example.Trabajo1.serialization;

import com.example.Trabajo1.time.Hora;
import com.google.gson.*;
import java.lang.reflect.Type;


public class HoraAdapter implements JsonSerializer<Hora>, JsonDeserializer<Hora> {
    @Override
    public Hora deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Integer value = jsonElement.getAsInt();
        return Hora.of(value);
    }

    @Override
    public JsonElement serialize(Hora hora, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer value = hora.getValue();

        return new JsonPrimitive(value);
    }
}
