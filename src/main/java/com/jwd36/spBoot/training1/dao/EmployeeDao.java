package com.jwd36.spBoot.training1.dao;

import com.jwd36.spBoot.training1.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
