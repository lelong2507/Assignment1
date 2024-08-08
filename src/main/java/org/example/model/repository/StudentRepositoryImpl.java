package org.example.model.repository;

import org.example.model.entity.Student;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.ArrayList;

@Repository
public class StudentRepositoryImpl implements StudentRepository{

    private List<Student> stdList = new ArrayList<>();

    @PostConstruct
    public void init(){
        Student std1 = new Student(1,"Le Hoang Long", "0123455671","DN",20, false);
        Student std2 = new Student(2,"Neyu", "012345677","QN",20, false);
        stdList.add(std1);
        stdList.add(std2);
    }
    @Override
    public boolean addStudent(Student student) {
        return stdList.add(student);
    }

    @Override
    public void showAll() {
        for (int i = 0; i < stdList.size() ; i++) {
            System.out.println("Student no." + (i + 1));
            System.out.println(stdList.get(i).toString());
        }
    }

    @Override
    public void deleteStudent(int idStudent) {
        stdList.removeIf(student -> student.getId() == idStudent);
    }

    @Override
    public Student updateStudent(int idStudent, Student student) {
        if(stdList.size() < 0) {
            System.out.println("Don't have student");
        }
        for (int i = 0; i < stdList.size() ; i++) {
            if(stdList.get(i).getId() == idStudent){
                stdList.set(i, student);
                return student;
            }
        }
        return null;
    }

    @Override
    public Student getStudentById(int idStudent) {
        for (Student std : stdList) {
            if(std.getId() == idStudent){
                return std;
            }
        }
        return null;
    }
}
