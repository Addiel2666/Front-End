package org.servicios.login.dao;

import java.util.List;

import org.servicios.login.model.UserProfile;




public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
