package org.example.model.repository;

import org.example.model.entity.Student;

public interface StudentRepository {
    boolean addStudent(Student student);
    void showAll();
    void deleteStudent(int idStudent);
    Student updateStudent(int idStudent, Student student);
    Student getStudentById(int idStudent);
}
