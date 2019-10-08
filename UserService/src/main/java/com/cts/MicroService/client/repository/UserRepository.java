package com.cts.MicroService.client.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.MicroService.client.model.User;



public interface UserRepository extends CrudRepository<User, Long>{

}
