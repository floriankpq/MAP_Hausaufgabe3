package Model;

import java.util.List;

/**
 * ist eine Person mit @studentId, @totalCredits und @enrolledCourses
 */
public class Student extends Person{

    private long studentId;
    private int totalCredits;
    private List<Course> enrolledCourses;

    public Student(String firstName, String lastName, long studentId, List<Course> enrolledCourses) {

        super(firstName, lastName);

        this.studentId = studentId;
        this.enrolledCourses = enrolledCourses;

        int credits = 0;
        for(Course c : this.enrolledCourses){
            credits += c.getCredits();
        }

        this.totalCredits = credits;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }


}
