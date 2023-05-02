package com.osifojohncode.school.management.application.repository;

import com.osifojohncode.school.management.application.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
 public List<Student> findByFirstNameIgnoreCase(String firstName);
 public   List<Student>  findByFirstNameIgnoreCaseAndLastNameIgnoreCase(String firstName, String lastName);

 public List<Student> findByFirstNameIgnoreCaseContaining(String name);

 public List<Student> findByGuardianNameIgnoreCase(String guardianName);

}
