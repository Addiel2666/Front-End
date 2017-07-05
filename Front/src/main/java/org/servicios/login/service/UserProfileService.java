package org.servicios.login.service;

import java.util.List;

import org.servicios.login.model.UserProfile;




public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
