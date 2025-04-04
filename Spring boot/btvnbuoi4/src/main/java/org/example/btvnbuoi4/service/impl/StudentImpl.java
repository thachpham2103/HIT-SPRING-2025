package org.example.btvnbuoi4.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.btvnbuoi4.entity.Student;
import org.example.btvnbuoi4.repository.StudentRepository;
import org.example.btvnbuoi4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentImpl implements StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student Successfully Add";
    }

    @Override
    public String updateStudent(Student student,long id ) {
       Student student1=studentRepository.findById(id).get();
       student1.setName(student.getName());
       student1.setEmail(student.getEmail());
       studentRepository.save(student1);
        return "Student Successfully updated";
    }

    @Override
    public String deleteStudent(Student student, long id) {
        studentRepository.delete(student);
        return "delete Successfully student";
    }

    @Override
    public String editStudent(Student student, long id) {
       Optional<Student> students=studentRepository.findById(id);
       Student student1=students.get();
       student1.setName(student.getName());
       student1.setEmail(student.getEmail());
       student1.setDateBirth(student.getDateBirth());
       student1.setGender(student.getGender());
//       student1.setModule(student.getModule());
         studentRepository.save(student1);
        return "edit Successfully student";
    }
}
