package de.portal.manage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.portal.manage.Model.Employee;
import de.portal.manage.Repository.EmployeeRepository;

@RestController
@RequestMapping("/api/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("v1/hello")
    public String getHelloMessage() {
        return String.format("Hello Hr-Portal");
    }

    @PostMapping("v1/save-employee")
    public Employee saveEmployee(
            @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
