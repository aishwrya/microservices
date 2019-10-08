package com.cts.MicroService.client.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.MicroService.client.model.User;
import com.cts.MicroService.client.repository.UserRepository;




@Service
@Transactional
public class UserService {
@Autowired
UserRepository userrepository;
	public List<User> display(){
		return (List<User>) userrepository.findAll();
	}
	public void add(User user)
	{
		userrepository.save(user);
		
	}
	public void delete(Long id)
	{
		userrepository.deleteById(id);
		
	}
	public Optional<User> getById(Long id) {
		return userrepository.findById(id);
	}
	public void update(User user)
	{
		userrepository.save(user);
		
	}
}
