package main.factorymethod.factory;

import main.factorymethod.UniversityStudent;

public interface UniversityStudentFactory {
	
	public UniversityStudent create(String name, String surname, int no, String department, String mentor);
}
