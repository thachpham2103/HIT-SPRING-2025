package btvnbuoi6springboot.btvnbuoi6.controller;


import btvnbuoi6springboot.btvnbuoi6.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dcp")
public class DepartmentController {

   @Autowired
    private DepartmentService departmentService;


}
