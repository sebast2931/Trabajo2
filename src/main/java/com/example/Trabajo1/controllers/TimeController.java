package com.example.Trabajo1.controllers;


import com.example.Trabajo1.Services.TimeServices;
import com.example.Trabajo1.time.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RequestMapping("/api/v1/times")
@RestController
@RequiredArgsConstructor
public class TimeController {

    private final TimeServices services;

    @PostMapping
    public DayTime dayTime(@RequestBody DayTime timeBody){
        return services.dayTime(timeBody.getHora(),timeBody.getMinutos(),timeBody.getSegundos());
    }

    @GetMapping
    public ArrayList findAll(){
        return services.findAll();
    }




    /*@GetMapping("/Hora")
    private TimeResponse getHora(){

        LocalTime now = LocalTime.now();
        Hora hora = Hora.of(now.getHour());
        Minutos minutos = Minutos.of((now.getMinute()));
        Segundos segundos = Segundos.of(now.getSecond());

        //Long hour = TimeUnit.HourTotal(TimeUnit.HOURS,now);
        Long minute = TimeUnit.HourTotal(TimeUnit.MINUTES,now);
        //Long second = TimeUnit.HourTotal(TimeUnit.SECONDS,now);
        //Long milisegundos = TimeUnit.HourTotal(TimeUnit.MILLISECONDS,now);

        return TimeResponse.from(hora, minutos, segundos, minute.intValue());

    }*/
}
