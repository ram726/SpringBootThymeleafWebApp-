package com.ram.crud.SpringbootApp.service;

import com.ram.crud.SpringbootApp.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);

    void deleteById(Long id);

}
