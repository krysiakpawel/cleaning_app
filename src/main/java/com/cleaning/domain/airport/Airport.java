package com.cleaning.domain.airport;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Airport {


    private long id;
    private String IATA;
    private String city;
    private String continent;


    public Airport(String IATA, String city, String continent){
        this.IATA = IATA;
        this.city = city;
        this.continent = continent;
    }


    @Id
    @GeneratedValue
    @Column(name = "Airport_ID")
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    @Column(name = "IATA")
    public String getIATA(){
        return IATA;
    }

    public void setIATA(String IATA){
        this.IATA = IATA;
    }

    @Column(name = "CITY")
    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    @Column(name = "CONTINENT")
    public String getContinent(){
        return continent;
    }

    public void setContinent(String continent){
        this.continent = continent;
    }

    @Override
    public String toString(){
        return IATA;
    }
}
