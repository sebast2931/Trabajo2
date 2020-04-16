package com.example.Trabajo1.serialization;

import com.example.Trabajo1.time.Segundos;
import com.google.gson.*;

import java.lang.reflect.Type;

public class SegundosAdapter implements JsonSerializer<Segundos>, JsonDeserializer<Segundos> {
    @Override
    public Segundos deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Integer value = jsonElement.getAsInt();
        return Segundos.of(value);
    }

    @Override
    public JsonElement serialize(Segundos segundos, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer value = segundos.getValue();
        return new JsonPrimitive(value);
    }
}
