package org.example.btvnbuoi3.service;

import jakarta.persistence.Entity;
import lombok.*;
import org.example.btvnbuoi3.entity.Student;
import org.example.btvnbuoi3.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
   private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> getAllStudents() {
        return studentRepository.findAll();

    }
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }

    public void updateStudent(Student student) {
        studentRepository.save(student);
    }
}
