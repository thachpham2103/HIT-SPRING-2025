package btvnbuoi6springboot.btvnbuoi6.controller;


import btvnbuoi6springboot.btvnbuoi6.dto.departmentDTO.DepartmentCreateRequest;
import btvnbuoi6springboot.btvnbuoi6.dto.departmentDTO.DepartmentUpdateRequest;
import btvnbuoi6springboot.btvnbuoi6.dto.positionsDTO.PositionsUpdateRequest;
import btvnbuoi6springboot.btvnbuoi6.entity.Departments;
import btvnbuoi6springboot.btvnbuoi6.entity.Positions;
import btvnbuoi6springboot.btvnbuoi6.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dcp")
public class DepartmentController {

   @Autowired
    private DepartmentService departmentService;


   @GetMapping("/dep")
    List<Departments> getDepartments(@RequestParam long id){
       return departmentService.getDepartmants(id);
   }

   @PostMapping("/dep")
   Departments createDepartment(@RequestBody DepartmentCreateRequest request){
       return departmentService.createDepartmant(request);
   }

    @PutMapping("/{id}")
    public Departments updateDepartment(@PathVariable long id, @RequestBody DepartmentUpdateRequest request) {
        return departmentService.updateDepartment(request, id);
    }

    @DeleteMapping("/{id}")
    String deleteDepartment(@PathVariable long id){
       departmentService.deleteDepartment(id);
       return "thành công!!!";
    }
}
