package org.example.btvnbuoi3.repository;

import org.example.btvnbuoi3.entity.Student;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Example<? extends Student> id(long id);
}
