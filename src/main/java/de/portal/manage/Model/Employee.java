package de.portal.manage.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.*;

@Entity
@Table(name = "employee", uniqueConstraints = @UniqueConstraint(columnNames = { "email" }, name = "employee"))
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name = "employee_name", nullable = false)
        @NonNull
        private String employeeName;

        @Column(name = "employee_first_name", nullable = false)
        @NonNull
        private String employeeFirstName;

        @Column(name = "employee_last_name", nullable = false)
        @NonNull
        private String employeeLastName;

        @Column(name = "date_of_birth", nullable = false)
        @NonNull
        private String dateOfBirth;

        @Column(name = "basic_salary", nullable = false)
        @NonNull
        private String basicSalary;

        @Column(name = "email", nullable = false)
        @NonNull
        private String email;

        @Column(name = "skills", nullable = false)
        @NonNull
        private String skills;

        @Column(name = "status", nullable = false)
        @NonNull
        private String status;

        @Column(name = "department", nullable = false)
        @NonNull
        private String department;

        public Employee(String employeeName, String employeeFirstName, String employeeLastName,
                        String dateOfBirth, String basicSalary, String email, String skills, String status,
                        String department) {
                super();
                this.employeeName = employeeName;
                this.employeeFirstName = employeeFirstName;
                this.employeeLastName = employeeLastName;
                this.dateOfBirth = dateOfBirth;
                this.basicSalary = basicSalary;
                this.email = email;
                this.skills = skills;
                this.status = status;
                this.department = department;
        }

}
