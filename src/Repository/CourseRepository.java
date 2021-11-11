package Repository;

import Model.Course;

import java.util.List;

public class CourseRepository extends InMemoryRepository<Course>{

    public CourseRepository(List<Course> repo) {
        super(repo);
    }

    /**
     * aendert die Kreditanzahl der ersten Kurs mit denselben Name wie @obj
     * @param obj ist ein Objekt von typ Course
     * @return den geaenderten Kurs
     */
    @Override
    public Course update(Course obj) {
        Course courseCreditsToUpdate = this.repoList.stream()
                .filter(course -> course.getName().equals(obj.getName()))
                .findFirst()
                .orElseThrow();

        courseCreditsToUpdate.setCredits(obj.getCredits());

        return courseCreditsToUpdate;
    }
}
