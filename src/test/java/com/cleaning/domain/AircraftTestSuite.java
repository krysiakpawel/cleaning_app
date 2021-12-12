package com.cleaning.domain;

import com.cleaning.domain.aircraft.Aircraft;
import com.cleaning.domain.aircraft.dao.AircraftDao;
import com.cleaning.service.AircraftService;
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


    @Test
    public void testAircraftDaoSave(){

        //Given
        Aircraft aircraft = new Aircraft("737", 20);
        Aircraft aircraft1 = new Aircraft("757", 25);
        //When
        aircraftService.saveAircraft(aircraft);
        aircraftService.saveAircraft(aircraft1);

    }







}
