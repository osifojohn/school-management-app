package com.osifojohncode.school.management.application.repository;

import com.osifojohncode.school.management.application.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
