package com.example.Trabajo1.controllers;


import com.example.Trabajo1.time.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

import static com.example.Trabajo1.time.TimeUnit.HourTotal;

@RequestMapping("/api/v1/time")
@RestController
public class TimeController {

    @GetMapping("/Hora")
    private TimeResponse getHora(){

        LocalTime now = LocalTime.now();
        Hora hora = Hora.of(now.getHour());
        Minutos minutos = Minutos.of((now.getMinute()));
        Segundos segundos = Segundos.of(now.getSecond());

        Long hour = TimeUnit.HourTotal(TimeUnit.HOURS,now);
        Long minute = TimeUnit.HourTotal(TimeUnit.MINUTES,now);
        Long second = TimeUnit.HourTotal(TimeUnit.SECONDS,now);
        Long milisegundos = TimeUnit.HourTotal(TimeUnit.MILLISECONDS,now);

        return TimeResponse.from(hora, minutos, segundos, minute.intValue());

    }
}
