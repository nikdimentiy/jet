package lambda;

import java.util.ArrayList;

class StudentInfo {

	public void printStudent(Student st) {
		System.out.println("Name of student: " + st.getName() + "\n" + "gender: " + st.getGender() + "\n" + "age: "
				+ st.getAge() + "\n" + "course: " + st.getCourse() + "\n" + "average grade: " + st.getAverageGrade());
	}

	public void testStudents(ArrayList<Student> aL, StudentChecks sc) {
		for (Student s : aL) {
			if (sc.test(s)) {
				printStudent(s);
			}
		}
	}
}

interface StudentChecks {
	boolean test(Student s);
}

class FindStudentOverGrade implements StudentChecks {
	@Override
	public boolean test(Student s) {
		return s.getAverageGrade() > 8.5;
	}
}

class FindStudentByGender implements StudentChecks {

	private String gender;

	public FindStudentByGender(String gender) {
		this.gender = gender;
	}

	@Override
	public boolean test(Student s) {
		return s.getGender().equals(gender);
	}
}

class FindStudentByName implements StudentChecks {

	private String name;

	public FindStudentByName(String name) {
		this.name = name;
	}

	@Override
	public boolean test(Student s) {
		return s.getName().equals(name);
	}
}
