package lambda; // This is the package declaration, specifying the package name for the classes in this file.

import java.util.ArrayList; // Importing the ArrayList class from the java.util package.

class StudentInfo { // Defining the StudentInfo class.

    // This method prints information about a student.
    public void printStudent(Student st) {
        System.out.println("Name of student: " + st.getName() + "\n" + "gender: " + st.getGender() + "\n" +
                "age: " + st.getAge() + "\n" + "course: " + st.getCourse() + "\n" + "average grade: " + st.getAverageGrade());
    }

    // This method tests a list of students using a StudentChecks interface.
    public void testStudents(ArrayList<Student> aL, StudentChecks sc) {
        for (Student s : aL) { // Loop through the ArrayList of students.
            if (sc.test(s)) { // Check if the student satisfies the condition defined by the StudentChecks implementation.
                printStudent(s); // If the condition is met, print the student's information.
            }
        }
    }
}

// This is a functional interface (an interface with a single abstract method) for testing students.
interface StudentChecks {
    boolean test(Student s); // A method that checks if a condition is met for a student.
}

// Implementation of the StudentChecks interface to find students with an average grade over 8.5.
class FindStudentOverGrade implements StudentChecks {
    @Override
    public boolean test(Student s) {
        return s.getAverageGrade() > 8.5; // Return true if the student's average grade is greater than 8.5.
    }
}

// Implementation of the StudentChecks interface to find students by gender.
class FindStudentByGender implements StudentChecks {

    private String gender;

    public FindStudentByGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean test(Student s) {
        return s.getGender().equals(gender); // Return true if the student's gender matches the specified gender.
    }
}

// Implementation of the StudentChecks interface to find students by name.
class FindStudentByName implements StudentChecks {

    private String name;

    public FindStudentByName(String name) {
        this.name = name;
    }

    @Override
    public boolean test(Student s) {
        return s.getName().equals(name); // Return true if the student's name matches the specified name.
    }
}
