package service;

import model.Student;
import reposity.StudentReposity;

import java.util.List;

public class StudentService implements StudentReposity {
    StudentReposity repo;
    public StudentService(StudentReposity repo) {
        this.repo = repo;
    }

    @Override
    public void deleteStudent(Student student) {
        repo.deleteStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        repo.updateStudent(student);
    }

    @Override
    public boolean checkStudent(Student student) {
        return repo.checkStudent(student);
    }

    @Override
    public boolean checkClass(Student student) {
        return repo.checkClass(student);
    }

    public void addStudent(Student student){
        repo.addStudent(student);
    }

    @Override
    public List<Student> getStudents() {
        return repo.getStudents();
    }
}
