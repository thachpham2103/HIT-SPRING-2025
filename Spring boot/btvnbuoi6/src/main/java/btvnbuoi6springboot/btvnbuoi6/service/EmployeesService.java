package btvnbuoi6springboot.btvnbuoi6.service;


import btvnbuoi6springboot.btvnbuoi6.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesService {

  @Autowired
    private EmployeesRepository employeesRepository;


}
