package com.cleaning.domain.aircraft;

import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
    @NotNull
    @Column(name = "AC_ID", unique = true)
    public long getId(){
        return id;
    }

    private void setId(Long id){
        this.id = id;
    }

    @Column(unique = true, name = "AC_REGISTRATION")
    public String getAircraftRegistration(){
        return aircraftRegistration;
    }

    private void setAircraftRegistration(String aircraftRegistration){
        this.aircraftRegistration = aircraftRegistration;
    }

    @Column(name = "AC_TYPE")
    public String getAircraftType(){
        return aircraftType;
    }

    private void setAircraftType(String aircraftType){
        this.aircraftType = aircraftType;
    }
}
