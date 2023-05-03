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
    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .email("johnosifotec@gmail.com ")
                .mobile("2345678901")
                .name("Sunday")
                .build();

        Student student = Student.builder()
                .emailId("ablejohn@gmail.com")
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

    @Test
    public void printgetStudentByEmailAddress(){
        String studentEmailAddress = "osifojohntec@gmail.com";
        Student student = studentRepository.getStudentByEmailAddress(studentEmailAddress);
        System.out.println("student = " + student);
    }

    @Test
    public void printgetStudentFirstNameByEmailAddress(){
        String studentEmailAddress = "osifojohntec@gmail.com";
        String studentFirstName = studentRepository.getStudentFirstNameByEmailAddress(studentEmailAddress);
        System.out.println("student = " + studentFirstName);
    }
    @Test
    public void printgetStudentByEmailAddressNative(){
        Student student =
                studentRepository.getStudentByEmailAddressNative(
                        "osifojohntec@gmail.com"
                );

        System.out.println("student = " + student);
    }

    @Test
    public void printgetStudentByEmailAddressNativeNamedParam() {
        Student student =
                studentRepository.getStudentByEmailAddressNativeNamedParam(
                        "osifojohntec@gmail.com"
                );

        System.out.println("student = " + student);
    }

    @Test
    public void updateStudentNameByEmailIdTest() {
        studentRepository.updateStudentNameByEmailId(
                "Solomon Francis",
                "osifojohntec@gmail.com");
    }
}