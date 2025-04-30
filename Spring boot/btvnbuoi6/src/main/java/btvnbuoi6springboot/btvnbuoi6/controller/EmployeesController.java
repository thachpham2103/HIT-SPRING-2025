package btvnbuoi6springboot.btvnbuoi6.controller;

import btvnbuoi6springboot.btvnbuoi6.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecl")
public class EmployeesController {

  @Autowired
    private EmployeesService employeesService;


}
