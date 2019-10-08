package com.cts.MicroService.client.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.cts.MicroService.client.model.Technology;
import com.cts.MicroService.client.repository.TechnologyRepository;

@Service
@Transactional
public class TechnologyService {
@Autowired
TechnologyRepository technologyrepository;
	public List<Technology> display(){
		return (List<Technology>) technologyrepository.findAll();
	}
	public void add(Technology technology)
	{
		technologyrepository.save(technology);
		
	}
	public void delete(Long id)
	{
		technologyrepository.deleteById(id);
		
	}
	public Optional<Technology> getById(Long id) {
		return technologyrepository.findById(id);
	}
	public void update(Technology technology)
	{
		technologyrepository.save(technology);
		
	}
}
