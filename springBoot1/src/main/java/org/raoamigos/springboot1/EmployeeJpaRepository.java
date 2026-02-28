package org.raoamigos.springboot1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpaRepository extends JpaRepository<Employee,Integer> {
    Employee findByName(String name);
}
