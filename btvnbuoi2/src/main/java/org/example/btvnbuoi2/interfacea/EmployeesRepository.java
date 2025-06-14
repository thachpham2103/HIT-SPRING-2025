package org.example.btvnbuoi2.interfacea;

import org.example.btvnbuoi2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee, Integer> {

}
