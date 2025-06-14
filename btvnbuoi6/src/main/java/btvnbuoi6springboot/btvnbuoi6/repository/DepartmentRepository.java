package btvnbuoi6springboot.btvnbuoi6.repository;

import btvnbuoi6springboot.btvnbuoi6.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Departments, Long> {
}
