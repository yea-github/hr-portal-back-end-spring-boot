package de.portal.manage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.portal.manage.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
