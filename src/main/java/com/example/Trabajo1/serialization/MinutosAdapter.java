package com.example.Trabajo1.serialization;

import com.example.Trabajo1.time.Minutos;
import com.google.gson.*;

import java.lang.reflect.Type;

public class MinutosAdapter implements JsonSerializer<Minutos>, JsonDeserializer<Minutos> {
    @Override
    public Minutos deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Integer value = jsonElement.getAsInt();
        return Minutos.of(value);
    }

    @Override
    public JsonElement serialize(Minutos minutos, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer value = minutos.getValue();
        return new JsonPrimitive(value);

    }
}
