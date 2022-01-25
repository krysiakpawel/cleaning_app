package com.cleaning.controller;

import com.cleaning.domain.aircraft.Aircraft;
import com.cleaning.domain.aircraft.AircraftDto;
import com.cleaning.service.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping("/v1/cleaning")
public class AircraftController {


    @Autowired
    AircraftService aircraftService;

    @RequestMapping(method = RequestMethod.GET, value = "getAircrafts")
    public List<AircraftDto> getAircrafts(){
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.POST, value = "saveAircraft", consumes = APPLICATION_JSON_VALUE)
    public void createAircraft(@RequestBody Aircraft aircraft){
        aircraftService.saveAircraft(aircraft);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getAircraft")
    public Aircraft getAircraft(){
        return new Aircraft();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteDatabases")
    public void deleteDatabase(){
    }
}
