package main.factorymethod.factory;

import main.factorymethod.Student;

public interface StudentFactory {

	public Student create(String name, String surname, int no);
}
