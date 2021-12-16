package com.cleaning.service;

import com.cleaning.domain.aircraft.Aircraft;
import com.cleaning.domain.aircraft.dao.AircraftDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DbService {

    @Autowired
    private AircraftDao repository;


    public List<Aircraft> getAllAircrafts(){
        return repository.findAll();
    }

    public Aircraft saveAircraft(final Aircraft aircraft){
        return repository.save(aircraft);
    }
}
