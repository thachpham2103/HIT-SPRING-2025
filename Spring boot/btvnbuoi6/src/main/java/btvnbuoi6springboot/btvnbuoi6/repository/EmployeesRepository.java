package btvnbuoi6springboot.btvnbuoi6.repository;

import btvnbuoi6springboot.btvnbuoi6.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {
    Optional<Employees> findByFullNameIgnoreCase(String fullName);
    Optional<Employees> findByDepartmentsId(Long departmentId);
    List<Employees> findAllByPositionsId(Long id);


}
