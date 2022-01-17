package com.cleaning.domain.turnaround;

import com.cleaning.domain.aircraft.Aircraft;
import com.cleaning.domain.airport.Airport;


public class Turnaround {

    private long id;
    private Aircraft aircraft;
    private Airport arrivingAirport;
    private Airport departureAirport;


    public Turnaround(Aircraft aircraft, Airport arrivingAirport, Airport departureAirport){
        this.aircraft = aircraft;
        this.arrivingAirport = arrivingAirport;
        this.departureAirport = departureAirport;
    }







}
