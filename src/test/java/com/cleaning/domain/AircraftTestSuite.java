package com.cleaning.domain;

import com.cleaning.domain.aircraft.Aircraft;
import com.cleaning.domain.airport.Airport;
import com.cleaning.domain.turnaround.Turnaround;
import com.cleaning.service.AircraftService;
import com.cleaning.service.AirportService;
import com.cleaning.service.TurnaroundService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class AircraftTestSuite {

    @Autowired
    private AircraftService aircraftService;
    @Autowired
    private AirportService airportService;
    @Autowired
    private TurnaroundService turnaroundService;


    @Test
    public void testAircraftDaoSave(){

        //Given
        Aircraft aircraft = new Aircraft("TF-ISO", "767-300");
        //When
        aircraftService.saveAircraft(aircraft);
        //Then

    }

    @Test
    public void testAirportDaoSave(){

        //Given
        Airport airport = new Airport("ORD", "Chicago", "USA");

        //When
        airportService.saveAirport(airport);

    }

    @Test
    public void testTurnaroundDaoSave(){
        //Given
        Airport airportORD = new Airport("ORD", "Chicago", "USA");
        Airport airportTXL = new Airport("TXL", "Berlin", "Germany");
        Aircraft aircraft = new Aircraft("TF-ISO", "767-300");
        Turnaround turnaround = new Turnaround(aircraft, airportTXL, airportORD );
        //When
        turnaroundService.save(turnaround);

    }
}
