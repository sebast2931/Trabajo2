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
public class MemoryDayTimesRepo implements DayTimeRepo{

    private final ArrayList state = new ArrayList();

    @Override
    public DayTime insertOne(Hora hora, Minutos minutos, Segundos segundos) {

        DayTime dayTime = DayTime.of(hora, minutos, segundos);
        state.add(dayTime);
        return dayTime;
    }

    @Override
    public ArrayList findAll() {
        return state;
    }



}
