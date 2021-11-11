package Repository;

import Model.Course;
import Model.Teacher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class TeacherRepositoryTest {

    @Test
    void update() {

        List<Course> courses = new ArrayList<>();

        Teacher t1 = new Teacher("Ru", "Ctalin", courses, 3);
        Teacher t2 = new Teacher("Rusu", "Catalin", courses, 3);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);

        TeacherRepository teacherRepository = new TeacherRepository(teachers);

        teacherRepository.update(t2);

        assertEquals(t1.getFirstName(),t2.getFirstName());
        assertEquals(t1.getLastName(),t2.getLastName());

        Teacher t3 = new Teacher("Cret", "Octavian", courses, 7);

        try{
            teacherRepository.update(t3);
        }catch(NoSuchElementException e){
            //do nothing
        }

    }
}