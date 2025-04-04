package org.example.btvnbuoi4.controller;


import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.btvnbuoi4.entity.Student;
import org.example.btvnbuoi4.repository.StudentRepository;
import org.example.btvnbuoi4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/students")
@RequiredArgsConstructor
public class StudentController {

    @Autowired
    private final StudentRepository studentRepository;
    @Autowired
    private final StudentService studentService;

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @PostMapping("/create")
    public String addStudent(HttpServletRequest request,Student student) {
      studentRepository.save(student);
      return "create success";
    }

   @PutMapping("/update/{id}")
   public String updateStudent(@PathVariable long id, @RequestBody Student student) {
        return studentService.updateStudent(student, id);
   }

   @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable long id, @RequestBody Student student) {
        return studentService.deleteStudent(student,id);
   }

   @PostMapping("edit")
    public String editStudent(@RequestBody Student student, @PathVariable long id) {
        Student students=studentRepository.findById(id).get();
        students.setName(student.getName());
        students.setId(student.getId());
        studentRepository.save(students);
        return "edit success";
   }

}
