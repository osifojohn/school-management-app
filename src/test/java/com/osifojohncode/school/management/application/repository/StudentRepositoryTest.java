package com.osifojohncode.school.management.application.repository;

import com.osifojohncode.school.management.application.entity.Guardian;
import com.osifojohncode.school.management.application.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("osifojohntec@gmail.com")
                .firstName("John")
                .lastName("Osifo")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .email("able@gmail.com")
                .mobile("2345678901")
                .name("Francis")
                .build();

        Student student = Student.builder()
                .emailId("johnosifotec@gmail.com")
                .firstName("John")
                .lastName("Osifo")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudents(){
     List<Student> students =
             studentRepository.findAll();
        System.out.println("student List = " + students);
    }
}