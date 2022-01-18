package com.cleaning.domain.airport;

import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "AIRPORT")
@NoArgsConstructor
public class Airport {

    private long id;
    private String IATA;
    private String city;
    private String country;

    public Airport(String IATA, String city, String country){
        this.IATA = IATA;
        this.city = city;
        this.country = country;
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

    @Column(name = "COUNTRY")
    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    @Override
    public String toString(){
        return IATA;
    }
}
