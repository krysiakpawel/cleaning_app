package com.cleaning.controller;

import com.cleaning.domain.aircraft.Aircraft;
import com.cleaning.domain.aircraft.AircraftDto;
import com.cleaning.service.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/v1/cleaning")
public class AircraftController {


    AircraftService aircraftService;

    @RequestMapping(method = RequestMethod.GET, value = "getAircrafts")
    public List<AircraftDto> getAircrafts(){
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.POST, value = "saveAircraft")
    public void createAircraft(Aircraft aircraft){
        aircraftService.saveAircraft(aircraft);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getSupplies")
    public int getSupplies(){
        return 5;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteDatabases")
    public void deleteDatabase(){
    }
}
