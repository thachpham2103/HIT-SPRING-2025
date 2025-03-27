package org.example.btvnbuoi2.service;

import org.example.btvnbuoi2.interfacea.EmployeesRepository;
import org.example.btvnbuoi2.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeesRepository employeesRepository;

    public EmployeeService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    public List<Employee> getAllEmployee(){
        return employeesRepository.findAll();
    }

    public void addEmployee(Employee employee) {
        employeesRepository.save(employee);
    }

    public void deleteEmployee(int id) {
        employeesRepository.deleteById(id);
    }

    public void updateEmployee(Employee employee) {
        employeesRepository.save(employee);
    }

    public void selectEmployee(int id) {
        Employee employee = employeesRepository.findById(id).get();
    }

    public void editEmployee(Employee employee) {
        employeesRepository.save(employee);
    }

    public void deleteEmployee(Employee employee) {
        employeesRepository.deleteById(employee.getId());
    }

}
