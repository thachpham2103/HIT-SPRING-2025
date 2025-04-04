package org.example.btvnbuoi4.service;

import org.example.btvnbuoi4.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    public String addStudent(Student student);
    String updateStudent(Student student,long id);
    String deleteStudent(Student student,long id);
    String editStudent(Student student, long id);
}
