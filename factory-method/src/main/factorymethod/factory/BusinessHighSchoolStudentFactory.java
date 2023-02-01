package main.factorymethod.factory;

import main.factorymethod.BusinessHighSchoolStudent;

public interface BusinessHighSchoolStudentFactory {

	public BusinessHighSchoolStudent create(String name, String surname, int no, String department);
}
