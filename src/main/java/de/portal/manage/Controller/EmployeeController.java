package de.portal.manage.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class EmployeeController {
    
    @GetMapping("v1/hello")
    public String getHelloMessage() {
        return String.format("Hello Hr-Portal");
    }
}
