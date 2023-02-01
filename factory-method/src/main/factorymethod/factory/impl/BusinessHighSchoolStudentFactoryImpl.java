package main.factorymethod.factory.impl;

import main.factorymethod.BusinessHighSchoolStudent;
import main.factorymethod.factory.BusinessHighSchoolStudentFactory;

public class BusinessHighSchoolStudentFactoryImpl implements BusinessHighSchoolStudentFactory{

	@Override
	public BusinessHighSchoolStudent create(String name, String surname, int no, String department) {
		
		return new BusinessHighSchoolStudent(name, surname, no, department);
	}

}
