package main.blochsapproach;

public class Test {
	public static void main(String[] args) { 
		
		// create students
		Student student = Student.createNewStudent("Mert", "Karagöz", 0);
		Student businessHighSchoolStudent = Student.createNewBusinessHighSchoolStudent("Mert", "Karagöz", 1, "software");
		Student universityStudent = Student.createNewUniversityStudent("Mert", "Karagöz", 2, "software", "mentor");
		
		// output
		System.out.println(student);
		System.out.println(businessHighSchoolStudent);
		System.out.println(universityStudent);
	}
}
