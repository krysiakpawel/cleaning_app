package com.cleaning.service;


import com.cleaning.domain.aircraft.Aircraft;
import com.cleaning.domain.airport.Airport;
import com.cleaning.domain.turnaround.Turnaround;
import com.cleaning.domain.turnaround.dao.TurnaroundDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnaroundService {

    @Autowired
    private TurnaroundDao turnaroundDao;

    public Turnaround save(Turnaround turnaround){
        return turnaroundDao.save(turnaround);
    }

    public Turnaround createTurnaround(Aircraft aircraft, Airport arrivingAirport, Airport departingAirport){
        Turnaround turnaround = new Turnaround(aircraft, arrivingAirport, departingAirport);
        return turnaroundDao.save(turnaround);

    }



}
