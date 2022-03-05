package com.ram.crud.SpringbootApp.controller;

import com.ram.crud.SpringbootApp.entity.Student;
import com.ram.crud.SpringbootApp.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Controller
public class StudentController {

    private StudentService studentService;

    //get all students and return Model And View
    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    //add a student
    @GetMapping("/student/new")
    public String createStudent(Model model){

        //create student object to hold student form data
        Student student=new Student();
        model.addAttribute("studnet",student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/student/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student,Model model){

        //get student from database by id
        Student existingStudent=studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        //save updated student object
        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    //delete student
    @GetMapping("/student/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteById(id);
        return "redirect:/students";
    }

    @RequestMapping("/")
    public String searchStudent(Model model, @Param("keyword") String keyword){
//        List<Student> list=studentService.getAllStudents(keyword);
        model.addAttribute("students",studentService.getAllStudents(keyword));
        return "students";
    }
}
