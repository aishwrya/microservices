package com.cts.MicroService.client.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.MicroService.client.model.Training;

public interface TrainingRepository extends CrudRepository<Training,Long> {

//	@Query(value="select * from training_tb where mentorId in (:list)",nativeQuery=true)

//	public List<Training> show(List<Long> list);
	  List<Training> findBymentorIdIn(List<Long> list); 
}
