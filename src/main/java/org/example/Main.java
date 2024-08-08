package org.example;

import org.example.model.entity.Student;
import org.example.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        StudentService stdService = applicationContext.getBean("studentService", StudentService.class);

        Student std3 = new Student(3, "VuCo", "012343212","QN",20, false);
        Student std4 = new Student(4, "NguyenOC","04563218", "QN", 20, false);

        // Add Student method
        stdService.addStudent(std3);
        stdService.addStudent(std4);

        // Delete Student method
        stdService.deleteStudent(3);

        // Update Student method
        stdService.updateStudent(4, new Student(4, "LongLh","098765431", "DN", 17, true));

        // Check isMilitary

        // Show all Student in the student list
        stdService.showAll();

        System.out.println(stdService.isMilitary(4));
    }
}