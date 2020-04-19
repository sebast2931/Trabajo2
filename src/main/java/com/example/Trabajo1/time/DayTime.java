package com.example.Trabajo1.time;

import lombok.Value;

@Value(staticConstructor = "of")
public class DayTime {
    Hora hora;
    Minutos minutos;
    Segundos segundos;
}
