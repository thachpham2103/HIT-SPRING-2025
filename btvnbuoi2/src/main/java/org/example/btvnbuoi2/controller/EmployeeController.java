package org.example.btvnbuoi2.controller;
import jakarta.servlet.http.HttpServletRequest;
import org.example.btvnbuoi2.interfacea.EmployeesRepository;
import org.example.btvnbuoi2.model.Employee;
import org.example.btvnbuoi2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
     private EmployeeService employeeService;
    @Autowired
    private EmployeesRepository employeesRepository;

    public EmployeeController(EmployeeService employeeService) {
         this.employeeService = employeeService;
     }

    @GetMapping("/")
    public String home(HttpServletRequest request){
        return "redirect:select" ;
    }

     @GetMapping("/select")
    public String select(HttpServletRequest request) {
         List<Employee> employee= employeesRepository.findAll();
         request.setAttribute("employee", employee);
         return "index.html";
     }

     @GetMapping("/insert")
    public String insert(HttpServletRequest request, @ModelAttribute Employee employee) {
        employeesRepository.save(employee);
         System.out.println(employee.toString());
        return "redirect:/employee/select";
     }

     @GetMapping("/edit")
    public String edit(HttpServletRequest attributes, @RequestParam int id) {
              Employee employee= new Employee();
              employee.setId(id);
              Employee employeeById=employeesRepository.findAll().get(id);
              attributes.setAttribute("employeesByID",employeeById) ;
               return "redirect:/employees/select" ;
     }

     @PostMapping("/delete")
    public String delete(HttpServletRequest attributes, @RequestParam int id) {
         Employee employee= new Employee();
         employee.setId(id);
         employeesRepository.delete(employee);
         return "redirect:/employee/delete";
    }
    @GetMapping("/update")
    public String update(@ModelAttribute Employee employee) {
        employeesRepository.save(employee);
        return "redirect:/employee/select";
    }
}
