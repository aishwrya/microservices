package com.cts.MicroService.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.MicroService.client.model.MentorCalendar;
import com.cts.MicroService.client.model.MentorSkill;
import com.cts.MicroService.client.service.SearchService;
@RestController

public class SearchController {
	@Autowired SearchService searchservice;
@RequestMapping(value="/{name}/{startTime}/{endTime}",method=RequestMethod.GET)
public List<Object>  getTime(@PathVariable String name,@PathVariable String startTime,@PathVariable String endTime)
{
	 String URL_Training = "http://localhost:8082/displ";
//	RestTemplate restTemplate = new RestTemplate();
	 
     // Send request with GET method and default Headers.
//     String result = restTemplate.getForObject(URL_EMPLOYEES, String.class);

 
	
List<Long> list = searchservice.gettime(name,startTime,endTime);
System.out.println(list);

RestTemplate restTemplate = new RestTemplate();
List<Object> result = (List<Object>) restTemplate.postForObject(URL_Training, list, Object.class);
return result;


}
}
