package main.factorymethod;

public class UniversityStudent extends Student {

	private String department;
	private String mentor;
	
	public UniversityStudent(String name, String surname, int no, String department, String mentor) {
		super(name, surname, no);
		this.department = department;
		this.mentor = mentor;
	}

	public String getDepartment() {
		return department;
	}

	public String getMentor() {
		return mentor;
	}

	@Override
	public String toString() {
		return "UniversityStudent [getName()=" + getName() + ", getSurname()=" + getSurname() + ", getNo()=" + getNo()
				+ ", getDepartment()=" + getDepartment() + ", getMentor()=" + getMentor() + "]";
	}
	
}
