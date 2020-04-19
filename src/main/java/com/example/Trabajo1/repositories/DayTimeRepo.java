package com.example.Trabajo1.repositories;


import com.example.Trabajo1.time.DayTime;
import com.example.Trabajo1.time.Hora;
import com.example.Trabajo1.time.Minutos;
import com.example.Trabajo1.time.Segundos;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Qualifier("in-memory")
public interface DayTimeRepo {
    DayTime insertOne(Hora hora, Minutos minutos, Segundos segundos);

    ArrayList findAll();
}
