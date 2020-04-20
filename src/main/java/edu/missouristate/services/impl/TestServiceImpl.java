package edu.missouristate.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.missouristate.dao.CustomRepository;
import edu.missouristate.model.Credentials;
import edu.missouristate.services.TestService;

@Service("testService") 
public class TestServiceImpl implements TestService {

	@Autowired
	CustomRepository customRepo;
	
	@Override
	public boolean isAuthenticated(String id, String password) {
		Credentials creds = customRepo.getCredentialsList(id, password);
		return creds != null;
	}

}
