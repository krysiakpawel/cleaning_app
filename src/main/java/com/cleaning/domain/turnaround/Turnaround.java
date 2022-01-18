package com.cleaning.domain.turnaround;

import com.cleaning.domain.aircraft.Aircraft;
import com.cleaning.domain.airport.Airport;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TURNAROUND")
@NoArgsConstructor
public class Turnaround {

    private long id;
    private Airport airport;
    private Aircraft aircraft2;
    private String aircraft;
    private String arrivingAirport;
    private String departureAirport;

    public Turnaround(Aircraft aircraft, Airport arrivingAirport, Airport departureAirport){
        this.aircraft = aircraft.getAircraftType();
        this.arrivingAirport = arrivingAirport.getCity();
        this.departureAirport = departureAirport.getCity();
    }

    @Id
    @GeneratedValue
    @Column(name = "ID")
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    @Column(name = "AIRCRAFT")
    public String getAircraft(){
        return aircraft;
    }

    public void setAircraft(String aircraft){
        this.aircraft = aircraft;
    }

    @Column(name = "ARRIVING_FROM")
    public String getArrivingAirport(){
        return arrivingAirport;
    }

    public void setArrivingAirport(String arrivingAirport){
        this.arrivingAirport = arrivingAirport;
    }

    @Column(name = "DEPARTING_TO")
    public String getDepartureAirport(){
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport){
        this.departureAirport = departureAirport;
    }
}
