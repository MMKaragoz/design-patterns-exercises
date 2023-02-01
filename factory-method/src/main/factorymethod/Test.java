package main.factorymethod;

import main.factorymethod.factory.BusinessHighSchoolStudentFactory;
import main.factorymethod.factory.StudentFactory;
import main.factorymethod.factory.UniversityStudentFactory;
import main.factorymethod.factory.impl.BusinessHighSchoolStudentFactoryImpl;
import main.factorymethod.factory.impl.StudentFactoryImpl;
import main.factorymethod.factory.impl.UniversityStudentFactoryImpl;

public class Test {
	
	public static void main(String[] args) {
		// create factories
		
		StudentFactory studentFactory = new StudentFactoryImpl();
		BusinessHighSchoolStudentFactory businessHighSchoolStudentFactory = new BusinessHighSchoolStudentFactoryImpl();
		UniversityStudentFactory universityStudentFactory = new UniversityStudentFactoryImpl();
		
		// create students using create method from factories
		Student student = studentFactory.create("Mert", "Karagöz", 0);
		Student businessHighSchoolStudent = businessHighSchoolStudentFactory.create("Mert", "Karagöz", 1, "software");
		Student universityStudent = universityStudentFactory.create("Mert", "Karagöz", 2, "software", "mentor");
		
		// output
		System.out.println(student);
		System.out.println(businessHighSchoolStudent);
		System.out.println(universityStudent);
	}
	
}
