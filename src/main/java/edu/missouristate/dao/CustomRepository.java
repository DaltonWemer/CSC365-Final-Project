package edu.missouristate.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import edu.missouristate.model.Credentials;

@Repository
public class CustomRepository {
	
	// Global Member Variables
	List<Credentials> credentialsList = new ArrayList<Credentials>();
	
	@PostConstruct
	private void postConstruct() {
		intializeDatasource();
	}
	
	private void intializeDatasource() {
		Credentials creds = new Credentials();
		creds.setId("admin");
		creds.setPassword("password");		
		credentialsList.add(creds);
	}

	public List<Credentials> getCredentialsList() {
		// Normally this would be a database call...
		// SELECT * FROM TABLE;
		return credentialsList;
	}

	public Credentials getCredentialsList(String id, String password) {
		// Normally this would be a database call...
		// SELECT * FROM TABLE WHERE ID = id;
		Credentials resultCreds = null;
		
		if (id == null || id.length() == 0) 
			return resultCreds;
		
		for (Credentials creds : credentialsList) {
			if (creds.getId().equalsIgnoreCase(id) && creds.getPassword().equals(password)) {
				return creds;
			}
		}
		
		return resultCreds;
	}
	
	
}
