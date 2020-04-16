package com.example.Trabajo1.time;


import com.example.Trabajo1.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "from")
public class TimeResponse {

    Hora hora;
    Minutos minutos;
    Segundos segundos;

    private TimeResponse(Hora hora, Minutos minutos, Segundos segundos){

        Preconditions.checkNotNull(hora);
        Preconditions.checkNotNull(minutos);
        Preconditions.checkNotNull(segundos);
        //Preconditions.checkNotNull(value);

        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;

    }

}
