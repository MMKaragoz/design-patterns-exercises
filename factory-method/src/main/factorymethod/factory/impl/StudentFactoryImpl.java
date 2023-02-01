package main.factorymethod.factory.impl;

import main.factorymethod.Student;
import main.factorymethod.factory.StudentFactory;

public class StudentFactoryImpl implements StudentFactory{

	@Override
	public Student create(String name, String surname, int no) {
		
		return new Student(name, surname, no);
	}
}
