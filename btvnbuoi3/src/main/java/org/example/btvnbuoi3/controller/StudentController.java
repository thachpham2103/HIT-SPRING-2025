package org.example.btvnbuoi3.controller;


import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import org.example.btvnbuoi3.entity.Student;
import org.example.btvnbuoi3.repository.StudentRepository;
import org.example.btvnbuoi3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;

@Controller
@RequestMapping("/sinhvien")
public class StudentController {
    @Autowired
   private final StudentService studentService;

    @Autowired
    private final StudentRepository studentRepository;

   public StudentController(StudentService studentService, StudentRepository studentRepository) {
       this.studentService = studentService;
       this.studentRepository = studentRepository;
   }

   @GetMapping("/")
   public String home(HttpServletRequest request) {
       return "home";
   }

   @PostMapping("/add")
    public String addStudent(HttpServletRequest request, Student student) {
       studentRepository.save(student);
       return "redirect:sinhvien/add";
   }

   @PostMapping("/delete")
    public String deleteStudent(HttpServletRequest attribute, @RequestParam long id) {
       Student student= new Student();
       student.setId(id);
       studentRepository.delete(student);
       return "redirect:/student";
   }

   @GetMapping("/edit")
    public String editStudent(HttpServletRequest attribute, @RequestParam int id ) {
       Student student= new Student();
       student.setId(id);
       Student studentById= studentRepository.findAll().get(id);
       attribute.setAttribute("student", studentById);
       return "edit";
   }
}
