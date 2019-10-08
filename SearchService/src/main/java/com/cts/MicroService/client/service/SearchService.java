package com.cts.MicroService.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.MicroService.client.model.MentorCalendar;
import com.cts.MicroService.client.model.MentorSkill;
import com.cts.MicroService.client.repository.SearchRepository;
@Service
@Transactional
public class SearchService {
@Autowired SearchRepository searchrepository;
	public List<Long> gettime( String name, String startTime,String endTime) {
	return searchrepository.innerjoin(name,startTime,endTime);	
	}

	
}
