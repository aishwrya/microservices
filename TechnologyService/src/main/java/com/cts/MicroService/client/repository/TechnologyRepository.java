package com.cts.MicroService.client.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.MicroService.client.model.Technology;


public interface TechnologyRepository extends CrudRepository<Technology, Long>{

}
