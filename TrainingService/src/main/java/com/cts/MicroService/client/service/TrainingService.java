package com.cts.MicroService.client.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.MicroService.client.model.Training;
import com.cts.MicroService.client.repository.TrainingRepository;

@Service
@Transactional
public class TrainingService {
	@Autowired
	TrainingRepository trainingrepository;
		public List<Training> display(){
			return (List<Training>) trainingrepository.findAll();
		}
		public void add(Training training)
		{
			trainingrepository.save(training);
			
		}
		public void delete(Long id)
		{
			trainingrepository.deleteById(id);
			
		}
		public Optional<Training> getById(Long id) {
			return trainingrepository.findById(id);
		}
		public void update(Training training)
		{
			trainingrepository.save(training);
			
		}
		public List<Training> trainingdetails(List<Long> list)
		{System.out.print(list);
			return trainingrepository.findBymentorIdIn(list);
		}
}
