package com.cleaning.service;

import com.cleaning.domain.airport.Airport;
import com.cleaning.domain.airport.dao.AirportDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportService {

    @Autowired
    private AirportDao airportDao;


    public Airport saveAirport(Airport airport){
        return airportDao.save(airport);
    }

}
