package com.osifojohncode.school.management.application.repository;

import com.osifojohncode.school.management.application.entity.CourseMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {


}
