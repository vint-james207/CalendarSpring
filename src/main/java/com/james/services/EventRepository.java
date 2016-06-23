package com.james.services;

import com.james.entities.Event;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by jamesyburr on 6/23/16.
 */
public interface EventRepository extends CrudRepository<Event, Integer> {

}
