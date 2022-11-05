package kz.narxoz.springbootapp.controllers;
import kz.narxoz.springbootapp.models.Employee;
import kz.narxoz.springbootapp.services.EmployeeService;
import kz.narxoz.springbootapp.services.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }

    //@PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        //employeeService.saveEmployee(employee);
        return employee;
    }

    //@DeleteMapping("/employees/userid")
    public Employee deleteEmployee(@RequestBody Employee employee){
        //employeeService.saveEmployee(employee);
        return employee;
    }

    //@GetMapping("/employees/userid")
    public Employee getEmployee(@RequestBody Employee employee){
        //employeeService.saveEmployee(employee);
        return employee;
    }

}
