package reposity;

import model.Student;

import java.util.List;

public interface StudentReposity {
    void addStudent(Student student);
    void deleteStudent(Student student);
    void updateStudent(Student student);
    boolean checkStudent(Student student);
    boolean checkClass(Student student);
    List<Student> getStudents();
}
