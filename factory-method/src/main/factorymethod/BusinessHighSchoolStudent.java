package main.factorymethod;

public class BusinessHighSchoolStudent extends Student {

	private String department;
	
	public BusinessHighSchoolStudent(String name, String surname, int no, String department) {
		super(name, surname, no);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "BusinessHighSchoolStudent [getName()=" + getName() + ", getSurname()=" + getSurname() + ", getNo()="
				+ getNo() + ", getDepartment()=" + getDepartment() + "]";
	}

	
	
}
