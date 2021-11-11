package Repository;

import Model.Course;
import Model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryRepositoryTest {

    List<Course> courses = new ArrayList<>();

    Student s1 = new Student("Florian", "Moga", 12452, courses);
    Student s2 = new Student("Dan", "Andrei", 92942, courses);

    List<Student> students = new ArrayList<>();
    StudentRepository studentsRepo = new StudentRepository(students);

    @Test
    void create() {

        assertEquals(s1,studentsRepo.create(s1));

        List<Student> sRepo = studentsRepo.getAll();

        for(Student s : sRepo){
            assertEquals(s.getStudentId(),s1.getStudentId());
            assertEquals(s.getLastName(),s1.getLastName());
            assertEquals(s.getFirstName(),s1.getFirstName());
            assertEquals(s.getEnrolledCourses(),s1.getEnrolledCourses());
            assertEquals(s.getTotalCredits(),s1.getTotalCredits());
        }
    }

    @Test
    void getAll() {

        List<Student> studentsNew = new ArrayList<>();
        studentsNew.add(s1);

        studentsRepo.create(s1);

        assertEquals(studentsNew,studentsRepo.getAll());
    }

    @Test
    void delete() {
        studentsRepo.create(s1);
        studentsRepo.create(s2);

        studentsRepo.delete(s1);

        List<Student> sRepo = studentsRepo.getAll();

        for(Student s : sRepo){
            assertNotEquals(s,s1);
        }
    }
}