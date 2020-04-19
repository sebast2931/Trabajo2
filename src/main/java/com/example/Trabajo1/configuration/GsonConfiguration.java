package com.example.Trabajo1.configuration;

import com.example.Trabajo1.serialization.HoraAdapter;
import com.example.Trabajo1.serialization.MinutosAdapter;
import com.example.Trabajo1.serialization.SegundosAdapter;
import com.example.Trabajo1.serialization.ValueAdapter;
import com.example.Trabajo1.time.Hora;
import com.example.Trabajo1.time.Minutos;
import com.example.Trabajo1.time.Segundos;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GsonConfiguration {

    @Bean
    public Gson gson(){
        return new GsonBuilder()
                .registerTypeAdapter(Hora.class, new ValueAdapter<>(Hora::of))
                .registerTypeAdapter(Minutos.class, new ValueAdapter<>(Minutos::of))
                .registerTypeAdapter(Segundos.class, new ValueAdapter<>(Segundos::of))
                .create();
    }
}
