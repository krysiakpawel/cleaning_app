package com.cleaning.domain.aircraft;

import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "AIRCRAFT")
@NoArgsConstructor
public class Aircraft {

    private long id;
    private String aircraftRegistration;
    private String aircraftType;

    public Aircraft(String aircraftRegistration, String aircraftType){
        this.aircraftRegistration = aircraftRegistration;
        this.aircraftType = aircraftType;
    }

    @Id
    @GeneratedValue
    @Column(name = "A/C_ID")
    public long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    @Column(name = "A/C_REGISTRATION")
    public String getAircraftRegistration(){
        return aircraftRegistration;
    }

    public void setAircraftRegistration(String aircraftRegistration){
        this.aircraftRegistration = aircraftRegistration;
    }

    @Column(name = "A/C_TYPE")
    public String getAircraftType(){
        return aircraftType;
    }

    public void setAircraftType(String aircraftType){
        this.aircraftType = aircraftType;
    }
}
