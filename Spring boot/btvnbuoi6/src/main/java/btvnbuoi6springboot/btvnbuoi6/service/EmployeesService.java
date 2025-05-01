package btvnbuoi6springboot.btvnbuoi6.service;


import btvnbuoi6springboot.btvnbuoi6.dto.employeesDTO.EmployeesCreateRequest;
import btvnbuoi6springboot.btvnbuoi6.dto.employeesDTO.EmployeesUpdateRequest;
import btvnbuoi6springboot.btvnbuoi6.entity.Employees;
import btvnbuoi6springboot.btvnbuoi6.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {

  @Autowired
    private EmployeesRepository employeesRepository;

  public List<Employees> getEmployees(long id){
    return employeesRepository.findAll();
  }

  public Employees createEmployees(EmployeesCreateRequest request){

    Employees employees= new Employees();

    employees.setFullName(request.getFullName());
    employees.setBirthday(request.getBirthday());
    employees.setHiredDate(request.getHiredDate());
    employees.setSalary(request.getSalary());

    return employeesRepository.save(employees);
  }

  public Employees updateEmployees(EmployeesUpdateRequest request, long id){

    Employees employees= (Employees) getEmployees(id);
    employees.setFullName(request.getFullName());
    employees.setBirthday(request.getBirthday());
    employees.setHiredDate(request.getHiredDate());
    employees.setSalary(request.getSalary());

    return employeesRepository.save(employees);

  }

  public void deleteDepartment(long id){
    employeesRepository.deleteById(id);
  }

  
}
