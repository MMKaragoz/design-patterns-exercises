package main.blochsapproach;

public class Student {

	private String name;
	private String surname;
	private int no;
	private String department;
	private String mentor;
	
	
	private Student(String name, String surname, int no) {
		this.name = name;
		this.surname = surname;
		this.no = no;
	}

	private Student(String name, String surname, int no, String department) {
		this.name = name;
		this.surname = surname;
		this.no = no;
		this.department = department;
	}

	private Student(String name, String surname, int no, String department, String mentor) {
		super();
		this.name = name;
		this.surname = surname;
		this.no = no;
		this.department = department;
		this.mentor = mentor;
	}

	public static Student createNewStudent(String name, String surname, int no) {
		return new Student(name, surname, no);
	}
	
	public static Student createNewBusinessHighSchoolStudent(String name, String surname, int no, String department) {
		return new Student(name, surname, no, department);
	}

	public static Student createNewUniversityStudent(String name, String surname, int no, String department, String mentor) {
		return new Student(name, surname, no, department, mentor);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", no=" + no + ", department=" + department
				+ ", mentor=" + mentor + "]";
	}
	
}

