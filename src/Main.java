import Model.Course;
import Model.Student;
import Model.Teacher;
import Repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Course> courses = new ArrayList<>();

        Teacher t1 = new Teacher("Rusu", "Catalin", courses, 3);

        //Course c1 = new Course("MAP", )

        Student s1 = new Student("Florian", "Moga", 12452, courses);
        Student s2 = new Student("Andrian", "Pop", 39174, courses);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        StudentRepository sRepo = new StudentRepository(students);

    }
}
