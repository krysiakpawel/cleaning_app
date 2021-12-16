package com.cleaning.domain.aircraft;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AircraftDto {

    private long id;
    private String aircraftType;
    private int blankets;



    @JsonProperty("airline")
    private Airline airline;


}
