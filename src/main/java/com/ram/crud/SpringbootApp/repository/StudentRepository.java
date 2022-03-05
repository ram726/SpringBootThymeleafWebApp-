package com.ram.crud.SpringbootApp.repository;

import com.ram.crud.SpringbootApp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query("select s from Student s where s.firstName like %?1% or s.lastName like %?1% or s.email like %?1%" )
    public List<Student> findAll(String keyword);

}
