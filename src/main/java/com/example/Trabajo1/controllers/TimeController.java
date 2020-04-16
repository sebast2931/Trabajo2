package com.example.Trabajo1.controllers;


import com.example.Trabajo1.time.Hora;
import com.example.Trabajo1.time.Minutos;
import com.example.Trabajo1.time.Segundos;
import com.example.Trabajo1.time.TimeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RequestMapping("/api/v1/time")
@RestController
public class TimeController {

    @GetMapping("/Hora")
    private TimeResponse getHora(){
        LocalTime now = LocalTime.now();
        Hora hora = Hora.of(now.getHour());
        Minutos minutos = Minutos.of((now.getMinute()));
        Segundos segundos = Segundos.of(now.getSecond());

        return TimeResponse.from(hora, minutos, segundos);

    }
}
