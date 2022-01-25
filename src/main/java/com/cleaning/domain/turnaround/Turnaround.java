package com.cleaning.domain.turnaround;

import com.cleaning.domain.aircraft.Aircraft;
import com.cleaning.domain.airport.Airport;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TURNAROUND")
@NoArgsConstructor
public class Turnaround {

    private long id;
    private Airport airport;
    private Aircraft aircraft;
    private String arrivingAirport;
    private String departureAirport;

    public Turnaround(Aircraft aircraft, Airport arrivingAirport, Airport departureAirport){
        this.aircraft = aircraft;
        this.arrivingAirport = arrivingAirport.getCity();
        this.departureAirport = departureAirport.getCity();
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public long getId(){
        return id;
    }
    private void setId(long id){
        this.id = id;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "AIRCRAFT_ID")
    public Aircraft getAircraft(){
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft){
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
