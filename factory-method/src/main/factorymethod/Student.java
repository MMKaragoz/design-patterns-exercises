package main.factorymethod;

public class Student {
	
	private String name;
	private String surname;
	private int no;

	

	public Student(String name, String surname, int no) {
		super();
		this.name = name;
		this.surname = surname;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getNo() {
		return no;
	}

	@Override
	public String toString() {
		return "PrimaryStudent [getName()=" + getName() + ", getSurname()=" + getSurname() + ", getNo()=" + getNo()
				+ "]";
	}
	
}
