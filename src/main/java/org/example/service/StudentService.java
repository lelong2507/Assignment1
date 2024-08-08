package org.example.service;

import org.example.model.entity.Student;
public interface StudentService {
    void addStudent(Student student);
    void deleteStudent(int idStudent);
    Student updateStudent(int idStudent, Student std);
    Student getStudentById(int idStudent);
    void showAll();
    boolean isMilitary(int idStudent);
}
