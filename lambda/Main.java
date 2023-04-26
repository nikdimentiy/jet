package lambda;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// Create an ArrayList of Student objects
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("John", "Male", 20, "Computer Science", 9.0));
		students.add(new Student("Jane", "Female", 21, "Mathematics", 8.5));
		students.add(new Student("Bob", "Male", 19, "Physics", 8.0));

		FindStudentOverGrade findStudentOverGrade = new FindStudentOverGrade();
		FindStudentByGender findStudentByGender = new FindStudentByGender("Male");
		FindStudentByName findStudentByName = new FindStudentByName("Bob");

		// Create an instance of the StudentInfo class
		StudentInfo studentInfo = new StudentInfo();

		// Call the testStudents method and pass in the ArrayList of students and the
		// FindStudentOverGrade instance
		studentInfo.testStudents(students, findStudentOverGrade);
		studentInfo.testStudents(students, findStudentByName);
		studentInfo.testStudents(students, findStudentByGender);

	}
}
