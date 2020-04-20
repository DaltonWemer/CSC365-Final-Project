package edu.missouristate.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.missouristate.dao.ExampleRepository;
import edu.missouristate.model.Example;
import edu.missouristate.services.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
    
    @Autowired
    ExampleRepository exampleRepo;


	@Override
	public List<Example> getExamples() {
		return exampleRepo.getExamples();
	}
   
}
