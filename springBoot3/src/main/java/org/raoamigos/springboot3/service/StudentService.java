package org.raoamigos.springboot3.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.raoamigos.springboot3.entity.Student;
import org.raoamigos.springboot3.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Studnet Not Found"));
    }

    public String deleteStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);

        if(student.isPresent()) {
            studentRepository.deleteById(id);
        }
        return "Studnet Deleted";
    }

    public Student updateStudent(Long id, Student student) {
        Student existing = studentRepository.getStudentById(id);

        existing.setName(student.getName());
        existing.setEmail(student.getEmail());

        return studentRepository.save(existing);
    }

}
