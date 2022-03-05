package com.ram.crud.SpringbootApp.repository;

import com.ram.crud.SpringbootApp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
