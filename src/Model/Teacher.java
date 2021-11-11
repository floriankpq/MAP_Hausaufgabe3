package Model;

import java.util.List;

/**
 * ist eine Person mit @teacherID und @courses
 */
public class Teacher extends Person{
    private List<Course> courses;
    private int teacherId;

    public Teacher(String firstName, String lastName, List<Course> courses, int teacherId) {
        super(firstName,lastName);
        this.courses = courses;
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
