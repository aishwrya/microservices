package com.cts.MicroService.client.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.MicroService.client.model.UserEntity;
import com.cts.MicroService.client.model.UserModel;

public interface UserDao extends CrudRepository<UserEntity,Long>{
	//@Query(value="select userName from usermodel_tb where userName=?",nativeQuery=true)
//	String getusername(String username);
	//@Query(value="select password from usermodel_tb where userName=?",nativeQuery=true)
	//String getpwd(String username);
	boolean existsByUserName(String username);
	@Query(value="select * from usermodel_tb where userName=?",nativeQuery=true)
	UserEntity getrole(String username);
}
