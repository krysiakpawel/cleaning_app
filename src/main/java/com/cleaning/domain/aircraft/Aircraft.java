package com.cleaning.domain.aircraft;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "AIRCRAFT")
@NoArgsConstructor
public class Aircraft {

    private long id;
    private String aircraftType;
    private int blankets;


    public Aircraft(String aircraftType, int blankets){
        this.aircraftType = aircraftType;
        this.blankets = blankets;
    }

    @Id
    @GeneratedValue
    @Column(name = "AC_ID")
    public long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    @Column(name = "AC_TYPE")
    public String getAircraftType(){
        return aircraftType;
    }

    public void setAircraftType(String aircraftType){
        this.aircraftType = aircraftType;
    }
//    @Column(name = "QTY_BLANKETS")
//    public int getBlankets(){
//        return blankets;
//    }
//
//    public void setBlankets(int blankets){
//        this.blankets = blankets;
//    }

    public String toString(){
        return "Aircraft type: " + aircraftType + ". Blankets: " + blankets;
    }
}
