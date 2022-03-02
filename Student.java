public class Student {
    String name;
    int course;
    static int count;


    public Student(String name, int course) {
        count++;
        this.name = name;
        this.course = course;
        System.out.println("Student # "+ count + " creating");

    }
}

class StudentTest {
    public static void main (String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Masha", 2);
    }
}