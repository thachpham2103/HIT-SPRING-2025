package btvnbuoi6springboot.btvnbuoi6.controller;

import btvnbuoi6springboot.btvnbuoi6.dto.employeesDTO.EmployeesCreateRequest;
import btvnbuoi6springboot.btvnbuoi6.dto.employeesDTO.EmployeesUpdateRequest;
import btvnbuoi6springboot.btvnbuoi6.entity.Employees;
import btvnbuoi6springboot.btvnbuoi6.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ecl")
public class EmployeesController {

  @Autowired
    private EmployeesService employeesService;

  @GetMapping("/emp")
  List<Employees> getEmployees(@RequestParam long id){
    return employeesService.getEmployees(id);
  }

  @PostMapping("/emp")
  Employees createEmployees(@RequestBody EmployeesCreateRequest request){
    return employeesService.createEmployees(request);
  }

  @PutMapping("/{id}")
  public Employees updateEmployees(@PathVariable long id, @RequestBody EmployeesUpdateRequest request){
    return employeesService.updateEmployees(request, id);
  }

  @DeleteMapping("/{id}")
  String deleteEmployees(@PathVariable long id){
    employeesService.deleteDepartment(id);
    return "thành công!!!";
  }

  @GetMapping("/{employeesId}")
  Employees getEmployeesId(@PathVariable("employeesId") long id){
    return employeesService.getEmployeesId(id);
  }

  @GetMapping("/searchfull")
  public Employees getByFullName(@RequestParam("fullname") String fullname) {
    return employeesService.getFullName(fullname);
  }

  @GetMapping("/departmentId")
  public Optional<Employees> getByDepartment(@RequestParam("departmentId") long departmentId) {
    return employeesService.getByDepartmentId(departmentId);
  }

}
