package com.cleaning.service;


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
}
