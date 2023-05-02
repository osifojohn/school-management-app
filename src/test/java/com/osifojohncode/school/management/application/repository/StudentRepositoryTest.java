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
    @Test
    public void printStudentByFirstName(){
        String studentName = "John";
        List<Student> students = studentRepository.findByFirstNameIgnoreCase(studentName);
        System.out.println("student = " + students);
    }

    @Test
    public void printStudentByFirstNameContaining(){
        String studentName = "Jo";
        List<Student> students = studentRepository.findByFirstNameIgnoreCaseContaining(studentName);
        System.out.println("student = " + students);
    }
    @Test
    public void printStudentBasedOnGuardianName(){
        String GuardianName = "francis";
        List<Student> guardian = studentRepository.findByGuardianNameIgnoreCase(GuardianName);
        System.out.println("student = " + guardian);
    }
    @Test
    public void printStudentBasedOnFirstNameAndLastName(){
        String firstName = "John";
        String lastName = "osifo";
        List<Student> students = studentRepository.findByFirstNameIgnoreCaseAndLastNameIgnoreCase(firstName,lastName);
        System.out.println("student = " + students);
    }
}