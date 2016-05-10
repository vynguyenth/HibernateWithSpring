package com.enclave.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.enclave.demo.model.Student;
import com.enclave.demo.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    
    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public boolean findByLogin(String userName, String password) {
        Student student = studentRepository.findByUserName(userName);
        
        if (student != null && student.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public boolean findByUserName(String userName) {
        Student student = studentRepository.findByUserName(userName);
        if (student != null) {
            return true;
        }
        return false;
    }

}
