package edu.missouristate.services;

import java.util.List;

import edu.missouristate.model.Car;
import edu.missouristate.model.Example;

public interface ExampleService {

	public Car getCar();
	public List<Example> getExamples();
}
