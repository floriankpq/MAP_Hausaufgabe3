package Repository;

import Model.Course;
import Model.Student;
import Model.Teacher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class CourseRepositoryTest {

    @Test
    void update() {

        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        Teacher t1 = new Teacher("Rusu", "Catalin", courses, 3);

        Course c1 = new Course("MAP", t1, 60, students, 4);
        Course c2 = new Course("MAP", t1, 60, students, 6);

        courses.add(c1);

        CourseRepository courseRepository = new CourseRepository(courses);

        courseRepository.update(c2);

        assertEquals(c1.getCredits(),c2.getCredits());

        Course c3 = new Course("DB", t1, 60, students, 8);

        try{
            courseRepository.update(c3);
        }catch(NoSuchElementException e){
            //do nothing
        }

    }
}