package org.raoamigos.springboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeJpaRepository repo;

    @PostMapping("/create")
    public Employee create(@RequestBody Employee employee) {
        return repo.save(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @GetMapping("/getById/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
        Optional<Employee> emp = repo.findById(id);

        return emp.orElse(null);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable Integer id,
                                   @RequestBody Employee employee) {

        Optional<Employee> emp = repo.findById(id);

        if(emp.isPresent()) {
            Employee existing = emp.get();

            existing.setName(employee.getName());
            existing.setSalary(employee.getSalary());

            return repo.save(existing);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }

    @GetMapping("/getByName/{name}")
    public Employee getEmployeeByName(@PathVariable String name) {
        return repo.findByName(name);
    }


}
