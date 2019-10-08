package com.cts.MicroService.client.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.MicroService.client.model.User;
import com.cts.MicroService.client.service.UserService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class UserController {
	@Autowired
	UserService userservice;
@GetMapping("/list")
public List<User> display()
{
return userservice.display();	
}
@PostMapping("/add")
public String adduser(@RequestBody User user)
{
userservice.add(user);
return "Added Successfully";
}
@RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
public Optional<User> getlist(@PathVariable Long id) {
	return userservice.getById(id);
}
@RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
public String deleteUser(@PathVariable Long id) {
	userservice.delete(id);
	return "Deleted Successfully";
	
}
@RequestMapping(value = "/update", method = RequestMethod.PUT)
@ResponseBody
public String updateuser(@RequestBody User user) {
	 userservice.update(user);
	 return "Updated Successfully";
}
}