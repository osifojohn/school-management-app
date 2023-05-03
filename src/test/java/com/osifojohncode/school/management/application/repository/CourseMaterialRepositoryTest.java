package com.osifojohncode.school.management.application.repository;

import com.osifojohncode.school.management.application.entity.Course;
import com.osifojohncode.school.management.application.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

    @Test
    public void saveCourseMaterial(){
        Course course = Course.builder()
                .title("JAVA")
                .credit(6)
                .build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.google.com")
                .course(course)
                .build();

        repository.save(courseMaterial);

    }

    @Test
    public void printAllCoursesMaterial(){
     List<CourseMaterial> courseMaterialList =
             repository.findAll();
        System.out.println("courses material = " + courseMaterialList);

    }
}