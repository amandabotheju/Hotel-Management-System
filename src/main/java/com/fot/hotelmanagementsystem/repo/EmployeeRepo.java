package com.fot.hotelmanagementsystem.repo;

import com.fot.hotelmanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
