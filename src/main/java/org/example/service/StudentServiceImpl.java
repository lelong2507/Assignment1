package org.example.service;

import org.example.model.repository.StudentRepository;
import org.example.model.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public boolean isMilitary(int idStudent) {
        if(getStudentById(idStudent) != null){
            if(getStudentById(idStudent).getAge() > 18){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    @Override
    public void deleteStudent(int idStudent) {
        studentRepository.deleteStudent(idStudent);
    }

    @Override
    public Student updateStudent(int idStudent, Student std) {
        return studentRepository.updateStudent(idStudent, std);
    }

    @Override
    public Student getStudentById(int idStudent) {
        return studentRepository.getStudentById(idStudent);
    }

    @Override
    public void showAll() {
        studentRepository.showAll();
    }
}
