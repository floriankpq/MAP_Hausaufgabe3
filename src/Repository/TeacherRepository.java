package Repository;

import Model.Teacher;

import java.util.List;

public class TeacherRepository extends InMemoryRepository<Teacher>{

    public TeacherRepository(List<Teacher> repo) {
        super(repo);
    }

    /**
     * aendert die Vor- und Nachname der ersten Lehrer mit denselben Teacherid wie @obj
     * @param obj ist ein Objekt von typ Teacher
     * @return den geaenderten Teacher
     */
    @Override
    public Teacher update(Teacher obj) {

        Teacher teacherToUpdate = this.repoList.stream()
                .filter(teacher -> teacher.getTeacherId() == obj.getTeacherId())
                .findFirst()
                .orElseThrow();

        teacherToUpdate.setFirstName(obj.getFirstName());
        teacherToUpdate.setLastName(obj.getLastName());

        return teacherToUpdate;
    }
}
