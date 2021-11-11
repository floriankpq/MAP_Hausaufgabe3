package Repository;

import Model.Student;

import java.util.List;

public class StudentRepository extends InMemoryRepository<Student>{

    public StudentRepository(List<Student> repo){
        super(repo);
    }

    /**
     * aendert die Vor- und Nachname der ersten Student mit denselben Studentid wie @obj
     * @param obj ist ein Objekt von typ Student
     * @return den geaenderten Student
     */
    @Override
    public Student update(Student obj) {

        Student studentToUpdate = this.repoList.stream()
            .filter(student -> student.getStudentId() == obj.getStudentId())
            .findFirst()
            .orElseThrow();

        studentToUpdate.setFirstName(obj.getFirstName());
        studentToUpdate.setLastName(obj.getLastName());

        return studentToUpdate;
    }
}
