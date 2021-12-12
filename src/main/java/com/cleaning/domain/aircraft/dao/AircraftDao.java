package com.cleaning.domain.aircraft.dao;

import com.cleaning.domain.aircraft.Aircraft;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface AircraftDao extends CrudRepository <Aircraft, Long> {

    @Override
    Aircraft save (Aircraft aircraft);

    void deleteById (Long id);


}
