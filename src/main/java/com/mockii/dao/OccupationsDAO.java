package com.mockii.dao;

import com.mockii.entity.Occupations;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Billa on 12/16/16.
 */
@Transactional
public interface OccupationsDAO extends CrudRepository<Occupations, Long> {

}
