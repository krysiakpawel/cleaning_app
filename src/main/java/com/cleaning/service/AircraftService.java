package com.cleaning.service;


import com.cleaning.domain.aircraft.Aircraft;
import com.cleaning.domain.aircraft.AircraftDto;
import com.cleaning.domain.aircraft.dao.AircraftDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AircraftService {

    @Autowired
    private AircraftDao aircraftDao;

    public Aircraft saveAircraft(Aircraft aircraft){
            return aircraftDao.save(aircraft);

    }

    public void deleteAircraftById(Long id){
        aircraftDao.deleteById(id);
    }


    public AircraftDto[] getLandedPlanes(){
        return null;







    }
}
