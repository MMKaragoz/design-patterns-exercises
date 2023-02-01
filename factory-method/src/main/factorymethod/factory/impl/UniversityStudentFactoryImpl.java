package main.factorymethod.factory.impl;

import main.factorymethod.UniversityStudent;
import main.factorymethod.factory.UniversityStudentFactory;

public class UniversityStudentFactoryImpl implements UniversityStudentFactory{

	@Override
	public UniversityStudent create(String name, String surname, int no, String department, String mentor) {
		return new UniversityStudent(name, surname, no, department, mentor);
	}
}
