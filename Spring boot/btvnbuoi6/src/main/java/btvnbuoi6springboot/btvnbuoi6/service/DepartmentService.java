package btvnbuoi6springboot.btvnbuoi6.service;


import btvnbuoi6springboot.btvnbuoi6.dto.departmentDTO.DepartmentCreateRequest;
import btvnbuoi6springboot.btvnbuoi6.dto.departmentDTO.DepartmentUpdateRequest;
import btvnbuoi6springboot.btvnbuoi6.entity.Departments;
import btvnbuoi6springboot.btvnbuoi6.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

  public List<Departments> getDepartmants(long id){
      return departmentRepository.findAll();
  }

  public Departments createDepartmant(DepartmentCreateRequest request){

      Departments departments= new Departments();

      departments.setName(request.getName());
      departments.setDescription(request.getDescription());
      return departmentRepository.save(departments);
  }

  public  Departments updateDepartment(DepartmentUpdateRequest request, long id){

      Departments departments= (Departments) getDepartmants(id);
      departments.setName(request.getName());
      departments.setDescription(request.getDescription());
      return departmentRepository.save(departments);
  }

  public void deleteDepartment(long id){
      departmentRepository.deleteById(id);
  }
}
