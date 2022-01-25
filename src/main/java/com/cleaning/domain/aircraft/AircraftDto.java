package com.cleaning.domain.aircraft;

import lombok.Getter;

@Getter
public class AircraftDto {

    private long id;
    private String aircraftRegistration;
    private String aircraftType;

    public AircraftDto(String aircraftRegistration, String aircraftType) {
        this.aircraftRegistration = aircraftRegistration;
        this.aircraftType = aircraftType;
    }
}