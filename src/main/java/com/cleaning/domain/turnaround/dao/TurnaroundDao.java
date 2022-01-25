package com.cleaning.domain.turnaround.dao;


import com.cleaning.domain.turnaround.Turnaround;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TurnaroundDao extends CrudRepository <Turnaround, Long> {

    @Override
    Turnaround save(Turnaround turnaround);

    @Override
    List<Turnaround> findAll();


}
