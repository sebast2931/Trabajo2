package com.example.Trabajo1.Services;

import com.example.Trabajo1.repositories.DayTimeRepo;
import com.example.Trabajo1.time.DayTime;
import com.example.Trabajo1.time.Hora;
import com.example.Trabajo1.time.Minutos;
import com.example.Trabajo1.time.Segundos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TimeServices {
    private final DayTimeRepo repository;

    @Autowired
    public TimeServices(@Qualifier("in-memory")DayTimeRepo repository) {
        this.repository = repository;
    }

    public DayTime dayTime(Hora hora, Minutos minutos, Segundos segundos){
        return repository.insertOne(hora, minutos, segundos);

    }

    public ArrayList findAll(){
        return repository.findAll();
    }
}
