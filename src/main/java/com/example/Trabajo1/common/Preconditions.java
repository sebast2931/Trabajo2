package com.example.Trabajo1.common;

import java.util.Objects;

public class Preconditions {

    public static void checkNotNull(Object reference){
        if(Objects.isNull(reference)){
            throw new NullPointerException();
        }
    }

    public static void checkArgument(Boolean argument){
        if (!argument){
            throw new IllegalArgumentException();
        }
    }
}
