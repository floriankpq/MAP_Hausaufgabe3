package Repository;

import Model.Course;
import Model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {

    @Test
    void update() {
        List<Course> courses = new ArrayList<>();

        Student s1 = new Student("Florin", "Mga", 12452, courses);
        Student s2 = new Student("Florian", "Moga", 12452, courses);

        List<Student> students = new ArrayList<>();
        students.add(s1);

        StudentRepository studentsRepo = new StudentRepository(students);

        studentsRepo.update(s2);

        assertEquals(s1.getFirstName(),s2.getFirstName());
        assertEquals(s1.getLastName(),s2.getLastName());

        Student s3 = new Student("Dan", "Andrei", 92942, courses);
        
        try{
            studentsRepo.update(s3);
        }catch(NoSuchElementException e){
            //do nothing
        }
    }
}