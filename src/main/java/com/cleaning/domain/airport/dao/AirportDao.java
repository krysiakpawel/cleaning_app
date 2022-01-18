package com.cleaning.domain.airport.dao;


import com.cleaning.domain.airport.Airport;
import lombok.Builder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface AirportDao extends CrudRepository <Airport, Long> {


    @Override
    Airport save(Airport airport);

}
