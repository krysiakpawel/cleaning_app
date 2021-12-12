package com.cleaning.service;


import com.cleaning.domain.aircraft.Aircraft;
import com.cleaning.domain.aircraft.dao.AircraftDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AircraftService {

    @Autowired
    private AircraftDao aircraftDao;

    public Aircraft saveAircraft(Aircraft aircraft){
        if (aircraft != null) {
            return aircraftDao.save(aircraft);
        }
        return new Aircraft();
    }

    public void deleteAircraftById(Long id){
        aircraftDao.deleteById(id);
    }



}
