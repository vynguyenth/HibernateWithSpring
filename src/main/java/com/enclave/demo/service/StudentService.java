package com.enclave.demo.service;

import com.enclave.demo.model.Student;

public interface StudentService {
    
    Student save(Student student);
    boolean findByLogin(String userName, String password);
    boolean findByUserName(String userName);
}
